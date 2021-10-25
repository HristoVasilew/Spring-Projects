package com.example.musicdb.service.impl;

import com.example.musicdb.model.entity.Album;
import com.example.musicdb.model.service.AlbumServiceModel;
import com.example.musicdb.model.view.AlbumViewModel;
import com.example.musicdb.repository.AlbumRepository;
import com.example.musicdb.security.CurrentUser;
import com.example.musicdb.service.AlbumService;
import com.example.musicdb.service.ArtistService;
import com.example.musicdb.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlbumServiceImpl implements AlbumService {
    private final AlbumRepository albumRepository;
    private final ModelMapper modelMapper;
    private final CurrentUser currentUser;
    private final UserService userService;
    private final ArtistService artistService;

    public AlbumServiceImpl(AlbumRepository albumRepository, ModelMapper modelMapper, CurrentUser currentUser, UserService userService, ArtistService artistService) {
        this.albumRepository = albumRepository;
        this.modelMapper = modelMapper;
        this.currentUser = currentUser;
        this.userService = userService;
        this.artistService = artistService;
    }


    @Override
    public void addOrder(AlbumServiceModel albumServiceModel) {
        Album album = modelMapper.map(albumServiceModel, Album.class);

        album.setArtist(artistService.findByName(albumServiceModel.getArtist()));
        album.setReleaseDate(albumServiceModel.getReleaseDate());
        album.setAddedFrom(userService.findById(currentUser.getId()));

        albumRepository.save(album);
    }

    @Override
    public List<AlbumViewModel> findAllAlbumsOrderByCopiesDesc() {
        return albumRepository
                .findAllByOrderByCopiesDesc()
                .stream()
                .map(album -> modelMapper.map(album, AlbumViewModel.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteAlbumById(Long id) {
        albumRepository.deleteById(id);
    }
}

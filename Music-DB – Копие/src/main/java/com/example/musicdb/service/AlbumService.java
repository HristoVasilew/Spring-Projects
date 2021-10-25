package com.example.musicdb.service;

import com.example.musicdb.model.binding.AlbumAddBindingModel;
import com.example.musicdb.model.service.AlbumServiceModel;
import com.example.musicdb.model.view.AlbumViewModel;

import java.util.List;

public interface AlbumService {

    void addOrder(AlbumServiceModel albumServiceModel);

    List<AlbumViewModel> findAllAlbumsOrderByCopiesDesc();

    void deleteAlbumById(Long id);
}

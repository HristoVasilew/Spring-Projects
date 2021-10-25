package com.example.musicdb.web;

import com.example.musicdb.model.view.AlbumViewModel;
import com.example.musicdb.security.CurrentUser;
import com.example.musicdb.service.AlbumService;
import com.example.musicdb.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private final CurrentUser currentUser;
    private final AlbumService albumService;
    private final UserService userService;

    public HomeController(CurrentUser currentUser, AlbumService albumService, UserService userService) {
        this.currentUser = currentUser;
        this.albumService = albumService;
        this.userService = userService;
    }


    @GetMapping()
    public String index(Model model){
        if (currentUser.getId()==null) {
            return "index";
        }

        List<AlbumViewModel> albums =
                albumService.findAllAlbumsOrderByCopiesDesc();

        model.addAttribute("copies",albums
                .stream()
                .map(AlbumViewModel::getCopies)
                .reduce(Integer::sum)
                .orElse(0));
        model.addAttribute("albums",albums);

        return "home";
    }

}

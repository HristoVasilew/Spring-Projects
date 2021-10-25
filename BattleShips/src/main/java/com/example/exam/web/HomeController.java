package com.example.exam.web;

import com.example.exam.model.binding.ShipAddBindingModel;
import com.example.exam.model.entity.User;
import com.example.exam.model.view.ShipViewModel;
import com.example.exam.security.CurrentUser;
import com.example.exam.service.ShipService;
import com.example.exam.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class HomeController {
    private final CurrentUser currentUser;
    private final ShipService shipService;
    private final UserService userService;

    public HomeController(CurrentUser currentUser, ShipService shipService, UserService userService) {
        this.currentUser = currentUser;
        this.shipService = shipService;
        this.userService = userService;
    }

    @GetMapping()
    public String index(Model model){

        if (currentUser.getId()==null) {
            return "index";
        }

        List<ShipViewModel> ships = shipService.findAllShips();
        List<User> users = userService.findAllUsers();

        model.addAttribute("ships",ships);

        model.addAttribute("users", users);

        return "home";

    }

    @ModelAttribute
    public ShipAddBindingModel shipAddBindingModel() {
        return new ShipAddBindingModel();
    }
}

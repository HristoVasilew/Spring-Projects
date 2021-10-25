package com.example.exam.service.impl;

import com.example.exam.model.entity.Ship;
import com.example.exam.model.entity.User;
import com.example.exam.model.service.ShipServiceModel;
import com.example.exam.model.view.ShipViewModel;
import com.example.exam.repository.ShipRepository;
import com.example.exam.security.CurrentUser;
import com.example.exam.service.CategoryService;
import com.example.exam.service.ShipService;
import com.example.exam.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShipServiceImpl implements ShipService {
    private final ShipRepository shipRepository;
    private final ModelMapper modelMapper;
    private final CurrentUser currentUser;
    private final UserService userService;
    private final CategoryService categoryService;

    public ShipServiceImpl(ShipRepository shipRepository, ModelMapper modelMapper, CurrentUser currentUser, UserService userService, CategoryService categoryService) {
        this.shipRepository = shipRepository;
        this.modelMapper = modelMapper;
        this.currentUser = currentUser;
        this.userService = userService;
        this.categoryService = categoryService;
    }

    @Override
    public void addShip(ShipServiceModel shipServiceModel) {
        Ship ship = modelMapper.map(shipServiceModel, Ship.class);
        ship.setUser(userService.findById(currentUser.getId()));
        ship.setCategory(categoryService.findByCategoryNameEnum(shipServiceModel.getCategory()));
        //ship.setCreated()

        shipRepository.save(ship);
    }

    @Override
    public List<ShipViewModel> findAllShips() {

        return shipRepository.findAll()
                .stream()
                .map(ship -> modelMapper.map(ship, ShipViewModel.class))
                .collect(Collectors.toList());

    }

    @Override
    public void reduceDefenderHealthWithThePowerOfLogedUserShip(ShipServiceModel shipServiceModel, User user) {
        Ship atacer = modelMapper.map(shipServiceModel, Ship.class);
        Ship def = shipRepository.findByUser(user);

        Integer power = atacer.getPower();
        Integer health = def.getHealth();
        def.setHealth(power-health);

        if (def.getHealth() <= 0){
            shipRepository.deleteById(def.getId());
        }

        shipRepository.save(def);

    }
}

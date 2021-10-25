package com.example.exam.service;

import com.example.exam.model.entity.User;
import com.example.exam.model.service.ShipServiceModel;
import com.example.exam.model.view.ShipViewModel;

import java.util.List;

public interface ShipService {
    void addShip(ShipServiceModel shipServiceModel);

    List<ShipViewModel> findAllShips();

    void reduceDefenderHealthWithThePowerOfLogedUserShip(ShipServiceModel shipServiceModel, User user);
}

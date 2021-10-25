package com.example.exam.model.view;

public class UserViewModel {

    private ShipViewModel atacer;
    private ShipViewModel def;

    public UserViewModel() {
    }

    public ShipViewModel getAtacer() {
        return atacer;
    }

    public UserViewModel setAtacer(ShipViewModel atacer) {
        this.atacer = atacer;
        return this;
    }

    public ShipViewModel getDef() {
        return def;
    }

    public UserViewModel setDef(ShipViewModel def) {
        this.def = def;
        return this;
    }
}

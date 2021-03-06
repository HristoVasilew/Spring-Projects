package com.example.exam.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "ships")
public class Ship extends BaseEntity{
    @Column(unique = true,nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer health;
    @Column(nullable = false)
    private Integer power;
    @Column(nullable = false)
    private LocalDate created;
    @ManyToOne
    private Category category;
    @ManyToOne
    private User user;


    public Ship() {
    }

    public String getName() {
        return name;
    }

    public Ship setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getHealth() {
        return health;
    }

    public Ship setHealth(Integer health) {
        this.health = health;
        return this;
    }

    public Integer getPower() {
        return power;
    }

    public Ship setPower(Integer power) {
        this.power = power;
        return this;
    }

    public LocalDate getCreated() {
        return created;
    }

    public Ship setCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Ship setCategory(Category category) {
        this.category = category;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Ship setUser(User user) {
        this.user = user;
        return this;
    }
}

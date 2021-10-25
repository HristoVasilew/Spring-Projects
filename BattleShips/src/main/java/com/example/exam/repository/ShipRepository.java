package com.example.exam.repository;

import com.example.exam.model.entity.Ship;
import com.example.exam.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Long> {
    Ship findByUser(User user);
}

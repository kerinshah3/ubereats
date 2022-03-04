package com.server.uber.eats.repository;

import com.server.uber.eats.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Integer> {}

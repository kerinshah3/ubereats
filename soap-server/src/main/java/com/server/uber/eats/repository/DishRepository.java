package com.server.uber.eats.repository;

import com.server.uber.eats.entity.Dish;
import org.springframework.data.repository.CrudRepository;

public interface DishRepository extends CrudRepository<Dish, Integer> {}

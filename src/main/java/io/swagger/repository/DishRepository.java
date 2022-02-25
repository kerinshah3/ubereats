package io.swagger.repository;

import io.swagger.entity.Dish;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Integer> {
}

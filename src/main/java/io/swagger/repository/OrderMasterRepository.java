package io.swagger.repository;

import io.swagger.entity.Order;
import io.swagger.model.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterRepository extends JpaRepository<Order,Long> {
}

package com.server.uber.eats.repository;

import com.server.uber.eats.entity.OrderMaster;
import org.hibernate.annotations.SQLUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrderMasterRepository extends CrudRepository<OrderMaster,Integer> {

    @Modifying
    @Transactional
    @Query(value = "update order_master set order_status =:orderStatus  where order_id = :orderId",nativeQuery = true)
    void updateReadyStatus(@Param("orderStatus") String orderStatus , @Param("orderId") Integer orderId);


}

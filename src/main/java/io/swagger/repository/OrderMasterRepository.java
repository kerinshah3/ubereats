package io.swagger.repository;

import io.swagger.entity.OrderDetail;
import io.swagger.entity.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderMasterRepository extends JpaRepository<OrderMaster,Long> {

    @Query(value = "select count(*) from order_master where cust_id = :custId and order_status = 'cart'" , nativeQuery = true)
    Integer getOrderForCustomer(@Param("custId") Integer custId);

    @Query(value = "select * from order_master where cust_id = :custId and order_status = 'cart'" , nativeQuery = true)
    OrderMaster getOrderMasterId(@Param("custId") Integer custId);

}

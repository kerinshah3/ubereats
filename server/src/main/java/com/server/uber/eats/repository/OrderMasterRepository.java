package com.server.uber.eats.repository;

import com.server.uber.eats.entity.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrderMasterRepository extends JpaRepository<OrderMaster,Integer> {
//
//    @Query(value = "select count(*) from order_master where cust_id = :custId and order_status = 'cart'" , nativeQuery = true)
//    Integer getOrderForCustomer(@Param("custId") Integer custId);
//
//    @Query(value = "select * from order_master where cust_id = :custId and order_status = 'cart'" , nativeQuery = true)
//    OrderMaster getOrderMasterId(@Param("custId") Integer custId);
//
//    @Modifying
//    @Transactional
//    @Query(value = "update order_master set order_status =:orderStatus , order_amt =:orderAmt where order_id = :orderId",nativeQuery = true)
//    void updateOrderStatus(@Param("orderStatus") String orderStatus, @Param("orderAmt") double orderAmt,@Param("orderId") Integer orderId);

    @Modifying
    @Transactional
    @Query(value = "update order_master set order_status =:orderStatus  where order_id = :orderId",nativeQuery = true)
    void updateReadyStatus(@Param("orderStatus") String orderStatus , @Param("orderId") Integer orderId);

}

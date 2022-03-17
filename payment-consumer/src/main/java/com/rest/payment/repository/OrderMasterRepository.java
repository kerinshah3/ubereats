package com.rest.payment.repository;

import com.rest.payment.entity.OrderMaster;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

@Repository
public interface OrderMasterRepository extends CrudRepository<OrderMaster, Integer> {

    @Modifying
    @Transactional
    @Query(value = "update order_master set order_status =:orderStatus  where order_id = :orderId", nativeQuery = true)
    void updateReadyStatus(@Param("orderStatus") String orderStatus, @Param("orderId") Integer orderId);

    @Query(
            value = "select count(*) from order_master where cust_id = :custId and order_status = 'cart'",
            nativeQuery = true)
    Integer getDishCountForCustomer(@Param("custId") Integer custId);

    @Query(value = "select * from order_master where cust_id = :custId and order_status = 'cart'", nativeQuery = true)
    OrderMaster getOrderMasterId(@Param("custId") Integer custId);

    @Transactional
    @Modifying
    @Query(
            value =
                    "update order_master set order_status = 'order_placed', order_amt = :orderTotalAmt, order_ts = :order_ts where cust_id = :custId and order_id = :orderId and order_status = 'cart'",
            nativeQuery = true)
    Integer updateOrderMasterStatus(
            @Param("custId") Integer custId,
            @Param("orderId") Integer orderId,
            @Param("orderTotalAmt") Double orderTotalAmt,
            @Param("order_ts") Timestamp date);

    @Transactional
    @Modifying
    @Query(
            value =
                    "update order_master set order_status = 'Payment Done' where order_id = :orderId ",
            nativeQuery = true)
    Integer updateOrderMasterPaymentStatus(
            @Param("orderId") Integer orderId);
}

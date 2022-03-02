package io.uber.eats.repository;

import io.uber.eats.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface OrderDetailsRepository extends JpaRepository<OrderDetail,Long> {
    @Modifying
    @Transactional
    @Query(value = "insert into order_details (prod_qty,dish_id,order_id,prod_total_amt) values (:pro_qty , :dish_id , :order_id , :prodAmt)" , nativeQuery = true)
    void insertIntoOrderDetails(@Param("pro_qty") int pro_qty, @Param("dish_id") int dish_id, @Param("order_id") int order_id , @Param("prodAmt") double prodAmt  );


    @Query(value = "select sum(prod_total_amt) from order_details where order_id =:orderId", nativeQuery = true)
    Integer getSumOfTotalAmountForParticularOrder(@Param("orderId") Integer orderId);

}

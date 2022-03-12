package com.rest.payment.repository;

import com.rest.payment.entity.Payment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Integer> {

    @Query(value = "select count(*) from payment where order_id =:orderId limit 1", nativeQuery = true)
    Integer checkPayment(@Param("orderId") Integer id);
}

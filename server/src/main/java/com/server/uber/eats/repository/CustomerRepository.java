package com.server.uber.eats.repository;

import com.server.uber.eats.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {}

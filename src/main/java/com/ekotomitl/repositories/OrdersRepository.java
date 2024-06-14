package com.ekotomitl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ekotomitl.models.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

}

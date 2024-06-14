package com.ekotomitl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ekotomitl.models.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}

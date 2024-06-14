package com.ekotomitl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ekotomitl.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

package com.BankSystem.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BankSystem.accounts.Entity.customer;

@Repository
public interface customerRepository extends JpaRepository<customer, Long> {

}

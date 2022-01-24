package com.stark.springboothibernateonetoone.dao;

import com.stark.springboothibernateonetoone.entity.BankDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankDao extends JpaRepository<BankDetails, Integer> {
}

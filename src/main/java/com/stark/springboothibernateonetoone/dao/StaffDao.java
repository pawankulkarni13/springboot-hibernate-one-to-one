package com.stark.springboothibernateonetoone.dao;

import com.stark.springboothibernateonetoone.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffDao extends JpaRepository<Staff, Integer> {
}

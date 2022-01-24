package com.stark.springboothibernateonetoone.dao;

import com.stark.springboothibernateonetoone.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
}

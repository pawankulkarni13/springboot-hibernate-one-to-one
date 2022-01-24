package com.stark.springboothibernateonetoone.controller;

import com.stark.springboothibernateonetoone.dao.AddressDao;
import com.stark.springboothibernateonetoone.dao.StudentDao;
import com.stark.springboothibernateonetoone.entity.Address;
import com.stark.springboothibernateonetoone.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentDao studentDao;

    @Autowired
    private AddressDao addressDao;

    @GetMapping(value = "/students")
    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    @GetMapping(value = "/address")
    public List<Address> getAllAddress() {
        return addressDao.findAll();
    }
}

package com.stark.springboothibernateonetoone.controller;

import com.stark.springboothibernateonetoone.dao.BankDao;
import com.stark.springboothibernateonetoone.dao.StaffDao;
import com.stark.springboothibernateonetoone.entity.BankDetails;
import com.stark.springboothibernateonetoone.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StaffController {

    @Autowired
    private StaffDao staffDao;

    @Autowired
    private BankDao bankDao;

    @GetMapping(value = "/staff")
    public List<Staff> getAllStaffDetails() {
        return staffDao.findAll();
    }

    @GetMapping(value = "/staff/bank")
    List<BankDetails> getAllStaffBankDetails() {
        return bankDao.findAll();
    }

}

package com.stark.springboothibernateonetoone.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "bank_details")
public class BankDetails {
    @Id
    @Column(name = "staff_id")
    Integer id;

    @Column(name = "account_number")
    String accountNumber;

    @Column(name = "ifsc_code")
    String ifsc;

    @Column(name = "bank_name")
    String bankName;

    @OneToOne(mappedBy="bankDetails", cascade= CascadeType.ALL)
    @JsonBackReference
    Staff staff;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}

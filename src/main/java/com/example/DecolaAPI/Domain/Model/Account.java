package com.example.DecolaAPI.Domain.Model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(nullable = false, scale = 2, precision = 13)
    private BigDecimal balance;

    @Column(name = "additional_limit", nullable = false, scale = 2, precision = 13)
    private BigDecimal limit;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}

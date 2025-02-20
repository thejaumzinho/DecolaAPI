package com.example.DecolaAPI.Domain.Model;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit", scale = 2, precision = 13)
    private BigDecimal limit;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}

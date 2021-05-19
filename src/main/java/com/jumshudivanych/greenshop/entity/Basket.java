package com.jumshudivanych.greenshop.entity;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Basket {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String date; // Время

    public Basket() {
    }

    public Basket(String date) {

        this.date = date;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

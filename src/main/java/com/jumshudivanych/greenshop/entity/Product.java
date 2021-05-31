package com.jumshudivanych.greenshop.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String productName;

    private Float price; //Цена

    private String unit; // Ед. измерения товара

    private String img; //Изображение

    private String productMessage; //Описание товара

    private String quantity; // Количество товара


    public Product() {
    }

    public Product(String productName, Float price, String unit, String img, String productMessage, String quantity) {
        this.productName = productName;
        this.price = price;
        this.unit = unit;
        this.img = img;
        this.productMessage = productMessage;
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                ", img='" + img + '\'' +
                ", productMessage='" + productMessage + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getProductMessage() {
        return productMessage;
    }

    public void setProductMessage(String productMessage) {
        this.productMessage = productMessage;
    }
}

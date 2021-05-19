package com.jumshudivanych.greenshop.entity;

import javax.persistence.*;

@Entity
public class Productinorder {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String productName;

    private Float price; //Цена

    private String unit; // Ед. измерения товара

    private String img; //Изображение

    private String productMessage; //Описание товара

    private int quantity; // Количество товара

    private Long basketId; // Номер корзины (Заказа)

    public Productinorder() {
    }

    public Productinorder(String productName, Float price, String unit, String img, String productMessage, int quantity, Long basketId) {
        this.productName = productName;
        this.price = price;
        this.unit = unit;
        this.img = img;
        this.productMessage = productMessage;
        this.quantity = quantity;
        this.basketId = basketId;
    }

    public Long getBasketId() {
        return basketId;
    }

    public void setBasketId(Long basketId) {
        this.basketId = basketId;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

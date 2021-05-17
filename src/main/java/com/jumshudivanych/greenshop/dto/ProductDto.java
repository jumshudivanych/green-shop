package com.jumshudivanych.greenshop.dto;

import com.jumshudivanych.greenshop.entity.Product;

public class ProductDto {

    private Long id;
    private String productName;
    private Float price;
    private String unit;
    private String img;
    private String productMessage;

    private Boolean meLiked;

    public ProductDto(Product product, Boolean meLiked) {
        this.id = product.getId();
        this.productName = product.getProductName();
        this.price = product.getPrice();
        this.unit = product.getUnit();
        this.img = product.getImg();
        this.productMessage = product.getProductMessage();
        this.meLiked = meLiked;
    }

    //public String getAuthorName() {
    //    return MessageHelper.getAuthorName(author);
    //}

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Float getPrice() {
        return price;
    }

    public String getUnit() {
        return unit;
    }

    public String getImg() {
        return img;
    }

    public String getProductMessage() {
        return productMessage;
    }

    public Boolean getMeLiked() {
        return meLiked;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "id=" + id +
                ", product=" + productName +
                ", price=" + price +
                ", meLiked=" + meLiked +
                '}';
    }
}

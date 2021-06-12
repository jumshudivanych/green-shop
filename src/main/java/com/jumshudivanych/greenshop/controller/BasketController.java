package com.jumshudivanych.greenshop.controller;


import com.jumshudivanych.greenshop.entity.Basket;
import com.jumshudivanych.greenshop.entity.Product;
import com.jumshudivanych.greenshop.entity.Productinorder;
import com.jumshudivanych.greenshop.repos.BasketRepository;
import com.jumshudivanych.greenshop.repos.ProductRepository;
import com.jumshudivanych.greenshop.repos.ProductinorderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Controller
public class BasketController {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ProductinorderRepository productinorderRepository;

    @Autowired
    private BasketRepository basketRepository;



    @GetMapping("/basket")
    public String createBasket(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' HH:mm:ss zzz");
        String date = formatForDateNow.format(dateNow);
        model.addAttribute("date", date);
        return "basket";
    }
    /*
    * Метод добавления товара в корзину по id и сохранение заказа в db
     */
   // @PostMapping("/basket/{id}")

        // добавление товара в корзину
        // Save
        @PostMapping("/basket")
                public  String addProduct(@RequestParam(name="productName", required=false) String productName, @RequestParam(name="price", required=false) Float price, @RequestParam(name="unit", required=false) String unit, @RequestParam(name="img", required=false) String img, @RequestParam(name="productMessage", required=false) String productMessage, @RequestParam(name="quantity", required=false) String quantity, Model model) {

            // создание корзины заказа и получение id
            Date dateNow = new Date();
            SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' HH:mm:ss zzz");
            String date = formatForDateNow.format(dateNow);

            Basket basket = new Basket(date);
            Long basketId = basket.getId();
            basketRepository.save(basket);
            Productinorder productinorder = new Productinorder(productName, price, unit, img, productMessage, quantity, basketId);

            productinorderRepository.save(productinorder);

            return "redirect:/testhome";
        }

    /*
    @GetMapping("/basket/item1")
    public String addItem1(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);

        String productName = "Апельсины";
        Float price = 30f;
        String unit = "кг";
        String img = "images/f-1.jpg";
        String productMessage = "Заказать и оплатить";
        model.addAttribute("productName", productName);
        model.addAttribute("price", price);
        model.addAttribute("unit", unit);
        model.addAttribute("img", img);
        model.addAttribute("productMessage", productMessage);

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' HH:mm:ss zzz");
        String date = formatForDateNow.format(dateNow);
        model.addAttribute("date", date);
        return "product";
    }
    */

}

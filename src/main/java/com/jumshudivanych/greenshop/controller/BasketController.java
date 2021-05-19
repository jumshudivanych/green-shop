package com.jumshudivanych.greenshop.controller;


import com.jumshudivanych.greenshop.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class BasketController {

    @Autowired
    private ProductRepository repository;



    @GetMapping("/basket")
    public String createBasket(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' HH:mm:ss zzz");
        String date = formatForDateNow.format(dateNow);
        model.addAttribute("date", date);
        return "basket";
    }

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


}

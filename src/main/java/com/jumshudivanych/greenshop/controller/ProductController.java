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
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("/product")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "product";
    }

    @GetMapping("/item1")
    public String addItem1(Model model) {

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

        /*
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' HH:mm:ss zzz");
        String date = formatForDateNow.format(dateNow);
        model.addAttribute("date", date);

         */
        return "product";
    }

    @GetMapping("/item2")
    public String addItem2(Model model) {

        String productName = "Черника";
        Float price = 30f;
        String unit = "кг";
        String img = "images/f-2.jpg";
        String productMessage = "Заказать и оплатить";
        model.addAttribute("productName", productName);
        model.addAttribute("price", price);
        model.addAttribute("unit", unit);
        model.addAttribute("img", img);
        model.addAttribute("productMessage", productMessage);

        /*
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' HH:mm:ss zzz");
        String date = formatForDateNow.format(dateNow);
        model.addAttribute("date", date);

         */
        return "product";
    }

    @GetMapping("/item3")
    public String addItem3(Model model) {

        String productName = "Бананы";
        Float price = 30f;
        String unit = "кг";
        String img = "images/f-3.jpg";
        String productMessage = "Заказать и оплатить";
        model.addAttribute("productName", productName);
        model.addAttribute("price", price);
        model.addAttribute("unit", unit);
        model.addAttribute("img", img);
        model.addAttribute("productMessage", productMessage);

        /*
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' HH:mm:ss zzz");
        String date = formatForDateNow.format(dateNow);
        model.addAttribute("date", date);

         */
        return "product";
    }

    @GetMapping("/item4")
    public String addItem4(Model model) {

        String productName = "Яблоки";
        Float price = 30f;
        String unit = "кг";
        String img = "images/f-4.jpg";
        String productMessage = "Заказать и оплатить";
        model.addAttribute("productName", productName);
        model.addAttribute("price", price);
        model.addAttribute("unit", unit);
        model.addAttribute("img", img);
        model.addAttribute("productMessage", productMessage);

        /*
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' HH:mm:ss zzz");
        String date = formatForDateNow.format(dateNow);
        model.addAttribute("date", date);

         */
        return "product";
    }

    @GetMapping("/item5")
    public String addItem5(Model model) {

        String productName = "Манго";
        Float price = 30f;
        String unit = "кг";
        String img = "images/f-2.jpg";
        String productMessage = "Заказать и оплатить";
        model.addAttribute("productName", productName);
        model.addAttribute("price", price);
        model.addAttribute("unit", unit);
        model.addAttribute("img", img);
        model.addAttribute("productMessage", productMessage);

        /*
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' HH:mm:ss zzz");
        String date = formatForDateNow.format(dateNow);
        model.addAttribute("date", date);

         */
        return "product";
    }

    @GetMapping("/item6")
    public String addItem6(Model model) {

        String productName = "Клубника";
        Float price = 30f;
        String unit = "кг";
        String img = "images/f-6.jpg";
        String productMessage = "Заказать и оплатить";
        model.addAttribute("productName", productName);
        model.addAttribute("price", price);
        model.addAttribute("unit", unit);
        model.addAttribute("img", img);
        model.addAttribute("productMessage", productMessage);

        /*
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' HH:mm:ss zzz");
        String date = formatForDateNow.format(dateNow);
        model.addAttribute("date", date);

         */
        return "product";
    }
}

package com.jumshudivanych.greenshop.controller;

import com.jumshudivanych.greenshop.entity.Product;
import com.jumshudivanych.greenshop.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("/, /home")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);

        //Iterable<Product> products = repository.findAll();
        model.addAttribute("products", repository.findAll());
        //model.addAttribute("product1", repository.findById(1l));
        //model.addAttribute("product2", repository.findById(2l));
        //model.addAttribute("product3", repository.findById(3l));
        //model.addAttribute("product4", repository.findById(4l));
        //model.addAttribute("product5", repository.findById(5l));
        //model.addAttribute("product6", repository.findById(6l));
        return "home";
    }
}

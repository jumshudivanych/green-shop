package com.jumshudivanych.greenshop.controller;


import com.jumshudivanych.greenshop.repos.BasketRepository;
import com.jumshudivanych.greenshop.repos.ProductRepository;
import com.jumshudivanych.greenshop.repos.ProductinorderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductlistController {

    @Autowired
    private ProductinorderRepository productinorderRepository;

    @Autowired
    private BasketRepository basketrepository;

    @GetMapping("/productList")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "order";
    }
}

package com.jumshudivanych.greenshop.controller;

import com.jumshudivanych.greenshop.entity.Product;
import com.jumshudivanych.greenshop.entity.Productinorder;
import com.jumshudivanych.greenshop.repos.ProductRepository;
import com.jumshudivanych.greenshop.repos.ProductinorderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class AdminController {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ProductinorderRepository productinorderRepository;


    @GetMapping("/admin")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);

        Iterable<Productinorder> productinorders = productinorderRepository.findAll();
        model.addAttribute("orders", productinorders);

        //Iterable<Product> products = repository.findAll();

        model.addAttribute("products", repository.findAll());
        return "admin";
    }

    // Обработка формы с добавлением товара
    @PostMapping("/addProduct")
    public String addProduct(@RequestParam(name="productName", required=false) String productName, @RequestParam(name="price", required=false) Float price, @RequestParam(name="unit", required=false) String unit, @RequestParam(name="img", required=false) String img, @RequestParam(name="productMessage", required=false) String productMessage, @RequestParam(name="quantity", required=false) String quantity, Model model) {

        Product product = new Product(productName, price, unit, img, productMessage, quantity);
        repository.save(product);
        model.addAttribute("productName", productName);
        model.addAttribute("price", price);
        model.addAttribute("unit", unit);
        model.addAttribute("img", img);
        model.addAttribute("productMessage", productMessage);
        model.addAttribute("quantity", quantity);
        return "redirect:/admin";
    }

    // Удаление товара по id
    @PostMapping("/deleteProduct")
    public String deleteProduct(@RequestParam(name="id", required=false) Long id, Model model) {

        repository.deleteById(id);
        //model.addAttribute("quantity", quantity);
        return "redirect:/admin";
    }
}

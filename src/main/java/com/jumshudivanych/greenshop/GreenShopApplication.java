package com.jumshudivanych.greenshop;

import com.jumshudivanych.greenshop.entity.Product;
import com.jumshudivanych.greenshop.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GreenShopApplication {
//public class GreenShopApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(GreenShopApplication.class, args);
	}

	// Первоначальное заполнение таблицы в базе данных product
	// init bean to insert 6 product into h2 database.
	@Bean
	CommandLineRunner initDatabase(ProductRepository repository) {
		return args -> {
			repository.save(new Product("Катрофель", 30f, "кг", "img/kartoplya.jpg", "Молодой, экологически чистый картофель.", 1));
			repository.save(new Product("Морковь", 30f, "кг", "img/morkov.jpg", "Источник витаминов.", 1));
			repository.save(new Product("Капуста белокочанная", 30f, "кг", "img/kapustabel.jpg", "Без капусты животы пусты. Без капусты щи не густы.", 1));
			repository.save(new Product("Лук репчатый", 30f, "кг", "img/luk.jpg", "Лук Россия", 1));
			repository.save(new Product("Томаты", 30f, "кг", "img/tomat.jpg", "Томаты Россия", 1));
			repository.save(new Product("Перец", 30f, "кг", "img/perec.jpg", "Перец сладкий", 1));
			};
	}
	/*
	@Override
	public void run(String... args) {

		repository.save(new Product("Катрофель", 30f, "кг", "img/kartoplya.jpg", "Молодой, экологически чистый картофель."));
		repository.save(new Product("Морковь", 30f, "кг", "img/morkov.jpg", "Источник витаминов."));
		repository.save(new Product("Капуста белокочанная", 30f, "кг", "img/kapustabel.jpg", "Без капусты животы пусты. Без капусты щи не густы."));
		repository.save(new Product("Лук репчатый", 30f, "кг", "img/luk.jpg", "Лук Россия"));
		repository.save(new Product("Томаты", 30f, "кг", "img/tomat.jpg", "Томаты Россия"));
		repository.save(new Product("Перец", 30f, "кг", "img/perec.jpg", "Перец сладкий"));

		System.out.println("\nfindAll()");
		repository.findAll().forEach(x -> System.out.println(x));

		System.out.println("\nfindById(1L)");
		repository.findById(1l).ifPresent(x -> System.out.println(x));

		System.out.println("\nfindByName('Node')");
		repository.findByName("Node").forEach(x -> System.out.println(x));

	}
    */
}

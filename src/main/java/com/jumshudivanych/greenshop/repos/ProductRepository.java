package com.jumshudivanych.greenshop.repos;

import com.jumshudivanych.greenshop.dto.ProductDto;
import com.jumshudivanych.greenshop.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {


    List<Product> findByProductName(String productName);
    /*
    @Query("select new com.jumshudivanych.greenshop.dto.ProductDto(" +
            "   m, " +
            "   count(ml), " +
            "   sum(case when ml = :user then 1 else 0 end) > 0" +
            ") " +
            "from Message m left join m.likes ml " +
            "group by m")
    Page<ProductDto> findAll(Pageable pageable, @Param("product") Product product);

    @Query("select new com.jumshudivanych.greenshop.dto.ProductDto(" +
            "   m, " +
            "   count(ml), " +
            "   sum(case when ml = :user then 1 else 0 end) > 0" +
            ") " +
            "from Message m left join m.likes ml " +
            "where m.tag = :tag " +
            "group by m")
    Page<ProductDto> findByTag(@Param("tag") String tag, Pageable pageable, @Param("user") User user);

    @Query("select new com.jumshudivanych.greenshop.dto.ProductDto(" +
            "   m, " +
            "   count(ml), " +
            "   sum(case when ml = :user then 1 else 0 end) > 0" +
            ") " +
            "from Message m left join m.likes ml " +
            "where m.author = :author " +
            "group by m")
    Page<ProductDto> findByUser(Pageable pageable, @Param("author") User author, @Param("user") User user);
    */
}


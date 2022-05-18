package com.miu.swa.microserviceapp.stock.controller;

import com.miu.swa.microserviceapp.stock.domain.Stock;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @Value("${greeting}")
    private String message;

    @RequestMapping("/")
    public String greeting() {
        return message;
    }

    @RequestMapping("/stocks/{product-number}")
    public Stock getStockByProductNumber(@PathVariable("product-number") Integer productNumber) {
        return new Stock(1, productNumber, 100);
    }
}

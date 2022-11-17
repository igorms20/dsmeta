package com.devsuperior.dsmeta.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.model.Sale;
import com.devsuperior.dsmeta.services.SaleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sales")
@RequiredArgsConstructor
public class SaleController {
    
    private final SaleService saleService;
    
    @GetMapping
    public List<Sale> findSales() {
	return saleService.findSales();
    }

}

package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmeta.model.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaleService {
    
    @Autowired
    private final SaleRepository saleRepository;

    @Transactional
    public List<Sale> findSales() {
	
	return saleRepository.findAll();
    }
    
    
    
}

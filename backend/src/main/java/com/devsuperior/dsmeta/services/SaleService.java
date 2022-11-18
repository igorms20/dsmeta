package com.devsuperior.dsmeta.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmeta.model.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

import lombok.RequiredArgsConstructor;

@Service
public class SaleService {
    
    @Autowired
    private SaleRepository saleRepository;

    @Transactional
    public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
	
	LocalDate min = LocalDate.parse(minDate);
	LocalDate max = LocalDate.parse(maxDate);
	
	
	return saleRepository.findSales(min, max, pageable);
    }
    
    
    
}

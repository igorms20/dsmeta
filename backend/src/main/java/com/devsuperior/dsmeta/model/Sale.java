package com.devsuperior.dsmeta.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sellerName;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    public Sale() {
    }

    public Long getId() {
        return id;
    }

    public String getSellerName() {
        return sellerName;
    }

    public Integer getVisited() {
        return visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }
}

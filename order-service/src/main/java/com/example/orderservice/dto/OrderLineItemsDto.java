package com.example.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {
    private Long id;
    //SKU are retailer codes that track product , manufacturer , and price information
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}

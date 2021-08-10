package com.example.orderservice.vo;

import lombok.Data;

import java.util.Date;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseOrder {
    private String productId;
    private String productName;
    private Integer stock;
    private Integer unitPrice;
    private Date createdAt;
}

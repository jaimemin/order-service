package com.tistory.jaimemin.orderservice.vo;

import lombok.Data;

@Data
public class RequestOrder {

    private String productId;

    private Integer quantity;

    private Integer unitPrice;
}

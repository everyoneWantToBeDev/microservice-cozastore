package com.cozastore.orderservice.dto;

import lombok.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Long id;
    private String orderNo;
    private Long userId;
    private String productId;
    private BigDecimal price;
    private int quantity;
    private int status;
    private Timestamp createdDate;
}

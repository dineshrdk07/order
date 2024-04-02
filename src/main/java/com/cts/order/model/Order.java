package com.cts.order.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Order {
    private long orderId;
    private String customerName;
    private Date orderDate;
    private double totalAmount;
}

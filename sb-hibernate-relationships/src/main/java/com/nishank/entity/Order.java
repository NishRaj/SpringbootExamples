package com.nishank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Order {

    @Id
    private Long id;

    private String orderNumber;
    private Date orderCreatedDate;
    private Date orderDeliveryDate;
    private ShippingAdress address;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderCreatedDate() {
        return orderCreatedDate;
    }

    public void setOrderCreatedDate(Date orderCreatedDate) {
        this.orderCreatedDate = orderCreatedDate;
    }

    public Date getOrderDeliveryDate() {
        return orderDeliveryDate;
    }

    public void setOrderDeliveryDate(Date orderDeliveryDate) {
        this.orderDeliveryDate = orderDeliveryDate;
    }

    public ShippingAdress getAddress() {
        return address;
    }

    public void setAddress(ShippingAdress address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

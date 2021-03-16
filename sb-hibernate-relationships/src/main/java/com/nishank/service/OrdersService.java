package com.nishank.service;

import com.nishank.model.OrderModel;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrdersService {

    public void saveOrder(OrderModel order);
    public OrderModel getOrder(Long orderId);
    public List<OrderModel> getOrders();
}

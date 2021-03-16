package com.nishank.service.impl;

import com.nishank.entity.Order;
import com.nishank.mapper.OrdersMapper;
import com.nishank.model.OrderModel;
import com.nishank.repository.OrderRepository;
import com.nishank.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public void saveOrder(OrderModel orderModel) {
        Order order = OrdersMapper.INSTANCE.orderModelToEntity(orderModel);
        orderRepository.save(order);
    }

    @Override
    public OrderModel getOrder(Long orderId) {
       Optional<Order> order = orderRepository.findById(orderId);
       OrderModel orderModel;
       if(order.isPresent()){
           orderModel = OrdersMapper.INSTANCE.orderEntityToModel(order.get());
       }else{
           throw new RuntimeException("No Order is present");
       }
        return orderModel;
    }

    @Override
    public List<OrderModel> getOrders() {
       Optional<List<Order>> orderList = Optional.of(orderRepository.findAll());
       List<OrderModel> orderModelList;
       if(orderList.isPresent()){
           orderModelList = OrdersMapper.INSTANCE.orderEntityListToModel(orderList.get());
       }else{
           throw new RuntimeException("Orders are Empty");
       }
       return orderModelList;
    }
}

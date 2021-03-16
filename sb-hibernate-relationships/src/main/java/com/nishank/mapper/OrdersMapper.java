package com.nishank.mapper;

import com.nishank.entity.Order;
import com.nishank.model.OrderModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrdersMapper {
    OrdersMapper INSTANCE = Mappers.getMapper( OrdersMapper.class );
    public Order orderModelToEntity(OrderModel orderModel);
    public OrderModel orderEntityToModel(Order order);
    public List<Order> orderModelListToEntity(List<OrderModel> orderModelList);
    public List<OrderModel> orderEntityListToModel(List<Order> order);
}

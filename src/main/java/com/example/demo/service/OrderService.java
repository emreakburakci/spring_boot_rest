package com.example.demo.service;

import com.example.demo.repository.OrderRepository;
import com.example.demo.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService
{

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public void createOrder(Order order){

        orderRepository.save(order);

    }
}

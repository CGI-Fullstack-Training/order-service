package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Order;

public interface OrderService {
	
	public Order saveOrder(Order order);
	public List<Order> findAllOrders();
	

}

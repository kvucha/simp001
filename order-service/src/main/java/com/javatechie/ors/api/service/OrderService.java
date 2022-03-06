package com.javatechie.ors.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.ors.api.entity.Order;
import com.javatechie.ors.api.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository; 
	
	public Order saveOrder(Order order ) {
		return repository.save(order);
	}

}

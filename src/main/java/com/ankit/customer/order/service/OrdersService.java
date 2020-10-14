package com.ankit.customer.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankit.customer.order.entity.CustomerEntity;
import com.ankit.customer.order.entity.OrdersEntity;
import com.ankit.customer.order.model.Order;
import com.ankit.customer.order.repository.OrdersRepository;

@Service
public class OrdersService {

	@Autowired
	private OrdersRepository ordersRepository;

	public OrdersEntity getOrdersDetails(Integer id) {
		return ordersRepository.findById(id).get();
	}

	public OrdersEntity createOrder(Order order, CustomerEntity customerEntity) {
		OrdersEntity ordersEntity = ordersRepository.save(new OrdersEntity(order, customerEntity));
		return ordersEntity;
	}

}

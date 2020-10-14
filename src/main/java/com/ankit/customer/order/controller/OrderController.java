package com.ankit.customer.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankit.customer.order.entity.OrdersEntity;
import com.ankit.customer.order.model.Order;
import com.ankit.customer.order.service.CustomerService;
import com.ankit.customer.order.service.OrdersService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrdersService ordersService;
	
	@Autowired
	private CustomerService customerService;

	/**
	 * Retrieve an order info.
	 * 
	 * @param id
	 * @return
	 */

	@GetMapping("/{id}/info")
	public OrdersEntity getOrderInfo(@PathVariable(value = "id") Integer id) {
		return ordersService.getOrdersDetails(id);
	}

	/**
	 * 
	 * @param order
	 * @return
	 */
	@PostMapping("/create")
	public OrdersEntity createOrder(@RequestBody Order order) {
		return ordersService.createOrder(order, customerService.getCustomerInfo(order.getCustomerId()));
	}

}

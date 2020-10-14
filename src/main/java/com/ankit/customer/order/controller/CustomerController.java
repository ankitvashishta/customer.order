package com.ankit.customer.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankit.customer.order.entity.CustomerEntity;
import com.ankit.customer.order.model.Customer;
import com.ankit.customer.order.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	/**
	 * Create a new Customer.
	 * 
	 * @param customer
	 * @return
	 */
	@PostMapping("/create")
	public CustomerEntity createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}

	/**
	 * Retrieve all customers information.
	 * 
	 * @return
	 */
	@GetMapping("/{id}/info")
	public CustomerEntity getCustomerInfo(@PathVariable(value = "id") Integer id) {
		return customerService.getCustomerInfo(id);
	}

}

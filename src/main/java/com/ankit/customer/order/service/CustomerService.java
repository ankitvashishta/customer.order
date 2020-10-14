package com.ankit.customer.order.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankit.customer.order.entity.CustomerEntity;
import com.ankit.customer.order.model.Customer;
import com.ankit.customer.order.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public CustomerEntity createCustomer(Customer customer) {
		return customerRepository.save(new CustomerEntity(customer));
	}

	public CustomerEntity getCustomerInfo(Integer id) {
		Optional<CustomerEntity> customerEntity = customerRepository.findById(id);
		return customerEntity.orElse(null);
	}

}

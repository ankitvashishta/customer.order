package com.ankit.customer.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ankit.customer.order.model.Customer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "customer")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerid")
	private Integer customerId;
	@Column(name = "customername")
	private String customerName;
	@Column(name = "customerage")
	private Integer customerAge;
	@Column(name = "customeraddress")
	private String customerAddress;

	public CustomerEntity(Customer customer) {
		this.customerName = customer.getCustomerName();
		this.customerAge = customer.getAge();
		this.customerAddress = customer.getCustomerAddress();
	}

}

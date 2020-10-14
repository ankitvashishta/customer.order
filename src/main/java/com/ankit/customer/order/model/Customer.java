package com.ankit.customer.order.model;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Customer {
	
	@NotNull
	private String customerName;
	@NotNull
	private Integer Age;
	@NotNull
	private String customerAddress;

}

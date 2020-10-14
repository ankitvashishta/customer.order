package com.ankit.customer.order.model;

import java.sql.Date;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Order {

	@NotNull
	private Integer customerId;
	@NotNull
	private String orderDetail;
	@NotNull
	private Date orderDate;
	@NotNull
	private Double orderAmount;

}

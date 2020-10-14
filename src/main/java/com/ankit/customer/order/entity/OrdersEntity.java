package com.ankit.customer.order.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ankit.customer.order.model.Order;
import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "orders")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class OrdersEntity {

	@Id
	@Column(name = "orderid")
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	@ManyToOne
	@JoinColumn(name = "customerid", nullable = false)
	private CustomerEntity customerEntity;
	@NotNull
	@Column(name = "orderdetail")
	private String orderDetail;
	@NotNull
	@Column(name = "orderdate")
	private Date orderDate;
	@NotNull
	@Column(name = "orderamount")
	private Double orderAmount;

	public OrdersEntity(Order order, CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
		this.orderDetail = order.getOrderDetail();
		this.orderDate = order.getOrderDate();
		this.orderAmount = order.getOrderAmount();
	}

}

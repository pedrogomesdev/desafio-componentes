package com.onedesafio.component.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onedesafio.component.entities.Order;

@Service
public class OrderService {

	@Autowired 
	private ShippingService shipping;
	
	public double Total (Order order) {
		return (order.getBasic() + shipping.Shipment(order))
				- (order.getBasic() * (order.getDiscount() / 100));
	}
}

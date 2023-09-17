package com.onedesafio.component.services;

import org.springframework.stereotype.Service;

import com.onedesafio.component.entities.Order;

@Service
public class ShippingService {

	public double Shipment(Order order) {
		double shipment = 0.0; 
		if (order.getBasic() < 100) {
			shipment = 20.0;
		}else if (order.getBasic() >= 100 && order.getBasic() < 200) {
			shipment = 12.0;
		}
		return shipment;
	}
	
}

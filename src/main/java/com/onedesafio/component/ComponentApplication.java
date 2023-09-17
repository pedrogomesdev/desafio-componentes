package com.onedesafio.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.onedesafio.component.entities.Order;
import com.onedesafio.component.services.OrderService;

@SpringBootApplication
public class ComponentApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(ComponentApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.00, 20.0);
		Order order2 = new Order(2282, 800.00, 10.0);
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.printf("Pedido código %d \nValor total: R$ %.2f \n",
				order1.getCode(),orderService.Total(order1));
		System.out.printf("Pedido código %d \nValor total: R$ %.2f \n",
				order2.getCode(),orderService.Total(order2));
		System.out.printf("Pedido código %d \nValor total: R$ %.2f \n",
				order3.getCode(),orderService.Total(order3));
		
    }
	
}

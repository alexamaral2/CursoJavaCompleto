package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DEVILERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DEVILERED");
				
		System.out.println(os1);
		System.out.println(os2);
	}

}

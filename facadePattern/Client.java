package facadePattern;

import java.util.Scanner;

import facadePattern.orderController.OrderController;

public class Client {
	
	private OrderController orderController = new OrderController();
	private Scanner scanner = new Scanner(System.in);
	private Customer customer1 = new Customer("Park", "Busan", 10000);

	public void makeOrder() {
		
		String item = scanner.next();
		int quantity = scanner.nextInt();
		orderController.makeOrder(customer1, item, quantity, quantity >= 10);

	}
	
	public void cancelOrder() {
		System.out.println("Are you sure to cancel? ");
		String answer = scanner.next();
		if ( ! answer.toUpperCase().equals("Y") ) return;
		
		orderController.cancelOrder();
	}
}

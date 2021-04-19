package facadePattern.orderController;

import facadePattern.Customer;

public class OrderController {
	private OrderDepartment orderDept = new OrderDepartment();
	private BillingDepartment billingDept = new BillingDepartment();
	private ShippingDepartment shippingDept = new ShippingDepartment();
	private Order order;
	
	public void makeOrder(Customer customer, String item, int quantity, boolean canBeCancelled) {
		try {
			
			
			order = orderDept.makeOrder(customer, item, quantity, quantity >= 10);
			int price = order.getPrice();
			if ( billingDept.makePayment(order, price) )
				shippingDept.startShipping(order);
			else {
				order.setPending(true);
				throw new NotEnoughBalanceException(order);
			}
			
			
		}
		catch ( NotEnoughBalanceException e ) {
			System.out.println("You have not enough money to buy " + order.getItem());
		}
	};
	public void cancelOrder(){
		if ( orderDept.cancelOrder(order) ) {
			billingDept.refund(order);
			shippingDept.stopShipping(order);
		}
		else {
			System.out.println("The order cannot be cancelled");
		}
	}
}

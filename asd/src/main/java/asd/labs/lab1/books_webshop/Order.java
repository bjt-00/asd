package asd.labs.lab1.books_webshop;

public class Order {

	int orderId;
	int customerId;
	ShoppingCart shoppingCart;
	Address shippingAddress;
	Address billingAddress;
	public int getOrderId() {
		return orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
}

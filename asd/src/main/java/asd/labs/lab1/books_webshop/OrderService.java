package asd.labs.lab1.books_webshop;

public interface OrderService {
	public boolean placeOrder(Order order);
	public Order search(int orderId);
	public boolean update(Order order);
	public boolean delete(int orderId);
}

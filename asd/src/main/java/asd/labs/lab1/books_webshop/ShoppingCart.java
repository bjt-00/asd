package asd.labs.lab1.books_webshop;

import java.util.List;

public interface ShoppingCart {
	
	public boolean addItem(CartItem cartItem);
	public boolean removeItem(int itemId);
	public List<CartItem> getCartItems();
}

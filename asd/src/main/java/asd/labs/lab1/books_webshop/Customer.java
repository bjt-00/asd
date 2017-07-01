package asd.labs.lab1.books_webshop;

import java.util.List;

public class Customer {

	int customerId;
	String name;
	String phone;
	String email;
	List<Address> address;
	
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

package asd.labs.lab1.car_rental;

public class Customer {

	int customerId;
	String name;
	String phone;
	String email;
	String street;
	String city;
	int    zipCode;
	
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public int getZipCode() {
		return zipCode;
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
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}

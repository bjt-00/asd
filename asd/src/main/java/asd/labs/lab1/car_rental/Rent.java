package asd.labs.lab1.car_rental;

import java.util.Date;

public class Rent {
	Customer customer;
	Car car;
	int rentId;
	Date startDate;
	Date endDate;
	boolean reserve;
	
	public Customer getCustomer() {
		return customer;
	}
	public Car getCar() {
		return car;
	}
	public Date getStartDate() {
		return startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public boolean isReserve() {
		return reserve;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public void setReserve(boolean reserve) {
		this.reserve = reserve;
	}
}

package asd.labs.lab1.car_rental;

public interface RentalService {
	public boolean add(Rent rent);
	public Rent search(int rentId);
	public Rent searchByCarId(int carId);
	public Rent searchByCustomerId(int customerId);
	public boolean update(Rent rent);
	public boolean delete(int rentId);
	
}

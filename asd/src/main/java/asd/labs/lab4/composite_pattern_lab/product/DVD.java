package asd.labs.lab4.composite_pattern_lab.product;

import java.util.ArrayList;
import java.util.List;

import asd.labs.lab4.composite_pattern_lab.ProductCategory;

public  class DVD  extends ProductCategory<DVD> {
	protected String title;
	protected String category;
	protected List<DVD> dvdList = new ArrayList<DVD>();

	public DVD(String title,String category){
		this.title = title;
		this.category= category;
	}
	
	public void add(DVD dvd){
		dvdList.add(dvd);
	}
	public void remove(DVD dvd){
		dvdList.remove(dvd);
	}
	public void print() {
		System.out.println(" + "+toString());
		dvdList.forEach(c->{
			System.out.println(" - "+c.toString());
		});
	}

	@Override
	public String toString() {
		return "title=" + title + ", category=" + category;
	}
}

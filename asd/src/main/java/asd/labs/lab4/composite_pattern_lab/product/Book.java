package asd.labs.lab4.composite_pattern_lab.product;

import java.util.ArrayList;
import java.util.List;

import asd.labs.lab4.composite_pattern_lab.ProductCategory;

public  class Book extends ProductCategory<Book> {
	protected String isbn;
	protected String title;
	protected String category;
	protected List<Book> bookList = new ArrayList<Book>();

	public Book(String title,String isbn,String category){
		this.isbn = isbn;
		this.title = title;
		this.category= category;
	}
	
	public void add(Book book){
		bookList.add(book);
	}
	public void remove(Book book){
		bookList.remove(book);
	}
	public void print() {
		System.out.println(" + "+toString());
		bookList.forEach(c->{
			System.out.println(" - "+c.toString());
		});
	}

	@Override
	public String toString() {
		return " isbn=" + isbn + ", title=" + title+", category="+category;
	}
}

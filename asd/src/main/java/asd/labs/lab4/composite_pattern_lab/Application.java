package asd.labs.lab4.composite_pattern_lab;

import asd.labs.lab4.composite_pattern_lab.product.Book;
import asd.labs.lab4.composite_pattern_lab.product.DVD;

public class Application {
	public static void main(String[] arg){
		ProductCatalog catalog = new ProductCatalog();
		
		ProductCategory computerBook = new Book("OOPs Concept","1SB123","Computer Book");
		ProductCategory fictionBook = new Book("Fiction book1","1SB124","Fiction Book");
		
		ProductCategory actionDVD = new DVD("The Last Summrai","Action DVD");
		ProductCategory dramaDVD = new  DVD("The Fist of Furry","Drama DVD");
		
		computerBook.add(new Book("JEE Design Patterns","1SB1231","Computer Book"));
		fictionBook.add(new Book("Fiction book2 ","1SB1241","Fiction Book"));

		actionDVD.add(new DVD("Mission Impossible II","Action DVD"));
		dramaDVD.add(new DVD("The Accountant","Drama DVD"));
		
		catalog.add(computerBook);
		catalog.add(fictionBook);
		
		catalog.add(actionDVD);
		catalog.add(dramaDVD);
		
		catalog.print();
	}
}

package asd.labs.lab4.composite_pattern_lab;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
	
	List<ProductCategory> categoryList = new ArrayList<ProductCategory>();
	
	public void add(ProductCategory category){
		categoryList.add(category);
	}
	public void remove(ProductCategory category){
		categoryList.remove(category);
	}
	public void print() {
		categoryList.forEach(c->c.print());
	}
}

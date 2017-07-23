package asd.labs.lab4.composite_pattern_lab;

public abstract class ProductCategory<T> {
	public abstract void print();
	public abstract void add(T t);
	public abstract void remove(T t);
}

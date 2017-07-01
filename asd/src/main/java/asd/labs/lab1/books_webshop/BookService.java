package asd.labs.lab1.books_webshop;

public interface BookService {
	public Book search(int bookId);
	public boolean add(Book book);
	public boolean update(Book book);
	public boolean delete(int bookId);
}

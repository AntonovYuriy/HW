package HW5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Library {
	private List<Book> books = new ArrayList<Book>();

	public void showAllBooks() {
		books.forEach(book -> System.out.println(book));
	}

	public List<Book> getBooksByAuthor(String author) {
		List<Book> filtered = books
				.stream()
				.filter(b -> b.getAutors()
				.contains(author))
				.collect(Collectors.toList());
		filtered.forEach(book -> System.out.println(book));
		return filtered;
	}

	public List<Book> getBooksOlderThan(int year) {
		List<Book> filtered = books
				.stream()
				.filter(b -> b.getPublishingYear() >= year)
				.collect(Collectors.toList());
		filtered.forEach(book -> System.out.println(book));
		return filtered;
	}

	public List<Book> getBooksOlderAndEarlierThan(int year1,int year2) {
		List<Book> filtered = books
				.stream()
				.filter(b -> b.getPublishingYear() >= year1)
				.filter(b -> b.getPublishingYear() <= year2)
				.collect(Collectors.toList());
		filtered.forEach(book -> System.out.println(book));
		return filtered;
	}
	
	
	public List<Book> getBooksByPublishingHouse(String pubHouse) {
		List<Book> filtered = books
				.stream().filter(b -> b.getPublishingHouse().equals(pubHouse))
				.collect(Collectors.toList());
		filtered.forEach(book -> System.out.println(book));
		return filtered;
	}

	public void addBook(Book b) {
			books.add(b);
	}
}
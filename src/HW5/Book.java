package HW5;

public class Book {
	private int id;
	private static int numberOfBooks = 0;
	private String name;
	private String[] autors;
	private String publishingHouse;
	private int publishingYear;
	private int numberOfPages;
	private double price;
	private Binding binding;

	enum Binding {
		WIRE("Plastic coils"), SEWN("Running stitch"), COPTIC("Through the fold"), JAPANESE("On the inside");
		private String bindingName;
		private Binding(String bindingName) {
			this.bindingName = bindingName;
		}
		public String getBinding() {
			return bindingName;
		}
	}

	
	
	public Book(String name, String[] autors, String publishingHouse, int publishingYear, int numberOfPages,
			double price, Binding binding) {
		this.id = ++numberOfBooks;
		this.name = name;
		this.autors = autors;
		this.publishingHouse = publishingHouse;
		this.publishingYear = publishingYear;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.binding = binding;
	}

	public Binding getBinding() {
		return this.binding;
	}

	public void setBinding(Binding binding) {
		this.binding = binding;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutors() {
		String[] authors = this.autors;
		String authorsList = String.join(", ", authors);
		return authorsList;
	}

	public void setAutors(String[] autors) {
		this.autors = autors;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
public String toString() {
		String formatting = "\n\u0009\u00B7";
		String tab = "\u0009";
		return "Book: " + this.id + ";" + formatting 
				+ "Name: " 	+ tab + tab + this.name + ":" + formatting 
				+ "Author: " + tab + this.getAutors() + ";" + formatting 
				+ "Published by: "  + tab + this.publishingHouse + tab
				+ " in " + this.publishingYear + ";" + formatting 
				+ this.numberOfPages + " pages" 
				+ ", "  + tab + "binding: " + this.binding.getBinding() + ";" + formatting 
				+ "Price: "  + tab + this.price + "";
	}

}
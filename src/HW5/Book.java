package HW5;

public class Book {

	public static void main(String[] args) {

		BookRec[] l = new BookRec[10];

		l[0] = new BookRec(1, "Kniga1", "Author1", "Izdat1", 1944, 450, 32, "leather");
		l[1] = new BookRec(2, "Kniga2", "Author2", "Izdat2", 1998, 453, 33, "skin");
		l[2] = new BookRec(3, "Kniga3", "Author3", "Izdat3", 1989, 43, 366, "paper");
		l[3] = new BookRec(4, "Kniga4", "Author4", "Izdat4", 1949, 670, 377, "leather");
		l[4] = new BookRec(5, "Kniga5", "Author5", "Izdat5", 1990, 48, 73, "paper");
		l[5] = new BookRec(6, "Kniga6", "Author2", "Izdat5", 1999, 99, 83, "skin");
		l[6] = new BookRec(7, "Kniga7", "Author3", "Izdat4", 1993, 43, 53, "leather");
		l[7] = new BookRec(8, "Kniga8", "Author4", "Izdat3", 1999, 345, 63, "paper");
		l[8] = new BookRec(9, "Kniga9", "Author5", "Izdat2", 1997, 66, 366, "skin");
		l[9] = new BookRec(10, "Kniga10", "Author1", "Izdat1", 1983, 41, 323, "leather");

	FindAuthor ("Author4", l);
	FindProd ("Izdat4", l);
	BooksOlderThan (1992, l);
	
	
	
	}
	
	
	
	public static String pokaz(BookRec toShow) {
		StringBuilder p = new StringBuilder("ID = " + toShow.getId());
		p.append(" Book name = " + toShow.getName()).append(";");
		p.append(" Author = " + toShow.getAuthor()).append(";");
		p.append(" Production = " + toShow.getProd()).append(";");
		p.append(" Year = " + toShow.getYear()).append(";");
		p.append(" Pages = " + toShow.getPages()).append(";");
		p.append(" Value = " + toShow.getValue()).append(";");
		p.append(" Pereplet = " + toShow.getPereplet()).append("\n");
		
		return p.toString();
	}

	
	
	public static void FindAuthor (String a, BookRec[] b) {
		System.out.println("Books by author " + a + " :");
		for (int i=0 ; i < b.length ; i++) {
			String c = b[i].getAuthor();
			if (a.equals(c)) {
				System.out.print(pokaz (b[i]));
			}
		}
		System.out.println();
	}
	
	public static void FindProd (String a, BookRec[] b) {
		System.out.println("Books by Production " + a + " :");
		for (int i=0 ; i < b.length ; i++) {
			String c = b[i].getProd();
			if (a.equals(c)) {
				System.out.print(pokaz (b[i]));
			}
		}
		System.out.println();
	}
	
	public static void BooksOlderThan (Integer a, BookRec[] b) {
		System.out.println("Books older than " + a + " :");
		for (int i=0 ; i < b.length ; i++) {
			if (a<b[i].getYear()) {
				System.out.print(pokaz (b[i]));
			}
		}
		System.out.println();
	}
		
	
}

class BookRec {
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getPereplet() {
		return pereplet;
	}

	public void setPereplet(String pereplet) {
		this.pereplet = pereplet;
	}

	private Integer id;
	private String name;
	private String author;
	private String prod;
	private Integer year;
	private Integer pages;
	private Integer value;
	private String pereplet;

	public BookRec() {
	}

	public BookRec(Integer id, String name, String author, String prod, Integer year, Integer pages, Integer value,
			String pereplet) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.prod = prod;
		this.year = year;
		this.value = value;
		this.pereplet = pereplet;
	}

}
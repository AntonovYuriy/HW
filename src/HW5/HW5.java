package HW5;

//  Автор данного задания не я, но мной оно было тщательно изучено и дополнено
//	добавлены свои методы и проверена их работоспособность
 

import HW5.Book.Binding;

public class HW5 {

	public static void main(String[] args) {
		Book b1 = new Book("Divine Songs", new String[] { "Isaac Watts" }, "Watts. Inc", 1715, 120, 123, Binding.WIRE);
		Book b2 = new Book("A Description of Three Hundred Animals", new String[] { "Sarah Fielding" },
				"Fielding Corp.", 1712, 52, 13, Binding.COPTIC);
		Book b3 = new Book("Evenings at Home", new String[] { "Sarah Trimmer" }, "Trimmer Int.", 1800, 129, 50,
				Binding.JAPANESE);
		Book b4 = new Book("The Perambulation of a Mouse", new String[] { "Sarah Fielding", "Dorothy Kilner" },
				"Kilner Com.", 1788, 120, 75, Binding.SEWN);
		Book b5 = new Book("The Life", new String[] { "Sarah Fielding" }, "Kilner Com.", 1794, 330, 32, Binding.COPTIC);
		Book b6 = new Book("The History of Little Jack", new String[] { "Dorothy Kilner" }, "Watts. Inc", 1715, 189,
				1205, Binding.WIRE);
		
		
		Book b7 = new Book ("Kniga1", new String[] {"Author1"}, "Izdat1", 1944, 450, 32, Binding.COPTIC);
		Book b8 = new Book ("Kniga2", new String[] {"Author2"}, "Izdat2", 1998, 453, 33, Binding.JAPANESE);
		Book b9 = new Book ("Kniga3", new String[] {"Author3"}, "Izdat3", 1989, 43, 366, Binding.SEWN);
		Book b10 = new Book ("Kniga4", new String[] {"Author4"}, "Izdat4", 1949, 670, 377, Binding.WIRE);
		Book b11 = new Book ("Kniga5", new String[] {"Author5"}, "Izdat5", 1990, 48, 73, Binding.WIRE);
		Book b12 = new Book ("Kniga6", new String[] {"Author2"}, "Izdat5", 1999, 99, 83, Binding.SEWN);
		Book b13 = new Book ("Kniga7", new String[] {"Author3"}, "Izdat4", 1993, 43, 53, Binding.COPTIC);
		Book b14 = new Book ("Kniga8", new String[] {"Author4"}, "Izdat3", 1999, 345, 63, Binding.SEWN);
		Book b15 = new Book ("Kniga9", new String[] {"Author5"}, "Izdat2", 1997, 66, 366, Binding.WIRE);
		Book b16 = new Book ("Kniga10", new String[] {"Author1"}, "Izdat1", 1983, 41, 323, Binding.SEWN);
		
		
		Library l = new Library();
		l.addBook(b1);
		l.addBook(b2);
		l.addBook(b3);
		l.addBook(b4);
		l.addBook(b5);
		l.addBook(b6);
		l.addBook(b7);
		l.addBook(b8);
		l.addBook(b9);
		l.addBook(b10);
		l.addBook(b11);
		l.addBook(b12);
		l.addBook(b13);
		l.addBook(b14);
		l.addBook(b15);
		l.addBook(b16);
			
//		System.out.println("Show All books");
//		l.showAllBooks();
//
		System.out.println(" Books older than and earlier than ...");
		l.getBooksOlderAndEarlierThan(b9.getPublishingYear(), b13.getPublishingYear());
		
		System.out.println("Made by?");
		l.getBooksByPublishingHouse(b12.getPublishingHouse());
//		
//		System.out.println("Which one is older than ... ?");
//		l.getBooksOlderThan(1720);
//		
//		System.out.println("What this author wrote?");
//		l.getBooksByAuthor("Dorothy Kilner");

	}

}
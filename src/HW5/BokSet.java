package HW5;

public class BokSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Lit [] l = new Lit [5];
		System.out.println(l[1]);

		
		l [1].id = 0;
		l [1].author = "������";
		l [1].izdat = "�������������";
		l [1].year = 1991;
		l [1].pages = 123;
		l [1].price = 11;
		l [1].perType = "����";
		System.out.printf ("����� ID %w, ������ %s, ������������ %d, ��� %f, ������� %g, ���� %h, �������� %j", l [1].id, l [1].author, l [1].izdat, l [1].ear, l [1].pages, l [1].price, l [1].perType );		
		
	}


	public Class Lit () {
		int id;
		String author;
		String izdat;
		int year;
		int pages;
		int price;
		int perType;

		return null;
	}
	

}

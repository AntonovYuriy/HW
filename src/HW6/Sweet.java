package HW6;

//import java.lang.*;
//import java.util.*;

class Sweet {
	public int id;
	public String name = "default";
	public String type = "default";
	public int sugar = 0;
	public int weight = 0;

	
	
	
	
	
	public int getId() {
		return id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void createCandy(int i) {
		this.id = i;
		this.name = "CandyName" + Integer.toString(id);
		this.sugar = (int) Math.round(Math.random() * 1000);
		this.weight = (int) Math.round(Math.random() * 1000);
	}

	public void printCandy(int i) {
		String s = "ID ������� - " + id

		// Integer.toString(i) + ","
				+ " ������������ ����, " + " ������ � ��� - " + sugar + "," + " ��� ������� - " + weight + ",";
		System.out.println(s);


	}
	
	public void printCandy(Sweet s) {
		String out = "ID ������� - " + s.id
				+ " ������������ ����, " + " "
				+ "������ � ��� - " + s.sugar 
				+ "," + " ��� ������� - " + s.weight + ",";
		System.out.println(out);		
	
	}
	
	public void printCandy() {
		String out = "ID ������� - " + this.id
				+ " ������������ ����, " + " "
				+ "������ � ��� - " + this.sugar 
				+ "," + " ��� ������� - " + this.weight + ",";
		System.out.println(out);		
	
	}
	
	

}

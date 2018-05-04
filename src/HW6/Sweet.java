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
		String s = "ID конфеты - " + id

		// Integer.toString(i) + ","
				+ " Стандартного типа, " + " Сахара в ней - " + sugar + "," + " Вес конфеты - " + weight + ",";
		System.out.println(s);


	}
	
	public void printCandy(Sweet s) {
		String out = "ID конфеты - " + s.id
				+ " Стандартного типа, " + " "
				+ "Сахара в ней - " + s.sugar 
				+ "," + " Вес конфеты - " + s.weight + ",";
		System.out.println(out);		
	
	}
	
	public void printCandy() {
		String out = "ID конфеты - " + this.id
				+ " Стандартного типа, " + " "
				+ "Сахара в ней - " + this.sugar 
				+ "," + " Вес конфеты - " + this.weight + ",";
		System.out.println(out);		
	
	}
	
	

}

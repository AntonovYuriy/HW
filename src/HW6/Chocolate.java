package HW6;

class Chocolate extends Sweet {

	
	public String type = "Chocolate";
	
	@Override
	public void printCandy (int i){
		String s = "ID конфеты - "  + Integer.toString(id)
			+ " Типа Шоколад"  + ","
			+ " Сахара в ней - " + sugar + ","
			+ " Вес конфеты - " + weight;
		System.out.println(s);
			
	}
	
	@Override
	public void printCandy(Sweet s) {
		String out = "ID конфеты - " + s.id
				+ " Стандартного типа, " + " "
				+ "Сахара в ней - " + s.sugar 
				+ "," + " Вес конфеты - " + s.weight + ",";
		System.out.println(out);		
	
	}
	
	
}
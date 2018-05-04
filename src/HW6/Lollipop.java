package HW6;

class Lollipop extends Sweet {
	
	public String type = "Lollipop";
	
	@Override
	public void printCandy (int i){
		String s = "ID конфеты - "  + Integer.toString(id)
			+ " Типа Леденец"  + ","
			+ " Сахара в ней - " + sugar + ","
			+ " Вес конфеты - " + weight;
		System.out.println(s);
			
	}

	
	
}

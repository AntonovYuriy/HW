package HW6;

class Lollipop extends Sweet {
	
	public String type = "Lollipop";
	
	@Override
	public void printCandy (int i){
		String s = "ID ������� - "  + Integer.toString(id)
			+ " ���� �������"  + ","
			+ " ������ � ��� - " + sugar + ","
			+ " ��� ������� - " + weight;
		System.out.println(s);
			
	}

	
	
}

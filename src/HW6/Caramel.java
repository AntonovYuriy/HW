package HW6;

class Caramel extends Sweet {
	
	public String type = "Caramel";

	
	@Override
	public void printCandy (int i){
		String s = "ID ������� - "  + Integer.toString(id)
			+ " ���� ��������"  + ","
			+ " ������ � ��� - " + sugar + ","
			+ " ��� ������� - " + weight;
		System.out.println(s);
			
	}
	
	@Override
	public void printCandy(Sweet s) {
		String out = "ID ������� - " + s.id
				+ " ������������ ����, " + " "
				+ "������ � ��� - " + s.sugar 
				+ "," + " ��� ������� - " + s.weight + ",";
		System.out.println(out);		
	
	}
	
	
	
}
package HW8;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Integer arrlength = (int) (Math.round (Math.random () * 100 ) );
	System.out.println("��� ������ ������ " + arrlength + " ");
	int [] arr = new int [arrlength];
		for (int i=0 ; i<arr.length ; i++) {
			arr[i] = (int) (Math.round (Math.random () * 100 ) );
			System.out.print(arr[i] + " ");
		}
		System.out.println(System.lineSeparator());
		
		
		System.out.println("�� �� ������ ������������� ��������� � ���������� :");
		
//		Sort (arr);
		arr = Sort(arr);
		
		for (int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
// ���� �� ����������, �� � � ���� �������� :)
public static int[] Sort(int[] array) {
    int i = 0;
    int goodPairsCounter = 0;
    while (true) {
        if (array[i] > array[i + 1]) {
            int q = array[i];
            array[i] = array[i + 1];
            array[i + 1] = q;
            goodPairsCounter = 0;
        } else {
            goodPairsCounter++;
        }
        i++;
        if (i == array.length - 1) {
            i = 0;
        }
        if (goodPairsCounter == array.length - 1) break;
    }
    return array;
}
}
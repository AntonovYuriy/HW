package HW8;

//https://java-master.com/%D0%B0%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC-%D0%B1%D1%8B%D1%81%D1%82%D1%80%D0%BE%D0%B9-%D1%81%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B8-quick-sort-%D0%B2-java/

import java.util.Arrays;

public class QuickSortTRY2 {
 
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0
 
        if (low >= high)
            return;//завершить выполнение если уже нечего делить
 
        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];
 
        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
 
            while (array[j] > opora) {
                j--;
            }
 
            if (i <= j) {//мен€ем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
 
        // вызов рекурсии дл€ сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);
 
        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) {
        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 , 9, 12, 88, 91, 2, 4};
        System.out.println("Ѕыло");
        System.out.println(Arrays.toString(x));
 
        int low = 0;
        int high = x.length - 1;
 
        quickSort(x, low, high);
        System.out.println("—тало");
        System.out.println(Arrays.toString(x));
    }
}
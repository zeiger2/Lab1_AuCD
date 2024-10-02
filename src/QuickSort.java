import java.sql.SQLOutput;
import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] a, int low, int high){
        int pivot = a[high];
        int i = low-1;
        for (int j=low; j<high;j++){
            if (a[j]<pivot){
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1]=a[high];
        a[high]=temp;

        return i+1;
    }
    public  static void quickSort(int[] a, int low, int high){
        if (low<high){
            int pi = partition(a, low, high);

            quickSort(a, low, pi-1);
            quickSort(a, pi+1, high);
        }
    }
    public static void main(String[] args){
        int[] a={17, 14, 15, 28, 6, 8, -6, 1, 3, 18};
        System.out.println("Unsorted Array: " + Arrays.toString(a));
        quickSort(a, 0, a.length-1);
        System.out.println("Unsorted Array: " + Arrays.toString(a));
    }
}

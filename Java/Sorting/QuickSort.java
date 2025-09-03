package Java.Sorting;

import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {
        int ar[] = {};
        quickSort(ar,0,ar.length);
        Arrays.stream(ar).forEach(System.out::print);
    }

    private static void quickSort(int[] ar, int low, int high) {
        if(low < high){
            int pivot = findPivot(ar,low,high);
            quickSort(ar, low, pivot-1);
            quickSort(ar,pivot+1,high);
        }
    }

    private static int findPivot(int[] ar, int low, int high) {
      int pivot = ar[high-1];
      int i = low-1;

      for(int j = low;j<high-1;j++){
        if(pivot > ar[j]){
            i++;
            int temp = ar[j];
            ar[j] = ar[i];
            ar[i] = temp;
        }
      }
    i = i+1; 
    if(i > 0 && pivot < ar[i]){
            
            int temp = ar[i];
            ar[i] = ar[high-1];
            ar[high-1] = temp;
        
            
    }
      return i;

    }
}

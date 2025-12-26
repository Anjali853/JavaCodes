package kuchbhi;

import java.util.Arrays;

public class CheckSortedInsertion {
    public static boolean isAlreadySorted(int[] A){
        int n = A.length;

        for (int j = 1; j <n; j++){
            int key = A[j];
            int i = j - 1;
             while (i >= 0 && A[i] > key) {
                return false;
             }
        }
        return true;
    }
    public static void main(String[] args) {
         int[] arr = {1,2,4,5,6};


         if (isAlreadySorted(arr)) {
            System.out.println("Array is already sorted");
        } else {
            System.out.println("Array is NOT sorted");
        }
    }
}

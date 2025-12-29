package kuchbhi;

import java.util.Scanner;

public class MaxShifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements  (reverse oder for max case):");
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }

        int shifts = 0;
        for(int j =1; j<n; j++){
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--;
                shifts++;
            }
            arr[i+1] =key;
        }
        System.out.println("Maximun shifts in Insertion: " + shifts);
        sc.close();
    }
    
}

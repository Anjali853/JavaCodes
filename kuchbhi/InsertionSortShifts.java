package kuchbhi;

import java.util.Scanner;

public class InsertionSortShifts {

    public static int insertionSortShifts(int[] A) {
        int shifts = 0;
        int n = A.length;

        for (int j = 1; j < n; j++) {
            int key = A[j];
            int i = j - 1;

            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i]; // shift
                shifts++;
                i--;
            }
            A[i + 1] = key;
        }
        return shifts;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int shifts = insertionSortShifts(arr);
        System.out.println("Number of shifts: " + shifts);

        sc.close();
    }
}

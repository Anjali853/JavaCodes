package kuchbhi;

import java.util.Scanner;

public class InsertionSortStrings {

    public static void insertionSortStrings(String[] arr) {
        int n = arr.length;

        for (int j = 1; j < n; j++) {
            String key = arr[j];
            int i = j - 1;

            // lexicographical comparison
            while (i >= 0 && arr[i].compareTo(key) > 0) {
                arr[i + 1] = arr[i]; 
                i--;
            }
            arr[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        insertionSortStrings(arr);

        System.out.println("Sorted strings (Lexicographical Order):");
        for (String s : arr) {
            System.out.println(s);
        }

        sc.close();
    }
}

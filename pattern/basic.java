package pattern;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // triangle
        // int n = sc.nextInt();
        int n = 5; // Example value
        // for (int i = 1; i < n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }
        // pyramid
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // // down pyramid
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // // increasing triangle
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // // decreasing triangle
        // for (int i = n - 1; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" " + j);
        // }
        // System.out.println();
        // }
        // 01 increasing triangle
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // if ((i + j) % 2 == 0) {
        // System.out.print("1 ");
        // } else {
        // System.out.print("0 ");
        // }
        // }
        // System.out.println();
        // }
        // decreasing triangle
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

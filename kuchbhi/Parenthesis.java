package kuchbhi;

import java.util.Scanner;

public class Parenthesis {

    public int minInsertions(String s) {
        int open = 0;
        int insertions = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++; 
                } else {
                    insertions++; 
                }

                if (open > 0) {
                    open--;
                } else {
                    insertions++; 
                }
            }
        }

        insertions += open * 2;
        return insertions;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String s = sc.nextLine();

        Parenthesis obj = new Parenthesis(); 
        int result = obj.minInsertions(s);   

        System.out.println("Minimum insertions needed: " + result);
        sc.close();
    }
}

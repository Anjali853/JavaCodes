import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Scanner .nextInt();
        if (number > 0) {
            System.out.println("The number is positive ");
        }else if (number < 0) {
            System.out.println("The number is negative");
        }else {
            System.out.println("The number is zero ");
        }       
        ;
    }
}

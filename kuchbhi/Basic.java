package kuchbhi;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        //reverse
        //  String str = "Automation";
        //  StringBuilder reversed = new StringBuilder(str).reverse();
        //  System.out.println(reversed);


        //palindrom
        // String str = "madam";
        // String reversed = new StringBuilder(str).reverse().toString();
        // System.out.println(str.equals(reversed));


        //fibonacci series
        // int n = 10, num1 = 0, num2 = 1;
        // System.out.println("Fibonacci Series:" + num1 + "," + num2);
        // for (int i = 2; i<n; i++){
        //     int num3 = num1 + num2;
        //     System.err.println("" + num3);
        //     num1 = num2; num2 = num3;
       // }


    //    String s = "All izz well  ";
    //    int count = 0;
    //    for (int i = s.length()-1; i>=0; i--){
    //     if(s.charAt(i) != ' ')
    //     {
    //         count++;
    //     }
    //     else if (s.charAt(i)== ' ' && count != 0){
    //         break;
    //     }
    //     System.out.println("Lenth of last word is " + count);
    //    }



    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter roll No");
    // int rollNo = sc.nextInt();
    // System.out.println("Enter name");
    // String name = sc.next();
    // System.out.println("Enterfee");
    // Double fee = sc.nextDouble();
    // sc.close();



    // int  a = 15;
    // int b =  30;
    // int sum;
    // sum = a+b ;
    // System.out.println("SUM" + sum);

    // String name = "anjali";
    // int age = 20;
    // String clg = "global";
    // boolean isgood = true;
    // System.out.println("my name is " + name + " my age " + age + " clg " + clg + " isgood " + isgood );
// for (int i = 1; i <= 5; i++){
//     System.out.println(i);
// }

// int i = 0;
// while (i <=5) {
//     System.out.println(i);
//     i++;
// }

// int i =1;
// do{
//     System.out.println(i);
//     i++;
// }while (i <= 5);

// for (int i = 1; i <= 10; i++){
//     if (i % 2 == 0){
//         System.out.println(i);
//     }
// }

// for (int i = 1; i <= 10; i++){
//     if (i == 5) break;
//     System.out.println(i);
// }

// for (int i = 1; i <= 10; i++){
//     System.out.println("2 x " + i + " = " + (2 * i));
// }

// int sum =0;
// for (int i = 1; i <= 10; i++){
//     sum = sum + i;
// }
// System.out.println("Sum = " + sum);
int i = 0;
int sum = 0;
while (i <= 10) {
    sum += i;
    i++;
    
}
System.out.println(sum);
   }
    
}

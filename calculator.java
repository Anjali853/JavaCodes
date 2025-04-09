import java.util.*;
public class calculator{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter you 1st value");
        int a= in.nextInt();
        System.out.println("Enter you 2st value");
        int b= in.nextInt();
        System.out.println("Enter your opratorsss value");
        char op = in.next().charAt(0);
        switch (op){
    
        case  '+':
        
        System.out.println(a+b);
        break;
        case  '-':
        System.out.println(a-b);
        break;
        case  '*':
        System.out.println(a*b);
        break;
        case '/':
        System.out.println(a/b);
        break;
        
        }

        }
    }

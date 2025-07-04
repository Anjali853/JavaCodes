
import java.util.*;
public class Armstrong {

    public static boolean isArmstrong(int num){
        int original = num;
        int sum=0, count =0;

        // count number
        int temp = num;
        while(temp >0){
            temp /=10;
            count++; 
        }
       
        //calculate sum of digit
        temp = num;
        while(temp >0){
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp/= 10;
        }
        return sum == original;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        if(isArmstrong(n)){
            System.out.println(n + " is Armstrong number");
        }else{
            System.out.println(n + " is not Armstrong number");
        }
    }
}

    


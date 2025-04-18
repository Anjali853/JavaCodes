
import java.util.*;
public class arrayinput4java {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr");
        int  n=sc .nextInt();
        int sum = 0;
        System.out.println("Enter a value");
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            sum =sum+arr[j];
            System.out.print(sum);

        }
    }

}

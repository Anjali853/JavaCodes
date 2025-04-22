   import java.util.Scanner;
   
   public class problem{
    public static void main(String args[]){
        Scanner in=new
        Scanner(System.in);
        System.err.println("enter an integer");
        int k= in.nextInt();
        if (k%2==0){
            System.err.println("even");
        }else{
            System.out.println("odd");
        }
        
    }
} 
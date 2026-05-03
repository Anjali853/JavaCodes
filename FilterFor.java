import java.util.*;

public class FilterFor{
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(15);
        number.add(20);
        number.add(25);
        number.add(30);
        number.add(35);
        number.add(40);
         
      ArrayList<Integer> evennumbers= new ArrayList<>();

      for(int n : number){
        if(n % 2== 0){
            evennumbers.add(n);
        }
      }

      System.out.println("Original List:" + number);
      System.out.println("Filtered Even Number:" + evennumbers);


        
    }
}
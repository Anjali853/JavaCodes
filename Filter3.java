import java.util.*;
import java.util.stream.Collectors;

public class Filter3{
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(15);
        number.add(20);
        number.add(25);
        number.add(30);
        number.add(35);
        number.add(40);
         
      ArrayList<Integer> evennumbers= (ArrayList<Integer>) number.stream(). filter(n ->n % 2 == 0).collect(Collectors.toList());

      System.out.println("Original List:" + number);
      System.out.println("Filtered Even Number:" + evennumbers);


        
    }
}
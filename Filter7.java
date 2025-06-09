import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter7{
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
    
        
       int sumOfOdds = number.stream().filter(n ->n % 2 != 0).reduce(0,(a,b)->a + b);

      System.out.println(sumOfOdds);
    //  System.out.println("Filtered odd Number:" + oddnumber);


        
    }

}   
import java.util.ArrayList;
import java.util.Collections;

public class Sortarraysum{
    public static void main(String[] args) {
        int n =5;
        //int arr[]={-4,6,0,3,4,-8}
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(-4);
        arr.add(6);
        arr.add(0);
        arr.add(3);
        arr.add(4);
        arr.add(-8);
        Collections.sort(arr);
        int size = arr.size();
        int maxSum = arr.get(size - 1) + arr.get(size - 2);
        System.out.println("Maximun pair sum:" + maxSum);


    }
}    

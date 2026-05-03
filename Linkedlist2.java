import java.util.LinkedList;
public class Linkedlist2{
    public static void main(String[] args) {
        LinkedList<Integer> arr=new LinkedList<>();
        for(int i =100; i<10000;i++){
            arr.add(i);
        }
        System.out.println(arr);
    }
}
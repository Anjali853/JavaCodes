import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class RunnableLambda2{
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
         list.add("anjali");
         list.add("gazal");
        list.add("disha");
        // Collections.sort(list,new Comparator<String>(){
        //     public int compare(String a, String b){
        //         return a.compareTo(b);
        //     }
        // });

        Collections.sort(list,(a,b)->a.compareTo(b));
        System.out.println(list);

    }
}
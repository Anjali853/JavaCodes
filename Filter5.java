import java.util.*;
import java.util.stream.Collectors;

public class Filter5{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Java");
        names.add("Stream");
        names.add("API");
    
        
        
        List<Integer> data = names.stream().map(str -> str.length()).collect(Collectors.toList());

        System.out.println(data);
        
    }
}
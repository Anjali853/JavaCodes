import java.util.*;
import java.util.stream.Collectors;

public class Filter4{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("ram");
        names.add("shyam");
        names.add("om");
        names.add("sita");
        
        
        ArrayList<String>filteredNames = (ArrayList<String>) names.stream().filter(name -> name.startsWith("s")).collect(Collectors.toList());

        System.out.println("Original Name:" + names);
        System.out.println("Names starting with 's':" + filteredNames);
    }
}
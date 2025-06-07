import java.util.*;
import java.util.stream.Collectors;

public class Filter4{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("anjali");
        names.add("gazal");
        names.add("disha");
        names.add("ayushi");
        names.add("anushka");
        
        ArrayList<String>filteredNames = (ArrayList<String>) names.stream().filter(name -> name.startsWith("a")).collect(Collectors.toList());

        System.out.println("Original Name:" + names);
        System.out.println("Names starting with 'a':" + filteredNames);
    }
}
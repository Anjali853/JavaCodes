import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class countchar {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder sb = new StringBuilder(str);
        Map<Character, Integer> freq = new HashMap<>();

        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        System.out.println(freq);
    }
    
}

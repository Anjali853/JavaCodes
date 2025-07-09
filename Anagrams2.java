public class Anagrams2 {
    
    public static boolean isAnagram(String str1, String str2) {
        
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            count[str2.charAt(i) - 'a']--;
        }

        for (int i : count) {
            if (i != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "Triangle";
        String s2 = "Integral";

        if (isAnagram(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }
}

    
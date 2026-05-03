public class stringclass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // String s = "Hello World";
        // System.out.println((s.substring(2, 5)));
        // System.out.println(s.toLowerCase());
        // System.out.println(s.toUpperCase());
        // System.out.println(s.contains("World"));
        // System.out.println(s.replace("Hello", "Namste"));


        String s1 = "Java easy to Learn";
        String words[] = s1.split(" ");
        for(String word : words){
            System.out.println(word);
            String reverse = "";
        for(int i= word.length()-1; i>=0; i--){
            reverse += word.charAt(i);
        }
        System.out.println(reverse);
    }
        }        

    }
    


public class delete {
    
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("abcdef");

        // sb.deleteCharAt(2);  

        // System.out.println("After Delete: " + sb.toString());

        
        StringBuilder sb = new StringBuilder("I like Python");

        // "Python" start = 7, end = 13 (exclusive)
        sb.replace(7, 13, "Java");

        System.out.println("After Replace: " + sb.toString());
    }
}

    

    


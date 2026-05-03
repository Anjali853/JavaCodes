public class something {
    public static void main(String[] args) {
        String str="madam";
        String reversed= new StringBuilder(str).reverse().toString();
        System.err.println(str.equals(reversed));
    }
    
}

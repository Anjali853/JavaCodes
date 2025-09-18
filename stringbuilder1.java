public class stringbuilder1 {
    public static void main(String[] args) {
//         String str = "hello";
//         StringBuilder sb = new StringBuilder(str);
//         System.out.println("Reversed:" + sb.reverse());





String str = "madam";
StringBuilder sb = new StringBuilder(str);
if(str.equals(sb.reverse().toString())){
       System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}



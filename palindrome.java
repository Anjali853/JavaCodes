
public class palindrome {
    public boolean ispalindrome(int x){
        String s = Integer.toString(x);
        String rev =  new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    public static void main(String[] args){
        palindrome sol = new palindrome();
        System.out.println(sol.ispalindrome(121));
        System.out.println(sol.ispalindrome(-121));
        System.out.println(sol.ispalindrome(10));
    }
    
}

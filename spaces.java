public class spaces {
    public static void main(String[] args) {
        String str = "I Love Java";
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++){
            if (sb.charAt(i) == ' ') {
                sb.setCharAt(i, '@');
            }
        }
        System.out.println(sb.toString());
    }
    
}

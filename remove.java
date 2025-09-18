public class remove {
    public static void main(String[] args) {
        String str = "hello world";
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) == -1){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
    
}

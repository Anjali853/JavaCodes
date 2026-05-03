package kuchbhi;
public class Toggle {
    public static void main(String[] args) {
        String s = "@Test#123";
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                answer.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                answer.append(Character.toUpperCase(ch));
            } else {
                answer.append(ch);
            }
        }

        System.out.println(answer.toString());
    }
    
}

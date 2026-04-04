import java.util.Stack;

public class prrb1{
    public static void main(String[] args) {
        String s= "({[]})";
        Stack<Character> st = new Stack<>();
        for(char ch :s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);

            }else{
                if(st.isEmpty()){
                    System.out.println("false");
                }else{
                    st.pop();
                }
            }
        }
    }

}

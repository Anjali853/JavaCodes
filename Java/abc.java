package Java;

public class abc {
    public static void main(String[] args) {
        String str="eye";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i); 
        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("palidrom");
        }else{
            System.out.println("not");
        }
    }

}

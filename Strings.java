public class Strings {
     public static void main(String args[]) {
        //concatenation
        String firstName = "anjali";
        String lastName = "choudhary";
        String fullname = firstName + "@" + lastName;
        System.out.println(fullname.length());


        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }

    }
}
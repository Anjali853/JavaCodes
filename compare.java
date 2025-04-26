import java.util.Arrays;

public class compare {
    public static void main(String[] args) {
        int[] arr1= {1,2,3};
        int[] arr2= {2,4,6};

        boolean isEqual = java.util.Arrays.equals(arr1,arr2);

        if (isEqual) {
         System.out.println("Arrays are equal");
        } else {
        System.out.println("Arrays are not equal"); 
    }
}

}






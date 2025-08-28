public class dsa1 {
    public static int linearSearch(int[] arr, int key) {
        for(int i =0; i < arr.length; i++){
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 12, 8, 130, 44};
        int key = 130;

        int result = linearSearch(arr, key);

         if (result == -1) {
            System.out.println("Element not found");

        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    
}

public class prefix {
    public static void main(String[] args) {
        // int arr[]= {1,2,3,4,5};
        // int prefix[]= new int [arr.length];
        // prefix[0]=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     prefix[i]=prefix[i-1]+arr[i];
        // }
        // // Print the prefix array
        // for(int i=0;i<prefix.length;i++){
        //     System.out.print(prefix[i]+" ");
        // }

        int arr[] ={1,2,3,4,5,6};
        int target=9;
        int left = 0;
        int right = arr.length-1;
        while (left<target) {
            int sum = arr[left] + arr[right];
            if(sum==target){
                System.out.println(arr[left] + " " + arr[right]);
                break;
            }else{
                left++;
                
            }
        }
    }
    
}

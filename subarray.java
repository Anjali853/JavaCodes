public class subarray{
    public static void main(String[] args) {
        int n =5;
        int arr[]={1,2,3,4,5};
        for(int str=0; str<n; str++){
            for(int end= str; end <n; end++){
                for(int i=str; i <=end; i++){
                    
                System.out.print(arr[i] + " ");
                }
                System.out.println();
            }

        }


    }
}
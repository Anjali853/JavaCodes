public class yo{
    public static void main(String[] args){
      //  int[][]arr = {
        //    {2, 3, 4},
          //  {5, 6, 7},
           // {8, 9, 6},
        //};
        //for (int i=0; i<arr.length;i++){
          //  for (int j=0; j<arr[i].length;j++){
            //    System.out.print(arr[i][j]+" ");
            //}
            //System.out.println();
            
       // }
     //  int[][] arr = {
       // {9, 8, 7},
        //{6, 5, 4},
        //{3, 2, 1},
       //};
       //int sum = 0;
       //for(int i=0; i< arr.length; i++){
        //for(int j=0; j<arr[i].length;j++){
          //  System.out.print (arr[i][j]+ " ");
            //sum+= arr[i][j];
        //}
       // System.out.println(sum);
      // }
      int[][] arr = {
        {9, 8, 7},
        {6, 5, 4},
        {3, 2, 1},
      };
      for(int i= arr.length -1; i>=0; i--){
        for(int j=arr[i].length -1; j>=0; j--){
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
      }
    
    }
}    
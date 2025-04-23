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
    //  int[][] arr = {
      //  {9, 8, 7},
        //{6, 5, 4},
       // {3, 2, 1},
     // };
      //for(int i= arr.length -1; i>=0; i--){
        //for(int j=arr[i].length -1; j>=0; j--){
          //  System.out.print(arr[i][j]+ " ");
        //}
       // System.out.println();
      //}
     // int[][] arr = {
       // {9, 8, 7},
        //{6, 5, 4},
        //{3, 2, 1,}
     // };
      //int sum =0;
      //for(int i=0; i<arr.length; i++){
        //for(int j=0; j<arr[i].length; j++){
         //   sum += arr[i][j];
          //  System.out.print(arr[i][j]+" ");
        //}
        // System.out.println("Total Sum: " + sum);
     // }
     //int[][] arr = {
       // {9, 8, 7},
        //{6, 5, 4},
       // {3, 2, 1},
      //};
    
      //for(int i=0; i<arr.length; i++){
       // int rowSum = 0;
        //for(int j=0; j<arr[i].length; j++){
         //   rowSum += arr[i][j];
           // System.out.print(arr[i][j]+" ");
        //}
        //System.out.println("Sum of Row " + i +  ": " + rowSum);
      //}
     // int[][] arr = {
       // {9, 8, 7},
        //{6, 5, 4},
        //{3, 2, 1},
      //};
    
      //for(int i=0; i<arr.length; i++){
        //int colSum= 0;
        //for(int j=0; j<arr[i].length; j++){
          //  colSum += arr[i][j];
           // System.out.print(arr[i][j]+" ");
        //}
        //System.out.println("Sum of col " + i +  ": " + colSum);
       // int[][] arr = {
         //   {9, 8, 7},
          //  {6, 5, 4},
           // {3, 2, 1},
          //};
          //int max = arr[0][0];
        
          //for(int i=0; i<arr.length; i++){
            //for(int j=0; j<arr[i].length; j++){
              //  if(arr[i][j] > max){
                //    max = arr[i][j];
                //System.out.print(arr[i][j]+" ");
            //}
            //System.out.println("Maximum element: " + max);
        
        //}
        int[][] arr = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1},
          };
          int min = arr[0][0];
        
          for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("Minimum element: " + min);
        
        }
          }
        }

}

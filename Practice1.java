//public class Practice1{
  //  public static void main(String[] args) {

      // Transpose matrix

//          int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6}
//          };
//          int rows = matrix.length;
//          int  cols = matrix[0].length;

//          int [][] transpose = new int[cols][rows];

//          for(int i = 0; i < rows; i++){
//             for(int j = 0; j < cols; j++){

//                 transpose[j][i] = matrix[i][j];
//             }
//             }

//           for(int i = 0; i < cols; i++){
//              for(int j=0; j < rows; j++){
//                 System.out.print(transpose[i][j]+ " ");
//              }
//             System.out.println();
//          }


// 
   
//rotate Matrix by 90 Degrees clockwise

         //    int[][] matrix = {
         //    {1, 2, 3},
         //    {4, 5, 6},
         //    {7, 8, 9}
         // };
         // int n = matrix.length;
   
         // for(int i = 0; i < n; i++){
         //    for(int j = 0; j < n; j++){

         //     int tamp  = matrix[i][j];
         //     matrix[i][j] = matrix[j][i];

         //     matrix[j][i] = tamp;
         //    }
         //    }

         //  for(int i = 0; i < n; i++){
         //     for(int j=0; j < n; j++){
         //        System.out.print(matrix[i][j]+ " ");
         //     }
         //    System.out.println();
         // }

           //SEARCH IN A ROW -WISE AND CLOUMN-WISE SORTED MATRIX
//                    int[][] matrix = {
//             {10, 20, 30, 40},
//             {40, 50, 60, 70},
//             {27, 29, 28, 37},
//             {32, 33, 39, 66}
//          };

//          int target = 20;
//          int rows = matrix.length;
//          int  cols = matrix[0].length;

//          int i = 0, j = cols-1; 

//          boolean found = false;
//             while (i < rows && j >= 0){

//             if  (matrix[i][j] == target)
//             {
            
//                System.out.println("Found at ("+ i + ", "+ j + ")");

//                found = true;
//                break;
//             }else if(matrix[i][j] > target){
//                j--;
//             } else {
//                i++;
      
//              }
//             }
//             if(!found){
//             System.out.println("Not Found"); 
//         }
    
     //public class Practice1{
    //public static void main(String[] args) {

         //

         // System.out.println("Matrix C (A x B):");

         //  for(int i = 0; i < m; i++){
         //     for(int j = 0; j < p; j++){
         //        System.out.print(C[i][j]+ " ");
         //     }
         //    System.out.println();
         // }



//if an a element is 0,set its entire riw and column to 0.

// public class Practice1{
//    public static void main(String[] args) {

//      int[][] matrix = {
//             {1, 2, 3},
//             {4, 0, 6},
//             {7, 8, 9}
//          };

//          int rows = matrix.length;
//          int cols = matrix[0].length;
         
//          boolean[] row = new boolean[rows];
//          boolean[] col =  new boolean[cols];

//          for(int i = 0; i < rows; i++){
//             for(int j = 0; j < cols; j++){
//                if(matrix[i][j] == 0){
//                   row[1] = true;
//                   col[1] = true;
//                }
//             }
//          }

         //    for(int i = 0; i < rows; i++){
         //    for(int j = 0; j < cols; j++){
         //       if(row[i] || col[j]){
         //          matrix[i][j] = 0;
         //       }
         //    }
         // }

         //    for(int i = 0; i < rows; i++){
         //    for(int j = 0; j < cols; j++){
         //       System.out.print(matrix[i][j] + " ");
         //    }
         //    System.out.println();
         //    }

         // print diagonal matrix

  //       public class Practice1{
  //  public static void main(String[] args) {
  //     int [][] matrix = {
  //        {1, 2, 3},
  //        {4, 5, 6},
  //        {7, 8, 9}
  //     };

  //     int n = matrix.length;

  //     System.err.println("Main Diagonal:");
  //     for(int i = 0; i<n; i++) {

  //     System.out.print(matrix[i][i] + " ");
  //     }
      // System.out.println();

      // System.out.println("secondary Diagonal:");
      
      // for(int i = 0; i < n; i++){
      //    System.out.println(matrix[i][n-1-i] + " ");
      // }
      // System.out.println();



    //  print Sanke pattern
     public class Practice1{
    public static void main(String[] args) {
      
      }
            System.out.println();
         }
         int[][] matrix = {
         {1, 2, 3, 4},
         {5, 6, 7, 8},
         {9, 10, 11, 12}
      };
      int rows = matrix.length;
      int cols = matrix[0].length;

      for(int i = 0; i < rows; i++){
         if(i % 2 == 0){
            for(int j = 0; j < cols; j++ ){
            System.out.print(matrix[i][j] + " ");
         }
         
         } else {
            for(int j = cols - 1; j >= 0; j--){
            System.out.print(matrix[i][j] + " ");
         }

   // Boundary Traversal

   // public class Practice1{
   //   public static void main(String[] args) {
   //    int[][] matrix = {
   //       {1, 2, 3, 4},
   //       {5, 6, 7, 8},
   //       {9, 10, 11, 12}
   //    }; 
   //    int rows = matrix.length;
   //    int cols = matrix[0].length;
   //    for(int j=0; j<cols; j++){
   //       System.out.print(matrix[0][j] + " ");
   //    }

   //    for(int i = 1; i<rows; i++){
   //       System.out.print(matrix[i][cols-1] + " ");
   //    }
   //       if(rows>1){
   //          for(int j= cols-2; j>= 0; j--){
   //             System.out.print(matrix[rows-1][j]+ " ");
   //          }
   //          if(cols>1){
   //             for(int i = rows-2; i>0; i--){
   //                System.out.print(matrix[i][0]+ " ");
   //             }
   //          }
   //       }
      
   
            
   //       public class Practice1{
   //   public static void main(String[] args) {
   //    int [][]matrix = {
   //       {1, 3 , 5, 7},
   //       {10, 11, 16, 20},
   //       {23, 30, 34, 50}
   //    };
   //    int target = 3;

   //    boolean found = searchMatrix(matrix, target);
   //    System.out.println("Target found? " + found);
   //    }
   //    public static boolean searchMatrix(int[][] matrix, int target)
   //    {
   //       int rows = matrix.length;
   //       int cols =  matrix[0].length;

   //       int low = 0; 
   //       int high = rows * cols-1;

   //       while (low <= high) {
   //          int mid = (low + high) / 2;

   //          int i = mid / cols;
   //          int j = mid % cols;

   //          int midVal = matrix[i][j];

   //             if(midVal == target){
   //                return true;
   //             }else if (midVal < target)
   //             {
   //                low = mid + 1;
   //             }else {
   //                high = mid - 1;
   //             }
   //  
   
  //  public class Practice1{
  //    public static void main(String[] args) {
       }
      }
      
     
   
      
   
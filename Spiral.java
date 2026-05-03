//public class Spiral {
    // public static void main(String[] args) {
    //     int[][] matrix = {
    //         {1, 2, 3},
    //         {4, 5, 6},
    //         {7, 8, 9}
    //     };

    //     int rowStart = 0, rowEnd = matrix.length - 1;
    //     int colStart = 0, colEnd = matrix[0].length - 1;

    //     System.out.println("Spiral order:");

    //     while (rowStart <= rowEnd && colStart <= colEnd) 
    //         for (int col = colStart; col <= colEnd; col++) {
    //             System.out.print(matrix[rowStart][col] + " ");
    //         }
    //         rowStart++;
    //         for (int row = rowStart; row <= rowEnd; row++) {
    //             System.out.print(matrix[row][colEnd] + " ");
    //         }
    //         colEnd--;

    //         if (rowStart <= rowEnd) {
    //             for (int col = colEnd; col >= colStart; col--) {
    //                 System.out.print(matrix[rowEnd][col] + " ");
    //             }
    //             rowEnd++
    //             ;
    //         }

    //         if (colStart <= colEnd) {
    //             for (int row = rowEnd; row >= rowStart; row--) {
    //                 System.out.print(matrix[row][colStart] + " ");
    //             }
    //             colStart++;
    //         }
    //     }
    // }


    class Spiral2{
    public void spiral(int[][] m) {
        for(int i=0;i<3;i++){
            System.out.println(m[0][i]);
        }
        for(int j=1;j<3;j++){
            System.out.println(m[j][2]);
        }
        for(int i=1;i>=0;i--){
            System.out.println(m[2][i]);
        }
        for(int j=0;j<2;j++){
            System.out.println(m[1][j]);
        }
    }
}

public class Spiral {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        Spiral2 x = new Spiral2();
        x.spiral(a);


    }
}


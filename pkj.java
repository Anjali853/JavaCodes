public class pkj {
    public static void main(String[] args) {
        int[][] arr= {  {1,2,3,4,5} ,{1,2,3,4,5} ,{1,2,3,4}  };
        int total = 0;
        for(int i=0;i<arr.length;i++){
            total = total+arr[i].length;

        }
        for(int k=0;k<arr.length;k++){
            for(int j=0;j<arr[k].length;j++) {
            System.out.println(arr[k][j]);
        }
    }
    
}
}

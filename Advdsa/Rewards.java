import java.util.Scanner;

public class Rewards {
    public static void main(String[] args) {

    //    Scanner sc = new Scanner(System.in);
    //     int a1 =sc.nextInt();
    //     int a2 =sc.nextInt();
    //     int a3=sc.nextInt();
    //     int b1 =sc.nextInt();
    //     int b2 =sc.nextInt();
    //     int b3 =sc.nextInt();

    //     int cuptotal = a1 + a2 + a3;
    //     int medaltotal = b1 + b2+ b3;

    //     int  x = cuptotal/5;
    //     if(cuptotal % 5!= 0){
    //         x++;
    //     }

    //     for(int i = 0; )

    // int[] arr = {10,20, 30, 40 ,50};
    // for(int i = 0; i<arr.length;i++){
    //     for(int j =0; j<arr.length; j++){
    //         if(arr[j] >[j+1]){
    //             System.out.println("arraynis sorted");
    //             break;
    //         }
    //     }
    // }

    // int[] arr = {20,30,-5,9,1};
    // for(int i = 0; i<arr.length;i++){
    //     if(arr[i] > i){
    //         System.out.println("negative");
    //     } else{
    //         System.out.println("poative");
    //     }
    // }


    // int[] arr = {1,2,3,4,5};
    // int[] arr2 = {2,3,4,5,1};
    // for(int i = 0; i<arr.length;i++){
    //     if(arr[i] = 2[i+1]){
    //     }
    //     arr2[arr2.length-1] = first;
    //     for(int i = 0; i<arr.length; i++){
    //         System.out.println(arr2[i], " ");
    //     }
    // }
     
            //    String name = "Anjali";
            //    for(int i = name.length()-1; i>= 0;i++){
            //    System.out.println(name.charAt(i));
            //    }


            //  String str = "a njali";
            // vowel = 0;
            // int consonat = 0;
            // for(int i <= 0; )
//


          
            int [][] arr1 = {{1,2,3}, {4,5,6}, {7,8,9}};
            int [][] arr2 = {{1,2,3}, {4,5,6}, {7,8,9}};
            int [][] result = new int[3][3];

            for(int i = 0; i<3; i++){
                for(int j = 0; j<3; j++){
                    for(int k = 0; k<3; k++){
                        result[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            for(int i = 0; i<3; i++){
                for(int j = 0; j<3; j++){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

    }
}


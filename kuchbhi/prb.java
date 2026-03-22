package kuchbhi;

import java.util.Scanner;

public class prb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nd);int n = sc.nextInt();
        // int arr[]= new int[n];

        // for(int i = 0; i <n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // int first = Integer.MIN_VALUE;
        // int second = Integer.MIN_VALUE;

        // for(int i = 1; i<n;i++){
        //     if(arr[i]>first){
        //         second = first;
        //         first = arr[i];
        //     }
        //     else if(arr[i]>second && arr[i] !=first){
        //         second = arr[i];
        //     }
       
        // }
        // // double avg = (double) sum/n;
        // System.out.println(seco


       //non zero
       
    //    int arr[] = {0,1,0,3,12};
    //    for(int i=1;i<arr.length;i++){
    //     for(int j =0; j<i; j++){
    //         if(i>0){
    //             left++;
    //         }else(i<0){
    //             right++
    //         }
    //     }
    //    }


    int arr[] = {1,1,2,2,3,3};
    int j = 0;
    for(int i = 1; i<arr.length; i++){
        if(arr[i] != arr[j]){
            j++;
           
            arr[j] =arr[i];
            
        
        }
    }
    for(int i = 0; i<=j;i++){
        System.out.println(arr[i] + " ");
    }
    }
    //secound largest element

}

package kuchbhi;

import java.util.Scanner;

// import java.util.Scanner;

// public class prb {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // nd);int n = sc.nextInt();
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


    // int arr[] = {1,1,2,2,3,3};
    // int j = 0;
    // for(int i = 1; i<arr.length; i++){
    //     if(arr[i] != arr[j]){
    //         j++;
           
    //         arr[j] =arr[i];
            
        
    //     }
    // }
    // for(int i = 0; i<=j;i++){
    //     System.out.println(arr[i] + " ");
    // }
    // }




//     }

// }

public class prb {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int rev=0;
        // while (n>0) {
        //     int digit=n%10;
        //     rev=rev*10+digit;
        //     n=n/10;
        // }
        // System.out.println(rev);

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int original=0;
        // int rev=0;

        // while (n>0) {
        //     int digit=n%10;
        //     rev= rev*10+digit;
        //     n=n/10;
        // }
        // if(original==rev){
        //     System.out.println("Palindrom");
        // }else{
        //     System.out.println("notPalindrom");
        // }


        // Scanner sc = new Scanner(System.in);
        // String str=sc.next();
        // String rev="";
        // for(int i=str.length()-1; i>=0;i--){
        //     rev=rev+str.charAt(i);
        // }
        // if(str.equals(rev)){
        //     System.out.println("palindrom");
        // }else{
        //     System.out.println("notpalindrom");
        // }

        // Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // int i=0;
        // int j=str.length()-1;
        // boolean ispalindrom = true;
        // while (i<j) {
        //     if(str.charAt(i)!= str.charAt(j)){
        //         ispalindrom=false;
        //         break;
        //     }
        //     i++;
        //     j--;
        // }
        // if(ispalindrom){
        //     System.out.println("Palindrom");
        // }else{
        //     System.out.println("notPalindrom");
        // }

        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // // int n = 10;
        // int fact = 1;
        // for(int i=1; i<=n; i++){
        //     fact = fact*i;
        // }
        // System.out.println(fact);


        //prime
        // int n= sc.nextInt();
        // boolean isPrime = true;
        // if(n<=1){
        //     isPrime=false;
        // }
        // for(int i=2;i<n;i++){
        //     if(n% i ==0){
        //         isPrime=false;
        //         break;
        //     }

        // }
        // if(isPrime){
        //     System.out.println("Prime");
        // }else{
        //     System.out.println("notPrime");
        // }


        //Linear search
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] =sc.nextInt();
//         }


//         int target=sc.nextInt();
//         int index =-1;
//         for(int i=0; i<n;i++){
//             if (arr[i]== target){
//                 index=i;
//             break;
//             }
//         }
//         if(index != -1){
//     System.out.println("Found at index: " + index);
// }else{
//     System.out.println("Not Found");
// }


         int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i=0;i<n;i++){
             arr[i] =sc.nextInt();
         }
        //  boolean isSorted= true;

        //  for(int i=0; i<n-1;i++){
        //     if(arr[i]>arr[i+1]){
        //         isSorted = false;
        //         break;
        //     }
            
        //     }
        int result =0;


        // int j= sc.nextInt();
        for(int i =0; i<n; i++){
            result = result^arr[i];
            // if(arr[i] != 0){
            //     int temp = arr[i];
            //     arr[i] = arr[j];
            //     arr[j] = temp;
            //     j++;

            // }
        }
        
            System.out.println(result);
    }


    }


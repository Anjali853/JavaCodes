// find max. min. an element in an array

import java.util.Arrays;
import java.util.HashSet;

public class Practice2{
    public static void main(String[] args) {
        // int[] arr = {12, 3, 7, 1, 99, 6};

        // int max = arr[0];
        // int min = arr[0];

        // for(int i = 1; i< arr.length; i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        //     if(arr[i] < min){
        //         min = arr[i];
        //     }
        // }
        // System.out.println("Maximun element:" + max);
        // System.out.println("Minimun element:" + min);

        //ReverseArray

        // int[] arr = {1, 2, 3, 4, 5};

        // int left = 0;
        // int right = arr.length-1;

        // while (left<right) {
        //     int temp = arr[left];
        //     arr[left] = arr[right];
        //     arr[right] = temp;

        //     left++;
        //     right--;
            
        // }
        // System.out.println("Reversed array: ");
        // for( int num : arr){
        //     System.out.println(num + " ");
        // }


        // Kth max. and min. element in array

        // int[] arr = {7, 10, 4, 3, 20, 15};
        // int k = 3;
        // Arrays.sort(arr);
        
        // int kthSmallest = arr[k - 1];
        // int kthLargest = arr[arr.length-k];

        // System.out.println(k + "th Smallest = " + kthSmallest);
        // System.out.println(k + "th Largest =" + kthLargest);

        //sort an arrayn of 0s, 1s, and 2s
   
    
    // int[] arr = {2, 0, 2, 1, 1, 0};
    // int low = 0, mid = 0, high = arr.length -1;
    // while(mid<=high){
    //     switch ( arr[mid]) {
    //         case 0:
    //             int temp0 = arr[low];
    //             arr[low]= arr[mid];
    //             arr[mid] = temp0;
    //             low++;
    //             mid++; 
    //             break;
    //             case 1:
    //             mid++;
    //             break;
    //             case 2:
    //             int temp2 = arr[mid];
    //             arr[mid] = arr[high];
    //             arr[high] = temp2;
    //             high--;
    //             break;
    //     }
    // }
    // System.out.println("Sorted array:");
    // for(int num : arr);
    // System.out.print(num + " ");

    // /negative no beginning

    // int[] arr = {1, 3, -2, -4, -5, 6 };
    // int j =0;
    // for(int i =0; i<arr.length; i++){
    //     if(arr[i] < 0){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //         j++;
    //     }
    // }
    // System.out.print("Rearranged array:");
    // for(int num: arr){
    //     System.out.print(num + " ");
    // }

    //Intersection

    // int[] arr1 = {1,2,3,4,5,6};
    // int[] arr2 = {2,3,5,7};
    // HashSet<Integer> unionSet = new HashSet<>();
    // for(int num : arr1)
    // unionSet.add(num);
    // for(int num : arr2)
    // unionSet.add(num);

    // System.out.print("Union: ");
    // for(int num : unionSet){
    //     System.out.print(num + " ");
    // }
    // System.out.println();

    // HashSet<Integer> set1 = new HashSet<>();
    // for(int num : arr1)
    // set1.add(num);

    // System.out.println("Intersection: ");
    // for(int num : arr2){
    //     if(set1.contains(num)){
    //     System.out.print(num + " ");
    //     }
    //     set1.remove(num);
    // }
    

    //Rotated Array
    // int[] arr = {1,2,3,4,5};

    // int n =arr.length;
    // int last = arr[n-1];
    // for(int i=n-1; i>0; i--){

    // arr[i] = arr[i - 1];
    // }
    // arr[0] = last;
    
    // System.out.print("rotated array:");

    // for(int num : arr){
    //     System.out.print(num + " ");
    // }


    //Kadene's Algorithm
    // int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
    // int maxSum = Integer.MIN_VALUE;
    // int currentSum = 0;

    // for(int num : arr){
    //     currentSum += num;
    //     if(currentSum > maxSum){
    //         maxSum = currentSum;
    //     }

    //     if( currentSum < 0){
    //         currentSum = 0; 
    //     }

    // }
    // System.out.println("Maximum Subarray Sum:" + maxSum);



    //CheckSortedRotated
//     int[] arr = {3,4,5,1,2};

//     if(isSortedAndRotated(arr)){

//         System.out.println("Array is sorted and rotated.");
//     }else{
//         System.out.println("Array is Not sorted and rotated.");
//     }
//     }
//     public static boolean isSortedAndRotated(int[] arr){
//         int count = 0;
//         int n = arr.length;

//         for(int i =0; i< n; i++){
//             int next = (i+1) % n;

//             if(arr[i] > arr[next]){
//                 count++;
//             }
//         }
//         return(count <=1);

//CountOccurences
int[] arr ={1,1,2,1,3,3,1};
int x =1;
int count = 0;

for(int num : arr){
    if(num == x){
        count++;
    }
}
System.out.println("Element " + x + "occurs" + count + "times.");
  }
 }

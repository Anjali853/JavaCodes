package Java;

public class arr2 {
    int[] arr={1,2,3,4};
    int[] arr1={2,3,4,5};
    int[] m=new int[arr.length+arr.length];
    for(int i=0;i<arr.length;i++){
      merge  m[i]=arr[i];
    }
    for(int j=0;j<arr1.length;j++){
        m[arr.length+j]=arr1[j];
    }

    
}

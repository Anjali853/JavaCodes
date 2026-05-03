import java.lang.classfile.instruction.StoreInstruction;
import java.util.Scanner;

// public class Rewards {
//     public static void main(String[] args) {

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


          
            // int [][] arr1 = {{1,2,3}, {4,5,6}, {7,8,9}};
            // int [][] arr2 = {{1,2,3}, {4,5,6}, {7,8,9}};
            // int [][] result = new int[3][3];

            // for(int i = 0; i<3; i++){
            //     for(int j = 0; j<3; j++){
            //         for(int k = 0; k<3; k++){
            //             result[i][j] += arr1[i][k] * arr2[k][j];
            //         }
            //     }
            // }

            // for(int i = 0; i<3; i++){
            //     for(int j = 0; j<3; j++){
            //         System.out.print(result[i][j] + " ");
            //     }
            //     System.out.println();
            // }



            //convert num to word
        // int num = 20;
        // while (num != 1) {
        //     int sum = 0;
        //     while (num > 0) {
        //         int digit = num % 10;
        //         sum += digit * digit;
        //         num /= 10;
        //     }
        //     num = sum;
        // }
        // System.out.println();

       // number to word
    //    int num = 123;
    //    String[] word = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    //    while (num>0) {
    //     int digit = num % 10;
    //     System.out.println(word[digit]);
    //     num /= 10;
    //    }

    //factorial and sum of factorial

//     int num = 145;
//     int sum = 0;
//     int temp = num;
//     while (temp > 0) {
//         int digit = temp % 10;
//         int factorial = 1;
//         for(int i = 1; i <= digit; i++){
//             factorial *= i;

//         }
//         sum += factorial;
//         temp /= 10;
//     }
//     if (sum == num){ 
//       System.out.println("number is strong");
//     }else{
// System.out.println("number is not strong");
// }


//once zero
// int[] num = {1,2,0,3,0,5,0,7,0};
// for(int i = 0; i<=num.length; i++){
//    int temp = 0;
//     if(num[i] == 0){
//      temp = num[i];
//      for(int j = i; j<num.length-1; j++){
//           num[j] = num[j+1];
//      }
//      num[num.length-1] = temp;
//     }
//     System.out.println(num[i]);
// }

//sub array sum 
// int sum = 10;
// int[] num = {1,2,4,6,7};
// for(int i = 0; i<=num.length;i++){
//     for(int j =i+1; i<num.length;j++){
//     if(num[i]+num[j] == sum){
//     System.out.println("yes");
//     }
//      else {
//     System.out.println("No");
// }

// }
// }




 public class OOP1 {
  private String name ;
  private  int age;
    // oops(){
    //     System.out.println("Default constructor");
    // }
    // oops(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
     OOP1(String name, int age){
        this.name = name;
        this.age = age;
    }
    void show(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    public static void main(String[] args) {

        OOP1 obj = new OOP1("Alice", 30);
        obj.show();
        obj.setName("George");
        obj.setAge(27);
        obj.show();
        
    }
}
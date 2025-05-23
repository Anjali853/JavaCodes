public class add{
    public static void main(String[] args){
        addition obj = new addition();


        obj.sum(5, 10);
        obj.sum(3, 7, 2);
        //
        obj.sum(4, 5, 3.2);

    }

} 

class addition{
    void sum(int a, int b){
        System.out.println("Sum of two integers:" + (a + b));

    }

    void sum(int a, int b, int c){
        System.out.println("Sum of three integers:" + (a+b+c));
    }

    void sum(double a, double b){
        System.out.println("Sum of two doubles:" + (a+b));
    }

}

public class Multithread6{
    public static void main(String[] args) {
        System.out.println("idher mat dekhooo");
        Thread t1= new Thread(()->{  
            System.out.println("hello");
        }); 
        Thread t2= new Thread(()->{
            System.out.println("hiii");
        });
        t1.start();
        t2.start();
}
}



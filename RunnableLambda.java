public class RunnableLambda{
    // public static void main(String[] args) {
    //     Runnable r =new Runnable() {
    //         public void run() {
    //             System.out.println("Runnable using Lambda");
    //         }
            
    //     };
    //     r.run();
    // }

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Runnable using Lambda");
        r.run();
    }
    
}
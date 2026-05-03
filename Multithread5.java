class MyThread  extends Thread{
    public  void run(){
        System.out.println("hello ");
    
        try {
            Thread.sleep(5000);
            
        } catch (Exception e) {
        }
            System.out.println("hiii");
    }

}
class Hello{
    public static void main(String[] args) {  
        MyThread t1=new MyThread();
        t1.start();
           for(int i=0;i<5;i++){
             System.out.println("hiii");

          }
       
    }
}


class MyThread extends Thread {
    public void run() {
        System.out.println("hello ");
    }
}

class Multithread5 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
      
        t1.start(); 
         for (int i = 0; i < 5; i++) {
            System.out.println("hiii");
         }
     }
}


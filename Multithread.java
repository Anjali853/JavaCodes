class MyRunnable implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName()+ "hiii");
    }
}
class Multithread{
    public static void main(String[] args) {
        MyRunnable obj= new MyRunnable();
        Thread t1= new Thread(obj);
        t1.start();
    }
}
class withdrawThread extends Thread{
    static int totalBalance=1000;
    int amount;
    withdrawThread(int amount){
        this.amount=amount;
    }

    public void run(){
        synchronized(withdrawThread.class){
          if(totalBalance>=amount){
            System.out.println("paisa aapke pass aa jayega" +amount);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                //TODO Auto-generated catch block
                e.printStackTrace();
            }
            totalBalance-=amount;
            System.out.println(totalBalance);

        }
        else{
            System.out.println("Limit ma raho");
        }
        }
        
    }
}

public class Multithread3{
    public static void main(String[] args) {
        withdrawThread obj = new withdrawThread(800);
        withdrawThread obj2 = new withdrawThread(300);
        obj.start();
        

       
            try {
                obj.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        
    obj2.start();
        
        
    }
}
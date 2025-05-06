class Vehicle{
    void run(){
        System.out.println("runn karti hai");
    }
}

class Bike extends Vehicle{
    void run(){
        System.out.println("ye bhi chalti hai");
    }
}

public class Hello{
    public static void main(String[] args){
        Vehicle obj=new Bike();
        obj.run();
    }

}
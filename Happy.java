 abstract class Payment{

    abstract void pay(int a);
    void succes(){
        System.out.println("paymemt done");
    }

}

class UpiPayment extends Payment{
    void pay(int a){
        System.out.println("upi via payment"+a);
    }
}
class Netbanking extends Payment{
    void pay(int b){
    System.out.println("netbanking via payment"+b);
}
}
class Happy {
    public static void main(String[]args){
        Payment obj=new UpiPayment();
        obj.pay(23000);
        Payment obj1 =new Netbanking();
        obj1.pay(56000);
        obj1.succes();
    }
}
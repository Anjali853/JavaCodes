abstract class Animal{

    abstract void sleep(int a);
    void Sound(){
        System.out.println("pet animal");

    }

}

class Cat extends Animal{
    void sleep(int a){
        System.out.println("number of cats"+a);
    }
}
class Dog extends Animal{
    void sleep(int a){
    System.out.println("number of dogs"+a);
}
}

class overriding {
    public static void main(String[] args){
        Animal obj=new Cat();
        obj.sleep(5);
        Animal obj1 =new Dog();
        obj1.sleep(10);
        obj1.Sound();
    }
}
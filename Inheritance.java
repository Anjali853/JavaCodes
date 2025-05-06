public class Inheritance{
    public static void main(String[] args) {
        Puppy obj1 = new Puppy();
        obj1.cry();
        obj1.bark();
        obj1.lazy();

    }
}




class Animal {
    void cry(){
        System.out.println("cryingggggggg");
    }
}


class Dog extends Animal{
    void bark(){
        System.out.println("barkkkkkk");
    }
}


class Puppy extends Dog{
    void lazy(){
        System.out.println("cutieeeeeeee");
    }
}

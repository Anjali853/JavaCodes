
class Animal {
    void eat() {
        System.out.println("text");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("text");
    }
}

// Derived class (inherits from Dog)
class Puppy extends Dog {
    void weep() {
        System.out.println("text");
    }
}

public class Inheritance6 {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        
        
        myPuppy.eat();   
        myPuppy.bark();  
        myPuppy.weep(); 
    }
}
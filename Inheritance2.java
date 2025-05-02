public class Inheritance2{
    public static void main(String[] args) {
        rabbit obj. =new rabbit();
        obj.cry();
        obj.fight();
        obj.rabbit();
        
    }
}


class Animal{
    void cry(){
        System.err.println("cryinggg");
    }
}


class cat extends Animal{
    void fight(){
        System.out.println("fightingggg");
    } 
}


class rabbit extends Animal{
    void eat(){
        System.out.println("eatinggg");
    }
}
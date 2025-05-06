public class Single {

    public static void main(String args[]){
        Manager obj = new Manager();
        obj.work();
        obj.Meeting();
    

    }
}


class Employee {
    void work(){
        System.out.println("writingggg");
    }
}


 class Manager extends Employee  {
    void Meeting(){
        System.out.println("attendMeeting");
    }

    
}
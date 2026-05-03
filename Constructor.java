class Student {
    Student (){
        System.out.println("hiii");
    }
    //int age=19;

    Student (String firstName){
        this();
        System.out.println(firstName);
    }


    Student(String firstName,int age){
        this(firstName);
        System.out.println(firstName + " " + age);
    }
}
 
public class Constructor{
    public static void main(String[] args) {
        Student obj = new Student("anjali", 19);
        //
    }
}
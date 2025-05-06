class Student {
    String firstName="anjali";
    int age=19;


    Student(String firstName,int age){
        this.firstName= firstName;
        age=age;

        System.out.println(firstName+ " " + age);
    }
}
 
public class Object {
    public static void main(String[] args) {
        Student obj = new Student("anjali", 19);
        Student obj1Student = new Student("ayushi", 15);
    }
}
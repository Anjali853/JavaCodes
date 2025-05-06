class Student{
String firstname = "anjali";
int age=19;


Student(String s, int a ) {
    firstname=s;
    age=a;

    System.out.println(firstname+  " "+ age);
}


}

public class ClassObject{
    public static void main(String args[]){
        Student obj = new Student("anjali", 15);
        Student obj1 = new Student("ayushi", 15);
    }
}
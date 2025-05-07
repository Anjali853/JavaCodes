class polymorphism{
    public static void main(String[]args){
Parent obj = new Parent();
//obj.sumgi(10);
obj.sum(10,45);                 
    }
}
class Parent{
    void sum(int a){
        System.out.println(a);
    }
void sum(int a,int b) {
    System.out.println(a+b);
    
}}

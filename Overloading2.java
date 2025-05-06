class Overloading2{
    int age=19;
    void data(){
        System.out.println(this);
    }

    public static void main(String[] args){
        Overloading2 obj=new Overloading2();
        obj.data();
    }
}
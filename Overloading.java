class parent{
    void sum(int a){
        System.out.println("my name is anjaliii"+a);
    }

    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}


class Overloading{
    public static void main(String[] args){
        parent obj =new parent();
        obj.sum(420);
        obj.sum(420,20);
        obj.sum(420,20,40);
    }
}
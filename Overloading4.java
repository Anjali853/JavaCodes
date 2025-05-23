class Area {
    void area(double radius){
        System.out.println("Area of circle:" + (Math.PI * radius * radius ));
    }
    void area(double length, double width){
        System.out.println("Area of Rectangle:" + (length* width));
    }

}

public class Overloading4 {
    public static void main(String[] args){
        Area obj = new Area();

        obj.area(10.0);
        obj.area(3.5, 4);

    }
}
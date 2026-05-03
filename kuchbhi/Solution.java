// import java.io.*;
import java.util.*;

class Shape {
    int length;
    int breadth;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println(length + " " + breadth);
    }
}

class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void area() {
        System.out.println(length * breadth);
    }
}

public class Solution {
    public static void main(String args[]) throws Exception {
       
    }
}
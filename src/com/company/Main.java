package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape shape1 = new Rectangle( 10, 5);
        Shape shape2 = new RPentagon (5);
        Shape shape3 = new ETriangle (5);
        Shape shape4 = new Circle(10);


        Shape[] shapes = {shape1, shape2, shape3, shape4};
        for (Shape cur : shapes)
        {
            System.out.println(cur);
            System.out.println("My area is: " + cur.getArea());
            System.out.println("My perimeter is: " + cur.getPerimeter());
        }
    }
}

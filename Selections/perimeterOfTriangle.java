package JavaBasics.Selections;
/*
Write a program that reads three edges for
a triangle and computes the perimeter if the input is valid. Otherwise, display that
the input is invalid. The input is valid if the sum of every pair of two edges is
greater than the remaining edge.
 */

import java.util.Scanner;

public class perimeterOfTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the firs point: x , y");
        Point point1 = new Point(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("please enter the second point: x , y");
        Point point2 = new Point(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("please enter the third point: x , y");
        Point point3 = new Point(scanner.nextDouble(), scanner.nextDouble());

        if (!isValid(point1,point2,point3)){
            System.out.println("points are not valid");

        }else {
            double parameter = point1.distanceFrom(point2)
                    + point1.distanceFrom(point3) + point2.distanceFrom(point3);
            System.out.println("parameter of the triangle is: "+ parameter);
        }


    }

    //
    private static boolean isValid(Point point1, Point point2, Point point3) {
        return point1.distanceFrom(point2) + point1.distanceFrom(point3) > point2.distanceFrom(point3)
                && point2.distanceFrom(point1) + point2.distanceFrom(point3) > point1.distanceFrom(point3)
                && point3.distanceFrom(point2) + point3.distanceFrom(point1) > point2.distanceFrom(point1);
    }

}

class Point{
    double x,y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceFrom(Point point){
        return Math.sqrt(Math.pow((this.getX()-point.getX()), 2)
                + Math.pow(this.getY()- point.getY(),2));
    }
}

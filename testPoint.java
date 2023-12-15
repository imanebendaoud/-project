import java.util.*;
public class testPoint{
public static void main (String args[]){
Point p=new Point();
p.setX(3);
p.setY(4);
        Point point1 = new Point(1, 2);
        Point point2 = new Point(2, 3);

        double distanceEntrePoints = point1.distance(point2);
        System.out.println("Distance entre les points : " + distanceEntrePoints);
        double distanceEntrePointsV2 = Point.distance(point1, point2);
        System.out.println("Distance entre les points  : " + distanceEntrePointsV2);
Point point3 = new Point(6, 2);
        Point point4 = new Point(1, 2);
        Point point5= new Point(3, 4);

        System.out.println(point3.equals(point4));
  Point point6 = new Point(5, 2);
  Point point7=point5;
System.out.println(point5.equals(point7));
    }
Point p= new Point (2,5);
System.out.println(p.toString());

}
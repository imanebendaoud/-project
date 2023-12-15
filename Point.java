public class Point {
    private double x;
    private double y;
 

    // Constructeur avec un seul paramètre (initialisation de l'abscisse)
    public Point(int x) {
        this.x = x;
        this.y = 0;
    }
    public Point() {
        this(0,0);
    }
 public Point(int a,int b){
  x=a;
  y=b;
}
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
public void setX(double x) {
   this.x=x;}
public void setY(double y) {
this.y=y;}


    public double distance(Point b) {
        double deltaX = b.getX() - this.x;
        double deltaY = b.getY() - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
public static double distance(Point a, Point b) {
        double deltaX = b.getX() - a.getX();
        double deltaY = b.getY() - a.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
 public boolean equals(Object o) {

        Point Po = (Point) o;

        return this.x == Po.x && this.y == Po.y;
    }

public boolean equals(Point P) {
        return this.x == P.x && this.y == P.y;
   }
public String toString(){
return "("+x + "," + y +")";
}
}


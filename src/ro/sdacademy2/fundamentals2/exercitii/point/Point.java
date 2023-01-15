package ro.sdacademy2.fundamentals2.exercitii.point;

public class Point {
    private int x;
    private int y;

    public Point() {
        System.out.println("No args constructor has been called! ");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Constructor with parameters has been called! ");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newx) {
        this.x = newx;
    }

    public void setY(int newy) {
        this.y = newy;
    }

    public double distance() {
        return Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
    public double distance(Point p){
       return Math.sqrt((p.getX()-this.x)*(p.getX()-this.x)+(p.getY()-this.y)*(p.getY()-this.y));
    }
}




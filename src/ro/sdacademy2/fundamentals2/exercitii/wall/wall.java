package ro.sdacademy2.fundamentals2.exercitii.wall;

import org.w3c.dom.ls.LSOutput;

public class wall {
    private double width;
    private double height;

    public static int numberOfInstances;

    static{
        System.out.println("Hello from the static initializer! ");
        System.out.println("Initial number of instances");
    }


    public wall(){
        this(1,1);
        System.out.println("No constructor parameter has been called! ");
    }

    public wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height<0){
            this.height=0;
        }else {
            this.height=height;
        }
        numberOfInstances++;
        System.out.println("Constructor wiht parameters has been called" );
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public static int getNumberOfInstances(){
        return numberOfInstances;
    }
}

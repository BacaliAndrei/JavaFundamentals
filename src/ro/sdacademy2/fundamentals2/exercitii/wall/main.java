package ro.sdacademy2.fundamentals2.exercitii.wall;

public class main {
    public static void main(String[] args) {
        wall wall = new wall(2, 3);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
        System.out.println("---------------------------------");
        wall wall2 = new wall();
        System.out.println("width= " + wall2.getWidth());
        System.out.println("height= " + wall2.getHeight());
        System.out.println("area= " + wall2.getArea());

        System.out.println("Number of instances is " + wall.getNumberOfInstances());

        int number = 100;
        System.out.println("my number in method main before calling the method :" + number);
        testPassByValue(number);
        System.out.println("my number in method main after calling the method :" + number);
    }

    static void testPassByValue(int number) {
        System.out.println("Number passed as parameter is " + number);
        number = 700;
        number++;
        System.out.println("number after some calculation " + number);

    }
}

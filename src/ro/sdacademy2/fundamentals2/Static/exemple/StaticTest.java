package ro.sdacademy2.fundamentals2.Static.exemple;

/*
    Create a class called StaticTest with one INSTANCE VARIABLE "name" which is a string
    The class should also have a STATIC variable which counts the number of instances created

    --> In constructor increment the static field because we want to count the number of instances created by that constructor

    Implement the following methods:

    - getName() - getter for the instance variable "name"
    - getNumOfInstances() - a method that return the static variable (as you may have guessed, the method needs to be static)

    Test code:

    StaticTest firstInstance = new StaticTest("1st Instance");
    System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

    StaticTest secondInstance = new StaticTest("2nd instance");
    System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances())
 */
public class StaticTest {
    private static int numberOfInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numberOfInstances++;

    }
    public String getName() {
        return name;

    }
    public static int getNumberOfInstances() {
        return numberOfInstances;
    }

}

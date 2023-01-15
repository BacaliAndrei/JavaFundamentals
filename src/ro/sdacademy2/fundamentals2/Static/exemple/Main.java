package ro.sdacademy2.fundamentals2.Static.exemple;

public class Main {
    public static void main(String[] args) {
        StaticTest firstInstance=new StaticTest("1st instance ");
        System.out.println(firstInstance.getName()+"is instance number "+StaticTest.getNumberOfInstances());

        StaticTest secondInstance=new StaticTest("2nd instance ");
        System.out.println(secondInstance.getName()+" is instance number "+StaticTest.getNumberOfInstances());

        StaticTest thirdInstance=new StaticTest("3rd instance ");
        System.out.println(thirdInstance.getName()+"is instance number "+StaticTest.getNumberOfInstances());

    }
}

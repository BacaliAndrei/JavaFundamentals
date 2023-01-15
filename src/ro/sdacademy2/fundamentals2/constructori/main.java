package ro.sdacademy2.fundamentals2.constructori;

public class main {
    public static void main(String[] args) {
        Person myPerson = new Person("Gigel", "Popescu", 32);
        System.out.println("Full name = " + myPerson.getFullName());
        System.out.println("First name= " + myPerson.getFirstName());
        System.out.println("Last name= " + myPerson.getLastName());

        Person anotherPerson = new Person("Leo", "Mesi", 35);
        System.out.println("Full name = " + anotherPerson.getFullName());
        System.out.println("First name= " + anotherPerson.getFirstName());
        System.out.println("Last name= " + anotherPerson.getLastName());
        System.out.println("Person is teen return:" + anotherPerson.isTeen());

    }
}

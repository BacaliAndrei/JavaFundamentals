package ro.sdacademy2.fundamentals2.strings;

public class Strings {
    public static void main(String[] args) {
        String str = "Java exercise";
        System.out.println("Original sting is: " + str);

        char charAtThree = str.charAt(3);
        System.out.println("Char at index three : " + charAtThree);

        char charAtSeven = str.charAt(7);
        System.out.println("Char at index seven is : " + charAtSeven);

        int charAtNine = str.charAt(9);
        System.out.println("Char at Nine is (in decimal) : " + charAtNine);
        System.out.println("Char at index nine is : " + (char) charAtNine);

    }
}

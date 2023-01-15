package ro.sdacademy2.fundamentals2.strings;

public class String4 {
    public static void main(String[] args) {
        String str1 = "This is exercise one";
        String str2 = "This is exercise two";

        int result = str1.compareTo(str2);

        System.out.println("Comparison of bought is :  " + result);
        System.out.println("Comparison of bought is :  " + str2.compareTo(str1));


        String str3 = "abc";
        String str4 = "abd";

        int anotherResult = str3.compareTo(str4);

        System.out.println("Comparison of str3 and str4 is : " + anotherResult);
    }
}

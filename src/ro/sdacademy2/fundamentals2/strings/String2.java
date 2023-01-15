package ro.sdacademy2.fundamentals2.strings;

public class String2 {
    public static void main(String[] args) {
        String str1="Java is";
        String str2= " fun";
        System.out.println("string one is : "+str1);
        System.out.println("string two is : "+str2);

        String anotherString=str1.concat(str2);
        System.out.println("string one is :"+anotherString);
    }
}

package ro.sdacademy2.fundamentals2.complexNumber;

public class Main {
    public static void main(String[] args) {
        ComplexNumber number1=new ComplexNumber(2,3);
        System.out.println("Number1 real part is +"+number1.getReal());
        System.out.println("number1 imaginary part is "+number1.getImaginary());

        number1.add(1,2);
        System.out.println("Number1 real part is +"+number1.getReal());
        System.out.println("number1 imaginary part is "+number1.getImaginary());

        ComplexNumber number2 = new ComplexNumber(1000,500);
        System.out.println("Number2 real part is : " + number2.getReal());
        System.out.println("Number2 imaginary part is : " + number2.getImaginary());

        number2.add(number1);
        System.out.println("Number2 real part is : " + number2.getReal());
        System.out.println("Number2 imaginary part is : " + number2.getImaginary());

        ComplexNumber number3 = new ComplexNumber(100,80);
        System.out.println("Number3 real part is : " + number3.getReal());
        System.out.println("Number3 imaginary part is : " + number3.getImaginary());

        number3.substract(number2);
        System.out.println("Number3 real part is : " + number3.getReal());
        System.out.println("Number3 imaginary part is : " + number3.getImaginary());
    }
}

package ro.sdacademy2.fundamentals2.array;
        /*
        Write a method called readIntegers() with a parameter called count that represents
        how many integers the user need to enter.

        The method need to read from the console until all the numbers are entered, and
        then return an array containing the numbers entered.

        Write a method findMin() with the array as a parameter. The method need to return
        the minimum value in the array.

        In the main() method read the count from the console and call the method readIntegers()
        with the count parameter.

        Then call the findMin() method passing the array returned from the call to the
        readIntegers() method.
        */

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int[] returnedArray = readIntegers(5);

        System.out.println(Arrays.toString(returnedArray));
        int minim = findMin(returnedArray);
        System.out.println("Find minim returned :   " + minim);


    }

    public static int[] readIntegers(int count) {

        int[] arr = new int[count];

        Scanner newScanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number : ");
            arr[i] = newScanner.nextInt();

        }
        newScanner.close();
        return arr;
    }

    public static int findMin(int[] arr) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

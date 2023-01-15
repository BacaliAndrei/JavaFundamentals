package ro.sdacademy2.fundamentals2.array;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

        int[] myArray = new int[5];
        myArray[0] = 4;
        myArray[1] = 9;
        myArray[2] = 8;
        myArray[3] = 12;
        myArray[4] = 59;

        String[] myStringArray=new String[3];
        myStringArray[0]="abc";
        myStringArray[1]="messi";
        myStringArray[2]="ronaldo";


        int[] anotherArray = new int[]{1, 2, 3, 4, 5, 6, 7};

        System.out.println("Method contains return : " + contains(myArray, 12));
        System.out.println(Arrays.toString(anotherArray));

        boolean result= contains(anotherArray,10);
        System.out.println("Method contains return for anotherArray : "+result);

        int[] myArray2={8,9,100,222,3131,412341,1231,1231};

        boolean result2=contains(myArray2,222);

        System.out.println("Method contains return for anotherArray2 : "+result2);



    }

    public static boolean contains(int[] arr, int searchItem) {
        for (int i = 0; i < arr.length; i++) {
            if (searchItem == arr[i]) {
                return true;
            }
        }
        return false;
    }


}

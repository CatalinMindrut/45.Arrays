package com.Catalin;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    /** This will allow the user to type input into the console.
     */
    public static void main(String[] args) {
        /** This is how you define an array with 4 elements. Listing each element afterwards.
         Bare in mind that an array starts from 0 not 1, so if you have 4 elements, these will be
         0,1,2 and 3 not 1,2,3,4.
         */
        int[] myArray = new int[4];
        myArray[0] = 50;
        myArray[1] = 60;
        myArray[2] = 70;
        myArray[3] = 80;
        System.out.println(myArray[2]);

        int[] myBrandNewArray = new int[2];
        myBrandNewArray[0] = 22;
        myBrandNewArray[1] = 33;
        System.out.println(myBrandNewArray[1]);

        /**This is how you define an array along with the list of elements. The list tells IntelliJ how many
         elements the array includes (5) and the values of each element (1,2,3,4,5). */
        int[] myNewArray = {1,2,3,4,5};
        System.out.println(myNewArray[2]);

        /**This is how you loop and print the elements of an array.*/
        int[] myWeArray = new int[10];
        for (int i=0; i<10; i++) {
            myWeArray[i] = i * 10;
            System.out.println(myWeArray[i]);
        }

        /** Loop the elements and call a separate method that is used for printing only.*/
        int[] myBestArray = new int[10];
        for (int i = 0; i < myBestArray.length; i++) {
            myBestArray[i] = i * 10;
        }
        printArray(myBestArray);
    }

    /** Instead of hardcoding the loop condition, i<10, you can use a property (field) that is automatically given
     *  to you, it is called the length. By doing this, the exact length of the array will be used as a condition.
     *  The array was set to 10 elements initially and the condition will now be i<10. The good thing is that if
     *  you decide to change the number of elements, you don't have to change the loop as well since it will automatically
     *  get the array length, whatever that is.
     */

    public static void printArray ( int[] array){
        for (int i = 0; i <array.length; i++) {
            System.out.println("For position " + i + ", the array value is " + array[i]);
            }


        // Array usage example

        int[] myInteger = getInteger(5);
        for(int i=0; i<myInteger.length; i++){
            System.out.println("Element " + i + " typed value was " + myInteger[i]);
        }
        System.out.println("The average is "+ getAverage(myInteger));

    }
    public static int[] getInteger(int number){
        /** int[] means that the method will return an array.
         */
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
            /** This means that the scanner will accept and integer and return an integer for our code.
             */
        }
        return values;
    }
    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
        /**Method that returns the average of the numbers typed in by the user.
         */
    }
}



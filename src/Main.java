import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1-2");

        int[] intArray = new int[]{1, 2, 3};
        double[] doubleArray = {1.57, 7.654, 9.986};
        long[] longArray = new long[7];
        longArray[6] = 5L;

        for (int index = 0; index < intArray.length; index++) {
            if (index == intArray.length - 1) {
                System.out.println(intArray[index]);
                break;
            }
            System.out.print(intArray[index] + " ");
        }

        for (int index = 0; index < doubleArray.length; index++) {
            if (index == doubleArray.length - 1) {
                System.out.println(doubleArray[index]);
                break;
            }
            System.out.print(doubleArray[index] + " ");
        }

        for (int index = 0; index < longArray.length; index++) {
            if (index == longArray.length - 1) {
                System.out.println(longArray[index]);
                break;
            }
            System.out.print(longArray[index] + " ");
        }

        System.out.println("Task 3");

        for (int index = (intArray.length - 1); index >= 0; index--) {
            if (index == 0) {
                System.out.println(intArray[index]);
                break;
            }
            System.out.print(intArray[index] + " ");
        }

        for (int index = (intArray.length - 1); index >= 0; index--) {
            if (index == 0) {
                System.out.println(doubleArray[index]);
                break;
            }
            System.out.print(doubleArray[index] + " ");
        }


        for (int index = (longArray.length - 1); index >= 0; index--) {
            if (index == 0) {
                System.out.println(longArray[index]);
                break;
            }
            System.out.print(longArray[index] + " ");
        }

        System.out.println("Task 4");
        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] % 2 != 0) {
                intArray[index] = intArray[index] + 1;
            }
        }
        System.out.println(Arrays.toString(intArray));


    }
}
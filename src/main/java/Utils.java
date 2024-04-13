import java.util.LinkedList;
import java.util.Scanner;

/*
 * The Utils class contains all the reusable methods/helpers so that code in the Main class 
 * looks cleaner and simpler.
 * Mostly it consists of methods used for taking an input from the user
 * and printing some frequently use text.
 * */
public class Utils {
    /*
     * Global scanner wich is used throughout the class for inputs
     */
    private static Scanner scan = new Scanner(System.in);
    private static long timeStart = 0;
    private static long timeEnd = 0;

    public static void printNotExist() {
        System.out.println("Command does not exist");
    }

    public static void printNewLine() {
        System.out.println();
        System.out.println("__________________");
        System.out.println();

    }

    public static void printTimeComplexity(int prob) {
        String complexity = "";
        if (prob == 1 || prob == 2 || prob == 4 || prob == 6 || prob == 8) {
            complexity = "O(n)";
        } else if (prob == 3) {
            complexity = "O(√n)";
        } else if (prob == 5 || prob == 9) {
            complexity = "O(2^n)";
        } else if (prob == 7) {
            complexity = "O(n^2)";
        } else if (prob == 10) {
            complexity = "O( log( min( a, b ) ) )";
        }

        System.out.printf("The time complexity is: %s\n", complexity);

    }

    public static void startTimer() {
        timeStart = System.currentTimeMillis();
    }

    public static void endTimer() {
        timeEnd = System.currentTimeMillis();
    }

    private static void clearTimer() {
        timeEnd = 0;
        timeStart = 0;

    }

    public static void printExecutionTime() {
        long executionTime = timeEnd - timeStart;
        System.out.printf("Execution time in milliseconds: %d", executionTime);
        clearTimer();
    }

    public static int getNumberInput() {
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        return num;
    }

    public static LinkedList<Integer> getLinkedListInput() {
        System.out.print("Enter the size of numbers array: ");
        int size = scan.nextInt();
        System.out.print("Enter the array: ");

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            list.add(scan.nextInt());
        }

        return list;
    }

    public static void printLinkedList(LinkedList<Integer> list) {

        for (Integer item : list) {
            System.out.print(item + " ");
        }

    }

    public static String getStrInput() {

        System.out.print("Enter the string: ");
        String str = scan.nextLine();

        return str;

    }

    public static int[] getTwoNumberInput() {

        int[] inputs = new int[2];

        for (int i = 0; i < inputs.length; i++) {
            if (i == 0) {
                System.out.print("Enter the first number: ");
            } else {
                System.out.print("Enter the second number: ");
            }
            inputs[i] = scan.nextInt();
        }

        return inputs;

    }

    public static int[] getArrayInput() {

        System.out.print("Enter the size of numbers array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        return arr;
    }
}

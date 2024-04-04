import java.util.Scanner;

public class Utils {
    /*
     * public static void main(String[] args) {
     * getArrayInput();
     * }
     */

    private static Scanner scan = new Scanner(System.in);

    public static void printNotExist() {
        System.out.println("Command does not exist");
    }

    public static void printNewLine() {
        System.out.println();
        System.out.println("__________________");
        System.out.println();

    }

    public static int getNumberInput() {
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        return num;
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
    // TODO: remove this

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println();

        }

    }

}

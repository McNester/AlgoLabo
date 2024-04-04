import java.util.LinkedList;
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
        String str = scan.next();

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
    // TODO: remove this

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println();

        }

    }

}

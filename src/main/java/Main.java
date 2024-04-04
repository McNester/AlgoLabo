import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        if (args.length == 1) {
            executeFromCmd(args[0]);
        } else if (args.length == 0) {
            main();
        } else {
            Utils.printNotExist();
        }
    }

    private static void main() {
        runFirstProblem();
        runSecondProblem();
        runThirdProblem();
        runFourthProblem();

    }

    /*
     * The problem runnners are here
     */
    private static void runFirstProblem() {
        Utils.printNewLine();
        System.out.println("The first problem");
        Utils.printNewLine();
        int[] arr = Utils.getArrayInput();
        Utils.printNewLine();
        System.out.println("The minimum val from the array: " + getMin(arr));

    }

    private static void runSecondProblem() {
        Utils.printNewLine();
        System.out.println("The second problem");
        Utils.printNewLine();
        int[] array = Utils.getArrayInput();
        Utils.printNewLine();
        System.out.println("The average from the array: " + getAvg(array));

    }

    private static void runThirdProblem() {
        Utils.printNewLine();
        System.out.println("The third problem");
        Utils.printNewLine();

        int num = Utils.getNumberInput();

        boolean isPrime = isPrime(num);
        Utils.printNewLine();
        System.out.print("The number is ");

        if (isPrime) {
            System.out.println("Prime");
            return;
        }
        System.out.println("Composite");

    }

    private static void runFourthProblem() {
        Utils.printNewLine();
        System.out.println("The fourth problem");
        Utils.printNewLine();

        int num = Utils.getNumberInput();

        int factorial = getFactorial(num);

        Utils.printNewLine();
        System.out.printf("The factorial of the %d is- %d \n", num, factorial);

    }

    private static void runFifthProblem() {

        Utils.printNewLine();
        System.out.println("The fifth problem");
        Utils.printNewLine();

        int num = Utils.getNumberInput();

        int fib = findFibonacciElement(num);

        Utils.printNewLine();
        System.out.printf("The %d-th element in the Fibonacci sequence is: %d\n", num, fib);

    }

    /*
     * Here are methods that are used to solve the problmes,
     * but only pure solution, nothing related with inputs,user experience, etc.
     */

    private static int getMin(int[] array) {
        int n = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < n) {
                n = array[i];
            }
        }

        return n;
    }

    private static double getAvg(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = sum / (double) array.length;

        return avg;
    }

    private static boolean isPrime(int n) {

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int getFactorial(int n) {

        if (n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);

    }

    private static int findFibonacciElement(int n) {

        if (n == 0) {

            return 0;
        } else if (n == 1) {
            return 1;

        }

        return findFibonacciElement(n - 1) + findFibonacciElement(n - 2);
    }

    /*
     * Command line executioner
     */

    private static void executeFromCmd(String method) {
        if (method.equals("firstProb")) {
            runFirstProblem();
        } else if (method.equals("secondProb")) {
            runSecondProblem();
        } else if (method.equals("thirdProb")) {
            runThirdProblem();
        } else if (method.equals("fourthProb")) {
            runFourthProblem();
        } else if (method.equals("fifthProb")) {
            runFifthProblem();
        } else if (method.equals("sixthProb")) {
            runSecondProblem();
        } else if (method.equals("seventhProb")) {
            runSecondProblem();
        } else if (method.equals("eighthProb")) {
            runSecondProblem();
        } else if (method.equals("ninthProb")) {
            runSecondProblem();
        } else if (method.equals("tenthProb")) {
            runSecondProblem();
        } else {
            Utils.printNotExist();
        }

    }
}

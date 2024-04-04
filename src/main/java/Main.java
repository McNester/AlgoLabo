import java.util.LinkedList;
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
        runFifthProblem();
        runSixthProblem();
        runSeventhProblem();
        runEighthProblem();
        runNinthProblem();
        runTenthProblem();

        Utils.printNewLine();
        System.out.println("You've checked all the problems! Thank you for your time!");

    }

    /*
     * The problem runnners are here
     */
    private static void runFirstProblem() {
        Utils.printNewLine();
        System.out.println("The 1. problem");
        Utils.printNewLine();
        int[] arr = Utils.getArrayInput();
        Utils.printNewLine();
        System.out.println("The minimum val from the array: " + getMin(arr));

    }

    private static void runSecondProblem() {
        Utils.printNewLine();
        System.out.println("The 2. problem");
        Utils.printNewLine();
        int[] array = Utils.getArrayInput();
        Utils.printNewLine();
        System.out.println("The average from the array: " + getAvg(array));

    }

    private static void runThirdProblem() {
        Utils.printNewLine();
        System.out.println("The 3. problem");
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
        System.out.println("The 4. problem");
        Utils.printNewLine();

        int num = Utils.getNumberInput();

        int factorial = getFactorial(num);

        Utils.printNewLine();
        System.out.printf("The factorial of the %d is- %d \n", num, factorial);

    }

    private static void runFifthProblem() {

        Utils.printNewLine();
        System.out.println("The 5. problem");
        Utils.printNewLine();

        int num = Utils.getNumberInput();

        int fib = findFibonacciElement(num);

        Utils.printNewLine();
        System.out.printf("The %d-th element in the Fibonacci sequence is: %d\n", num, fib);

    }

    private static void runSixthProblem() {
        Utils.printNewLine();
        System.out.println("The 6. problem");
        Utils.printNewLine();

        int[] inputs = Utils.getTwoNumberInput();

        int a = inputs[0];
        int n = inputs[1];

        int result = findPower(a, n);

        Utils.printNewLine();
        System.out.printf("The %d-th power of %d is- %d", n, a, result);

    }

    private static void runSeventhProblem() {
        Utils.printNewLine();
        System.out.println("The 7. problem");
        Utils.printNewLine();
        LinkedList<Integer> list = Utils.getLinkedListInput();
        LinkedList<Integer> revList = reverseList(list);

        Utils.printNewLine();
        System.out.print("Here is the reversed array: ");
        Utils.printLinkedList(revList);

    }

    private static void runEighthProblem() {
        Utils.printNewLine();
        System.out.println("The 8. problem");
        Utils.printNewLine();

        String str = Utils.getStrInput();

        Utils.printNewLine();
        System.out.print("Does the string consists of digits?  ");
        if (isAllDigits(str)) {
            System.out.print("Yes\n");
        } else {
            System.out.print("No\n");
        }
    }

    private static void runNinthProblem() {
        Utils.printNewLine();
        System.out.println("The 9. problem");
        Utils.printNewLine();

        int[] inputs = Utils.getTwoNumberInput();
        int n = inputs[0];
        int k = inputs[1];

        int bin = findBinomial(n, k);

        Utils.printNewLine();

        System.out.printf("The C(%d,%d) is: %d\n", n, k, bin);

    }

    private static void runTenthProblem() {
        Utils.printNewLine();
        System.out.println("The 10. problem");
        Utils.printNewLine();

        int[] inputs = Utils.getTwoNumberInput();

        int a = inputs[0];
        int b = inputs[1];

        int gcd = findGCD(a, b);
        System.out.printf("The GCD(%d,%d) is: %d\n", a, b, gcd);

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

    private static int findPower(int a, int n) {
        int res = a;
        for (int i = 1; i < n; i++) {
            res *= a;
        }

        return res;

    }

    private static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();

        for (int i = (list.size()) - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        return reversedList;

    }

    private static boolean isAllDigits(String str) {
        return str.matches("\\d+");
    }

    private static int findBinomial(int n, int k) {

        if (n == k || k == 0) {
            return 1;
        }

        return findBinomial(n - 1, k - 1) + findBinomial(n - 1, k);

    }

    private static int findGCD(int a, int b) {

        if (b == 0) {
            return a;
        }

        return findGCD(b, a % b);

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
            runSixthProblem();
        } else if (method.equals("seventhProb")) {
            runSeventhProblem();
        } else if (method.equals("eighthProb")) {
            runEighthProblem();
        } else if (method.equals("ninthProb")) {
            runNinthProblem();
        } else if (method.equals("tenthProb")) {
            runTenthProblem();
        } else {
            Utils.printNotExist();
        }

    }
}

import java.util.LinkedList;
import java.util.Scanner;

/*
 * The Main class that contains all the functionality
 * and all the solutions to the 10 problems.
 * */

public class Main {
    public static void main(String[] args) {

        if (args.length == 1) {
            executeFromCmd(args[0]);
        } else if (args.length == 0) {
            main();
        } else {
            Utils.printNotExist();
        }
    }

    /*
     * This function executes all the ten problems sequentially
     * this method is executed only when the class runned through Idea or through
     * command line(seraf)
     */

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
     * For the 1. problem:
     * -You are given a number “n” and an array of “n” elements,
     * write the function that returns minimum of them.
     *
     * The method takes an array from the user using Utils class
     * And using the method @see #getMin(int[]) it prints the lowest number in the
     * given array
     */
    private static void runFirstProblem() {
        Utils.printNewLine();
        System.out.println("The 1. problem");
        Utils.printNewLine();
        int[] arr = Utils.getArrayInput();
        Utils.printNewLine();
        System.out.println("The minimum val from the array: " + getMin(arr));

    }

    /*
     * For the 2. problem:
     * -You are given a number “n” and an array of “n” elements,
     * write the function that returns average of them.
     *
     * The method takes an array from the user using Utils class
     * And using the @see #getAvg(int[]) prints the average of the given array.
     */
    private static void runSecondProblem() {
        Utils.printNewLine();
        System.out.println("The 2. problem");
        Utils.printNewLine();
        int[] array = Utils.getArrayInput();
        Utils.printNewLine();
        System.out.println("The average from the array: " + getAvg(array));
    }

    /*
     * For the 3. problem:
     * -You are given a number “n”, write the function for checking whether“n” is
     * prime.
     *
     * The method takes a number from the User using Utils class
     * And using the @see #isPrime(int) prints either the number is prime or not.
     */
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

    /*
     * For the 4. problem:
     * -You are given a number “n”, write the program using recursion for finding
     * “n!”
     *
     * The method takes a number from the User using Utils class
     * And using @see #getFactorial(#int) print the factorial of the given number.
     */
    private static void runFourthProblem() {
        Utils.printNewLine();
        System.out.println("The 4. problem");
        Utils.printNewLine();

        int num = Utils.getNumberInput();

        int factorial = getFactorial(num);

        Utils.printNewLine();
        System.out.printf("The factorial of the %d is- %d \n", num, factorial);

    }

    /*
     * For the 5. problem:
     * -You are given a number “n”, write the function for finding
     * N-th elements in Fibonacci sequence using recursion.
     *
     * The method take a number from the User using Utils class
     * And using @see #findFibonacciElement(int) prints the n-th(from use input)
     * element
     * In Fibonacci sequence.
     */
    private static void runFifthProblem() {

        Utils.printNewLine();
        System.out.println("The 5. problem");
        Utils.printNewLine();

        int num = Utils.getNumberInput();

        int fib = findFibonacciElement(num);

        Utils.printNewLine();
        System.out.printf("The %d-th element in the Fibonacci sequence is: %d\n", num, fib);

    }

    /*
     * For the 6. problem:
     * -You are given numbers “a” and “n”, write the function that returns “a^n”.
     *
     *
     * The method takes two numbers(a,n) from the User using Utils class
     * And prints the a in the power of n using @see #findPower(int, int).
     */

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

    /*
     * For the 7. problem:
     * -You are given a number “n” and an array of “n” elements,
     * write the program that returns given array in reverse order
     * without using array data structure.
     *
     *
     * This method takes array from user using the Utils class
     * And prints the reversed array using @see #reverseList(LinkedList<Integer>).
     *
     * The solution uses LinkedList instead of the array.
     */

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

    /*
     * For the 8. problem:
     * -You are given a string “s”, write the function for checking whether “s” is
     * all consists of digits.
     *
     * This method takes a string from the User using Utils class
     * And prints if the given string consists of digits only using @see
     * #isAllDigits(String).
     */

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

    /*
     * For the 9. problem:
     * -You are given numbers“n” and “k”,write the program that finds (binomial
     * coefficient) using formula.
     *
     *
     * This method takes two numbers(n,k) from the User using Utils class
     * And prints the binomial coefficient(C(n,k)) using @see
     * #findBinomial(int,int).
     */

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

    /*
     * For the 10. problem:
     * -You are given “a” and “b”, write the function for finding GCD(a, b) using
     * recursion.
     * (Hint: Euclidean Algorithm)
     *
     *
     * This method takes two numbers(a,b) from the User using Utils class
     * And prints their GCD using @see #findGCD(int,int)
     */

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
     * The method finds the minimum value in the given array
     *
     * It uses for-loop to iterate through elements of the array
     * Thus it has O(n) time complexity, where n is the length of the array.
     *
     * @param array The array where we find the minimum element.
     * 
     * @return The minimum of the given array.
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

    /*
     * The method calculates the average value of all of the values
     * In the given array.
     *
     * It uses for-loop to iterate through each element
     * Thus it has O(n) time complexity, where n is the length of the array.
     *
     * @param array The array from which we calculate the average.
     * 
     * @return The average of the elements of the given array.
     *
     */
    private static double getAvg(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = sum / (double) array.length;

        return avg;
    }

    /*
     * The method identifies whether the given number is prime or not.
     *
     * It uses the for-loop from 2 to the n-1 and checks for when
     * The number is 0 and 1(they are not prime),
     * Thus the time complexity is O(√n).
     *
     * @param n The number which we identify of being prime or not.
     * 
     * @return Bollean value of the number being prime(true) or not(false).
     */
    private static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * The method calculates the factorial of the given number.
     *
     * It uses the recursion, by iterating through all the number from n to 1,
     * Thus the time complexity is O(n).
     *
     * @param n The number of which we calculate the factorial.
     * 
     * @return The factorial of the given number.
     *
     */
    private static int getFactorial(int n) {

        if (n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);

    }

    /*
     * The method finds the n-th element from the fibonacci sequence.
     *
     * It uses recursive approach going trought all the numbers from n to the point
     * When the n becomes 0 or the 1, Thus it has time complexity of O(n^2).
     *
     * @param n The index of the element of the fibonacci sequence.
     * 
     * @return The n-th element of the fibonacci sequence.
     *
     */
    private static int findFibonacciElement(int n) {

        if (n == 0) {

            return 0;
        } else if (n == 1) {
            return 1;

        }

        return findFibonacciElement(n - 1) + findFibonacciElement(n - 2);
    }

    /*
     * The method calculates the given power of a given number.
     * 
     * It uses for-loop to iterate through all numbers from 1 to the n(the power),
     * Thus it has time complexity of O(n).
     *
     * @param a The number that we raise to the power of n.
     * 
     * @param n The power to which we raise the number a.
     * 
     * @return The given number a to the given n-th power.
     */
    private static int findPower(int a, int n) {
        int res = a;
        for (int i = 1; i < n; i++) {
            res *= a;
        }

        return res;

    }

    /*
     * The method reverses the given array without changing the original array.
     *
     * It uses for-lop to iterate through all the elements of the array,
     * Additionally the method using LinkedList instead of usual arrays,
     * Thus the method has time complexity of O(n^2), because the LinkedList's get
     * method
     * Has time complexity of O(n), making overall method time complexity O(n^2).
     *
     * @param list The array that we turn into reversed one(not changing the
     * original array)
     * 
     * @return The reversed array of the given one.
     */
    private static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();

        for (int i = (list.size()) - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        return reversedList;

    }

    /*
     * The method identifies wheter the given string consists of all digits or not.
     *
     * It is using the String class built in method matches, where regexp is
     * provided,
     * By using matches method time complexity is O(n) based on the regexp which is
     * relatively simple.
     *
     * @param str The string which we check for consisting of all digits or no.
     * 
     * @return Wheter the given string consists of all digits(true) or not(false).
     */
    private static boolean isAllDigits(String str) {
        return str.matches("\\d+");
    }

    /*
     * The method calculates the binomial of the given n and k.
     *
     * It is using the recursion by iterating from n and k till n == k or k == 0,
     * Thus time complexity is O(2^n).
     *
     * @param n The level in the Pascal's triangle(or just consider it like n from
     * the formula)
     * 
     * @param k The index of the coefficient on the level in the
     * Pascal's triangle(or just consider it like k from the formula.
     * 
     * @return The Binomial of the given n and k.
     */
    private static int findBinomial(int n, int k) {

        if (n == k || k == 0) {
            return 1;
        }

        return findBinomial(n - 1, k - 1) + findBinomial(n - 1, k);

    }

    /*
     * The method finds the GCD of the give a and b numbers.
     *
     * It uses the recursion by iterating while a%b equals 0,
     * Thus time complexity is O( log( min( a, b ) ) ), because the size of the
     * problem
     * Reduces at least by a foctor of 2 with every iteration.
     *
     * @param a The first number for which we find GCD(a,b).
     * 
     * @param b The second number for which we find GCD(a,b).
     * 
     * @return The GCD of the given two numbers a and b.
     */
    private static int findGCD(int a, int b) {

        if (b == 0) {
            return a;
        }

        return findGCD(b, a % b);

    }

    /*
     * The method is executing parts of the code based on the command line input
     * (e.g. seraf firstProb executes @see #runFristProblem())
     */
    private static void executeFromCmd(String method) {
        if (method.equals("list")) {
            Utils.printNewLine();
            System.out.println("To run the problem(ordinal_numberProb)- firstProb,secondProb,thirdProb, etc.");
            System.out.println("To run all the problems one by one- just run seraf without any specification.");
            System.out.println("*There are 10 problems.");
            Utils.printNewLine();

        } else if (method.equals("firstProb")) {
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

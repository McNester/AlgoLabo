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

    private static void main() {
        Utils.printNewLine();
        runFirstProblem();

    }

    private static void runFirstProblem() {
        System.out.println("The first problem");
        Utils.printNewLine();
        int[] arr = Utils.getArrayInput();
        Utils.printNewLine();
        System.out.println("The minimum val from the array:" + getMin(arr));

    }

    private static int getMin(int[] array) {
        int n = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < n) {
                n = array[i];
            }
        }

        return n;
    }

    private static void executeFromCmd(String method) {

        System.out.println(method);

    }
}

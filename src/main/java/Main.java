public class Main {
    public static void main(String[] args) {

        if (args.length == 1) {
            executeFromCmd(args[0]);
        } else if (args.length == 0) {
            int[] array = { 10, 1, 32, 3, 45 };

            System.out.println(getMin(array));
        } else {
            System.out.println("Command does not exist");
        }
    }

    public static int getMin(int[] array) {
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

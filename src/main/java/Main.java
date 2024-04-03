public class Main {
    public static void main(String[] args) {

        int[] array = {10,1,32,3,45};
        System.out.println(getMin(array));
    }

    public static int getMin(int[] array){
        int n = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++){
            if(array[i] < n){
                n = array[i];
            }
        }

        return n;
    }
}

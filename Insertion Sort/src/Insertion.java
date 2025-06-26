import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {

        int[] array = new int[] {12, 14, 32, 45, 25, 54, 64, 87, 98, 23};

        InsertSort(array);


    }

    public static void InsertSort (int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int j = i;
            while (j > 0 && arr[j -1] > current) {
                arr[j] = arr[j -1];
                j--;
            }
            arr[j] = current;
            count++;
            // System.out.println(Arrays.toString(arr));
        }
        // System.out.println("Колличество итераций: " + count);
    }
}

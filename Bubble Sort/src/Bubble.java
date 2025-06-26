public class Bubble {
    private static int counter = 0;
    public static void main(String[] args) {
        int[] array = new int[] {12, 14, 32, 45, 25, 54, 64, 87, 98, 23};

        // printArray(array);
        bubbleSort(array);


    }


    public static void bubbleSort (int[] arr) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                counter++;
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                }
            }

            // printArray(arr);
        }
        // System.out.println("Количество итераций: " + counter);
    }

    private static void printArray (int[] arr) {
        System.out.print("|");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println(" ");
    }
}

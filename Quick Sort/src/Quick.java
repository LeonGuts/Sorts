import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] array = new int[] {12, 14, 32, 45, 25, 54, 64, 87, 98, 23};

        quickSort(array, 0, array.length-1);
    }



    public static void quickSort(int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);
            // printSortStep(arr, from, to, divideIndex);
            quickSort(arr, from, divideIndex-1);
            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap (int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    private static void printSortStep (int[] arr, int from, int to, int partIndex) {
        System.out.println(arrayToString(arr));
        System.out.println("Partition at index: " + partIndex);
        System.out.println("Left: " + arrayToString(Arrays.copyOfRange(arr, from, partIndex))
        + " Right: " + arrayToString(Arrays.copyOfRange(arr, partIndex, to + 1)));
    }


    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("-> ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                sb.append(arr[i]).append(" ");
                break;
            }
            sb.append(arr[i]).append(", ");
        }
        sb.append("<-");
        return sb.toString();
    }
}

public class Merge {
    public static void main(String[] args) {
        int[] array = new int[] {12, 14, 32, 45, 25, 54, 64, 87, 98, 23};

        mergeSort(array);
    }

    public static int[] mergeSort(int[] array) {
        int[] tmp;
        int[] currentArr = array;
        int[] currentRes = new int[array.length];

        int size = 1;
        while (size < array.length) {
            for (int i = 0; i < array.length; i+= 2 * size) {
                merge(currentArr, i, currentArr, i + size, currentRes, i, size);
            }
            tmp = currentArr;
            currentArr = currentRes;
            currentRes = tmp;

            size = size * 2;

            System.out.println(arrayToString(currentArr));
        }
        return currentArr;
    }
    private static void merge(int[] arr1, int arr1Start, int[] arr2, int arr2Start,
                              int[] res, int resStart, int size) {
        int index1 = arr1Start;
        int index2 = arr2Start;

        int arr1End = Math.min(arr1Start + size, arr1.length);
        int arr2End = Math.min(arr2Start + size, arr2.length);

        int iterationCount = arr1End - arr1Start + arr2End - arr2Start;

        for (int i = resStart; i < resStart + iterationCount; i++) {
            if (index1 < arr1End && (index2 >= arr2End || arr1[index1] < arr2[index2])) {
                res[i] = arr1[index1];
                index1++;
            } else {
                res[i] = arr2[index2];
                index2++;
            }
        }
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

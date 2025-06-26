public class Test1 {
    public static void main(String[] args) {
        test1();

    }

    private static void test1() {
        final int testLength = 100000;
        int[] arr1 = new int[testLength];
        int[] arr2 = new int[testLength];
        MeasureTime test = new MeasureTime();

        System.out.println("-------Генерация случайного массива-------");

        for (int i = 0; i < testLength; i++) {
            arr2[i] = arr1[i] = (int)Math.round(Math.random() * 10000);
        }

        System.out.print("Быстрая сортировка: ");
        test.measureTime(() -> Quick.quickSort(arr1, 0, testLength-1));

        System.out.print("Сортировка пузырьком: ");
        test.measureTime(() -> Bubble.bubbleSort(arr2));

        System.out.print("Сортировка слиянием: ");
        test.measureTime(() -> Merge.mergeSort(arr1));

        System.out.print("Сортировка вставкой: ");
        test.measureTime(() -> Insertion.InsertSort(arr2));
    }
}

package sortingAlgo;

public class BubbleSort {
    public static void main(String[] args) {
        int[] n = {8, 3, 29, 10, 1, 48, 5};

        bubbleSort(n);
        for (int a : n)
            System.out.println(a);
    }

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }

    }
}

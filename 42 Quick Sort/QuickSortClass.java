public class QuickSortClass {
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        System.out.println("Given Array");
        displayArray(arr);

        System.out.println();

        quicksortArray(arr, 0, arr.length - 1);
        System.out.println("\nSorted array");
        displayArray(arr);

    }

    private static void quicksortArray(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }
        int pivot = partition(arr, i, j);
        // Recursively sort elements on the left of pivot and right of pivot
        quicksortArray(arr, i, pivot - 1);
        quicksortArray(arr, pivot + 1, j);
    }

    private static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int cnt = 0;

        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot) {
                cnt++;
            }
        }

        int pivotIndex = st + cnt;
        swap(arr, st, pivotIndex);

        int i = st, j = end;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    private static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
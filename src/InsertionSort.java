public class InsertionSort implements SortingAlgorithm {

    public void sort(int[] a) {
        insertionSort(a);
    }

    public void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                swap(a, j, j - 1);
                j--;
            }
        }
    }

    public void swap(int[] a, int x, int y) {
        int temp = a[y];
        a[y] = a[x];
        a[x] = temp;
    }
}

public class QuickSort implements SortingAlgorithm {

    public void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
        reverseArray(a);
    }

    public void quickSort(int[] a, int start, int end) {
        if (start < end) {

            int pivot = sort(a, start, end);

            quickSort(a, start, pivot - 1);
            quickSort(a, pivot + 1, end);
        }
    }

    public int sort(int[] a, int start, int end) {
        int pivot = start;
        int i = end;
        for(int j = end; j > start; j--){
            if(a[j] < a[pivot]){
                swap(a, i, j);
                i--;
            }
        }
        swap(a, pivot, i);
        return i;
    }

    public void reverseArray(int[] a){
        int i = 0;
        int j = a.length - 1;
        while(i <= j){
            swap(a, i, j);
            i++;
            j--;
        }
    }

    public void swap(int[] a, int indexA, int indexB) {
        int temp = a[indexA];
        a[indexA] = a[indexB];
        a[indexB] = temp;
        //System.out.println("swap" + indexA + " and " + indexB);

    }

    public static void printArray(int[] a){
        String temp = "";
        for(int i = 0; i < a.length; i++){
            temp += a[i] + " ";
        }
        System.out.println(temp);
    }
}

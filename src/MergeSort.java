public class MergeSort implements SortingAlgorithm {

    public void sort(int[] a) {
        mergeSort(a);
    }

    public void merge(int[] a, int[] left, int[] right){
        int indexLeft = 0;
        int indexRight = 0;
        for(int i = 0; i < a.length; i++){
            if(indexLeft == left.length){
                a[i] = right[indexRight];
                indexRight++;
            } else if(indexRight == right.length){
                a[i] = left[indexLeft];
                indexLeft++;
            } else if(right[indexRight] < left[indexLeft]){
                a[i] = right[indexRight];
                indexRight++;
            } else{
                a[i] = left[indexLeft];
                indexLeft++;
            }
        }
    }

    public void mergeSort(int[] a){
        if(a.length > 1){
            int[] left = getLeft(a);
            int[] right = getRight(a);
            mergeSort(left);
            mergeSort(right);
            merge(a, left, right);
        }
    }

    public int[] getLeft(int[] a){
        int mid = a.length / 2;
        int[] temp = new int[mid];
        for(int i = 0; i < mid; i++){
            temp[i] = a[i];
        }
        return temp;
    }

    public int[] getRight(int[] a){
        int mid = a.length / 2;
        int count = 0;
        for(int i = mid; i < a.length; i++){
            count++;
        }
        int[] temp = new int[count];
        for(int i = mid; i < a.length; i++){
            temp[i - mid] = a[i];
        }
        return temp;
    }
}

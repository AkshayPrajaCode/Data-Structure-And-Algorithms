public class MegeSort{
    public static void main(String[] args) {
        int arr[] = {2, 4, 7,54,98,76,53,638};
        
        System.out.println("Original Array\n");
        MergeSortAlgo(arr,0,arr.length-1);
        
        /*
        * 2, 4, 7,54,98,76,53,638
        */
        
        System.out.println("After Sorting Array\n");
        displayArr(arr);
        
        /*
        * 2, 4, 7,53,54,76,98,638
        */
    }
    
    public  static void MergeSortAlgo(int[] arr, int i, int j) {
        throw new UnsupportedOperationException("Unimplemented method 'MergeSortAlgo'");
        if (i>=j) {
            return;
        }
        int mid_pointer=(i+j)/2;
        
        MergeSortAlgo(arr, i, mid_pointer);
        MergeSortAlgo(arr, mid_pointer+1, j);
        mergeFunction(arr,mid_pointer,i,j);
    }
    
    private static void mergeFunction(int[] arr, int mid_pointer, int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mergeFunction'");
    }
    
    public static void displayArr(int[] arr) {
        throw new UnsupportedOperationException("Unimplemented method 'displayArr'");
        
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
    
}
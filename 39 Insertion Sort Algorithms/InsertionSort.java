public class InsertionSort{
    public static void main(String[] args) {
        int arr[] = {12,85,54,87,65,25,85,35};
        insertionsort(arr);
        System.out.println("The sorted array is: ");
        for(int val : arr){
            System.out.println(val + " ");
        }           
        }  
    
    
    // Function to sort an array using the insertion sort algorithm
    public static void insertionsort(int arr[]) {
        int n = arr.length;
       
        
        for(int i=1;i<n;i++){
            int j=1;
            while (j>0&& arr[j]>arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;              
            }                                          
        }           
    }           
}
                
            
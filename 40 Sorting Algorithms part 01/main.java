public class main {
    
    /*
     * input ["Apple","papaya", "kiwi", "banana"]

    output ["Apple", "Banana", "Kiwi", "Papaya"]
     */
    

    public static void main(String[] args) {
        String [] fruits = {"Apple","papaya", "kiwi", "banana"};  //input array
        
        sortFruitsAlphabetically(fruits);  
        //call the method
        
        System.out.println(" Sorting  order:\n");
        for (String val : fruits){
            System.out.print(val + " ");
        }
        
    }

    static  void sortFruitsAlphabetically(String[] arr){
        int n = arr.length;
        for (int i= 0; i<n-1;i++){
        int     min_index=i;

            for(int j=i+1;j<n-1;j++){
                if(arr[j].compareTo(arr[min_index]) < 0){
                    min_index=i;

            }

        }
        //swap

        String temp = arr[i];
        arr[i]=arr[min_index];
        arr[min_index] =temp;
      }
}
}

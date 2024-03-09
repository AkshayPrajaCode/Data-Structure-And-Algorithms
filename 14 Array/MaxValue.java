public class MaxValue {
    public static void main(String[] args) {
        int [] arr={45,87,34,23,45,67};
        int maxValue=0;
       for (int i = 0; i < arr.length; i++) {
        if(arr[i]>maxValue){
            maxValue=arr[i];
        }
       }
       System.out.println(maxValue);
    }
}

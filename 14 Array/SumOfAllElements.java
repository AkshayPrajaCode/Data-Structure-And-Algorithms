public class SumOfAllElements {
    public static void main(String[] args) {
        int [] arr={45,87,34,23,45,67};
        int sum=0;
        for (int i : arr) {
            sum +=i;
        }
        System.out.println(sum);
    }
}

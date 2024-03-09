public class PresentElements {

    public static void main(String[] args) {
        int [] arr={45,87,34,23,45,67};
        int x=34;
    int ans=-1;


    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==x){
            ans=i;
        }

    }
        System.out.println(x +" at present in index " +ans);
    }
}
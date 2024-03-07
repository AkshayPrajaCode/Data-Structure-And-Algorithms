public class moveZero {

   public static void main(String[] args) {
    int [] nums ={45,35,0,87,76};
    int n = nums.length;


    for(int i=0; i<n-1;i++){
        for(int j= 0; j<n-i-1;j++){
            if(nums[j]==0 && nums[j+1]!=0){
                //swap the element like  this: nums[i]=nums[j]; nums[j]=nums[i];
                int temp = nums[i];
                nums[i] = nums[j+1];
                nums[j+1]=temp;
                }
        }
     }
            
    for(int val : nums){
        System.out.print(val + " ");
    }

   }


}
public class moveZero {
    public static void main(String[] args) {
        int[] nums = {45, 35, 0, 87, 76,95,345,0,345,234,34,0,0};
        moveZeros(nums);
        for (int val : nums) {
            System.out.print(val + " ");
        }
    }

    public static void moveZeros(int[] nums) {
        int index = 0; // Index to track the position to place non-zero elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // If the current element is non-zero, move it to the current index and increment index
                nums[index++] = nums[i];
            }
        }
        // Fill the remaining positions with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}

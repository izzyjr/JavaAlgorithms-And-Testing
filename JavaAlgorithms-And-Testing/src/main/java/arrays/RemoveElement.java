package arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == val) {
                    count++;
                }
                if (j + 1 < nums.length) {
                    if (nums[j] == val) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }
        }

        return nums.length - (count / nums.length);
    }
}

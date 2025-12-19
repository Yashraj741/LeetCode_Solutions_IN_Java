// Save the file with the name of solution.java to run in localdevice
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // Brute force: Check every pair
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // Return empty if no solution found
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Testing with your specific failing case
        int[] nums = {3, 2, 4};
        int target = 6;
        
        int[] result = sol.twoSum(nums, target);
        
        // This will print [1, 2] because nums[1] + nums[2] (2 + 4) = 6
        System.out.println("Indices: " + Arrays.toString(result));
    }
}

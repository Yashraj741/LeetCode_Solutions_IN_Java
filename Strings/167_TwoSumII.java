class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1}; 
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}
// public class TwoSumII {
//     public int[] twoSum(int[] numbers, int target) {
//         int left = 0;
//         int right = numbers.length - 1;
//         while (left<right) {
//             int sum = numbers[left] + numbers[right];
//             if(sum == target) {
//                 return new int[]{left+1, right+1};
//             }else if(sum> target) {
//                 right++;
//             }else if(sum<target) {
//                 left++;
//             }
//         }
//         return new int[]{};
//     }
//     public static void main(String[] args) {
//         TwoSumII obj = new TwoSumII();
//         int[] n = {1,2,3,4};
//         int[] ans = obj.twoSum(n, 5);
//         System.out.println(ans[0]+" "+ans[1]);
//     }
// }
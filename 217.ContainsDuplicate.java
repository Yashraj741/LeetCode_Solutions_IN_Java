// Save the file with the name of solution.java to run in localdevice
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i =0;i<=nums.length;i++){
            if(nums[i]==nums[i+1]){
                return true;
        } 
    }
    return false;
}
}
import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean res = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums ) {
            if(map.containsKey(num)) {
                res = true;
                break;
            }
            map.put(num, 1);
        }
        return res;
    }
}
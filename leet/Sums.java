
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numIndex = new HashMap<>();
        for(int i = 0;i < nums.length ; i++)
        {
            int k = target - nums[i];
            if(numIndex.containsKey(k)){
                return new int[]{i,numIndex.get(k)};
            }
            numIndex.put(nums[i],i);
        }
        return null;
    }
}
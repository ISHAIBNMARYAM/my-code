package leetcode;

public class twosum {


	
    public int[] twoSum(int[] nums, int target) {
        int complement; 
        //loop to check every element in the array
        for (int x = 0; x<nums.length; x++) {  
            complement = target - nums[x];
            //loop to find complement of current element
            for (int y = 0; y<nums.length; y++) { 
                //we cannot use same element twice.
                if (x ==  y) { continue; } 
                if (nums[y] == complement) {
                    return new int[] {x, y};
                }
            }            
        }
        return new int[] {0, 0};
    }
}

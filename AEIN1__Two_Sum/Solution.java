package AEIN1__Two_Sum;


//
//https://leetcode.com/submissions/detail/949311862/
//


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length -1; i++)
            for(int j = i+1; j < nums.length; j++){
                if((nums[i]+nums[j]) == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        result[0] = -1;
        result[1] = -1;
        return result;
    }
}
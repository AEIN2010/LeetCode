package AEIN27__Remove_Element;

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                res[j] = nums[i];
                j++;
            }
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = res[i];
        }

        return j;

    }
}

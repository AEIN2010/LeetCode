package AEIN26__Remove_Duplicates_from_Sorted_Array;

import java.util.Arrays;

public class Solution {

    static public int removeDuplicates(int[] nums) {
        int k = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }


    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println(removeDuplicates(new int[]{1,1}));
        System.out.println(removeDuplicates(new int[]{1,2,2}));
    }
}

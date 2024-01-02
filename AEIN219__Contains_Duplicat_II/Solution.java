package AEIN219__Contains_Duplicat_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    static public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, List<Integer>> myHashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!myHashMap.containsKey(nums[i])){
                myHashMap.put(nums[i], new ArrayList<>());
            }
            myHashMap.get(nums[i]).add(i);
        }
        List<List<Integer>> repeatedNumbersList = myHashMap.values().stream().filter(integers -> integers.size() > 1).toList();

        for(List<Integer> list : repeatedNumbersList){
            for(int i = list.size()-1; i > 0; i--){
                for(int j = i-1; j > -1; j--){
                    if(Math.abs(list.get(i) - list.get(j)) <= k){
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {695,924,678,851,955,250,536,860,270,329,285,802,258,880,911,775,818,786,864,763,313,376,270,754,234,656,675,581,339,792,218,364,449,310,433,574,404,154,546,353,879,641,794,412,515,506,543,269,63,41,294,566,142,313,163,632,474,26,621,876,322,5,375,784,252,678,388,514,958,596,367,897,482,479,690,3,717,270,937,667,44,169,733,652,963,318,315,839,142,482,57,207,710,127,647,431,56,722,509,717,811,961,837,855,446,120,316,297,908,609,892,622,332,378,374,400,645,756,694,844,373,229,532,394,836,680,80,709,260,567,452,625,938,584,836,5,408,103,211,628,962,109,893,114,952,905,451,800,729,331,248,415,4,654,639,255,336,635,179,268,942,564,981,368,578,472,252,94,864,976,790,936,328,684,677,973,76,490,947,507,540,};
        System.out.println(containsNearbyDuplicate(arr, 5858));
    }
}
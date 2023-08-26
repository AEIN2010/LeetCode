package AEIN169__Majority_Element;

import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class solution169 {

    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> myMap = new HashMap<>();
        int sizee = nums.length/2;
        for(int i = 0; i < nums.length; i++){
            int j = nums[i];
            if (myMap.containsKey(j)){
                myMap.put(j, myMap.get(j)+1);
                if(myMap.get(j) > sizee){
                    return j;
                }
            }else{
                myMap.put(j, 1);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
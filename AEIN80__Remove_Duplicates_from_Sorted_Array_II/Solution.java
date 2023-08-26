package AEIN80__Remove_Duplicates_from_Sorted_Array_II;

class Solution {
    static public int removeDuplicates(int[] nums) {

        int pointer1 = 0;//used as a checkpoint
        int pointer2 = 0;//used to check next element
        int occurrences = 1;//used to check how many times a number occurred in sequence
        int index = 1;//the number to be returned as a result
        int flagCounter = 0;

        if(nums.length < 3){
            return nums.length;
        }else {
            pointer1 = nums[0];
            pointer2 = nums[0];

            for(int i = 1; i < nums.length; i++){
                flagCounter ++;
                pointer2 = nums[i];
                if (pointer1 == pointer2){
                    occurrences++;
                    if((occurrences > 2)){
                        //start shifting
                        if(i != nums.length-1){
                            flagCounter++;
                            if(flagCounter > nums.length-1){
                                break;
                            }
                            for(int j = i; j < nums.length-1; j++){
                                int temp = nums[j];
                                nums[j] = nums [j+1];
                                nums[j+1] = temp;
                            }
                            i--;
                        }else{
                            break;
                        }
                    }else{
                        index++;
                    }

                }else if(pointer1 < pointer2){
                    //continue normal
                    pointer1 = nums[i];
                    occurrences = 1;
                    index = i+1;
                }else{
                    break;//you reached the end (index)
                }

            }
        }

        return index;
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[]{0,0,0,0,3}));//3
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));//5
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));//7
    }
}
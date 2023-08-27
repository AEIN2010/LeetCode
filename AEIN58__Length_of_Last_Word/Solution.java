package AEIN58__Length_of_Last_Word;




class Solution {
    public int lengthOfLastWord(String s) {
        int wLength = 0;
        int sLength = s.length();
        boolean flag = false;
        while (sLength != 0){
            sLength--;
            if(s.charAt(sLength) != ' '){
                flag = true;
                wLength++;
            }else if((s.charAt(sLength) == ' ') && flag){
                break;
            }
        }

        return wLength;
    }
}
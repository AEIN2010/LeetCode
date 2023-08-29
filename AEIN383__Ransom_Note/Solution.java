package AEIN383__Ransom_Note;

class Solution {
    static public boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0; i < ransomNote.length(); i++){
            if (magazine.contains(ransomNote.subSequence(i,i+1))){
                magazine = magazine.replaceFirst(ransomNote.charAt(i)+"", "");
            }else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(canConstruct("aa","ab"));
    }
}
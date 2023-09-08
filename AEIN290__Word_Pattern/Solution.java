package AEIN290__Word_Pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    static public boolean wordPattern(String pattern, String s) {

        String[] newS = s.split(" ");
        HashMap<Character, List<Integer>> positions = new HashMap<>();

        List<String> passedWords = new ArrayList<>();


        if (pattern.length() != newS.length){
            return false;
        }


        for(int i = 0; i < pattern.length(); i++){
             if(!positions.containsKey(pattern.charAt(i))){
                 positions.put(pattern.charAt(i), new ArrayList<>());
             }
             positions.get(pattern.charAt(i)).add(i);
        }

        String fL;
        while (!pattern.equals("")){
            fL = newS[positions.get(pattern.charAt(0)).get(0)];
            if (passedWords.contains(fL)){
                return false;
            }
            passedWords.add(fL);
            for( int p : positions.get(pattern.charAt(0))){
                if(!newS[p].equals(fL)){
                    return false;
                }
            }

            pattern = pattern.replace(pattern.substring(0,1), "");
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abpaabpa","dog cat cat dog dog cat cat dog"));
        System.out.println(wordPattern("",""));
        System.out.println(wordPattern("",""));
    }
}

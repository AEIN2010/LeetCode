package AEIN20__Valid_Parentheses;

class Solution {
    int pointer = -1;
    char[] chars;

    public boolean isValid(String s) {

        if(s.length()%2 != 0)
            return false;

        chars = new char[s.length()];


        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) == 40)
                    || (s.charAt(i) == 91)
                    || (s.charAt(i) == 123)){

                pointer++;
                chars[pointer] = s.charAt(i);

            }else{
                if(pointer == -1)
                    return false;
                if(((s.charAt(i) == 41) && (chars[pointer] == 40))
                        || ((s.charAt(i) == 93) && (chars[pointer] == 91))
                        || ((s.charAt(i) == 125) && (chars[pointer] == 123))){

                    pointer--;
                    continue;
                }

                return false;
            }

        }

        if(pointer != -1)
            return false;
        return true;
    }
}

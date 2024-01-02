package AEIN1071__Greatest_Common_Divisor_of_Strings;

import java.util.Arrays;

public class Solution {

    public static String gcdOfStrings(String str1, String str2) {
        String s1 = str1;
        String s2 = str2;
        String gcd = str1.substring(0,1);

        while (str1.startsWith(gcd) && str2.startsWith(gcd)){
            gcd = str2.substring(0, gcd.length()+1);
        }
        gcd = str2.substring(0, gcd.length()-1);

        while(gcd.length() != 0){
            while(gcd.length() >= str2.length()){
                if(str2.startsWith(gcd)){
                    str2 = str2.substring(0, gcd.length());
                }
            }
        }



//            if(str1.length() > str2.length() || str1.length() == str2.length()){
//                while((str1.length() > 0) && (str2.length() > 0)){
//                    if(str1.startsWith(str2)){
//                        str1 = str1.substring(str2.length(), str1.length());
//                    }else{
//                        str2 = str2.substring(0, str2.length() - 1);
//                        str1 = s1;
//                    }
//                }
//
//                while((s2.length() > 0) && (str2.length() > 0)){
//                    if(s2.startsWith(str2)){
//                        s2 = s2.substring(str2.length());
//                    }
//                    else{
//                        return "";
//                    }
//                }
//
//                return str2;
//            }else{
//                while((str2.length() > 0) && (str1.length() > 0)){
//                    if(str2.startsWith(str1)){
//                        str2 = str2.substring(str1.length(), str2.length());
//                    }else{
//                        str1 = str1.substring(0, str1.length() - 1);
//                        str2 = s2;
//                    }
//                }
//
//                while((s1.length() > 0) && (str1.length() > 0)){
//                    if(s1.startsWith(str1)){
//                        s1 = s1.substring(str1.length());
//                    }
//                    else{
//                        return "";
//                    }
//                }
//
//                return str1;
//            }



//        String s1 = str1;
//        String gcd = str2.substring(0,1);
//
//        while((str1.length() >= gcd.length()) && (str2.length() >= gcd.length())){
//            if(str1.startsWith(gcd)){
//                str1 = str1.substring(gcd.length(),str1.length());
//            }else{
//                try {
//                    gcd = str2.substring(0, gcd.length()+1);
//                }catch (StringIndexOutOfBoundsException e){
//                    return "";
//                }
//                str1 = s1;
//            }
//        }
//
//
//
//
//        while(str2.length() >= gcd.length()){
//            if(str2.startsWith(gcd)){
//                str2 = str2.substring(gcd.length());
//            }
//            else{
//                return "";
//            }
//        }
//
        return gcd;

    }



    public static void main(String[] args) {

        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
        System.out.println(gcdOfStrings("ABABAB", "ABABAB"));

    }
}

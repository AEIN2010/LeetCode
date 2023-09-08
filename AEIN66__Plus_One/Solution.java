package AEIN66__Plus_One;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    static public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }

    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{9,8,7,6,5,4,3,2,1,0}));
    }
}
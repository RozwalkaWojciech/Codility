package pl.rozwalka.codility.binarygap;

import java.util.Arrays;

public class BinaryGap {
    public static void main(String[] args) {

        int integer = 1041;
        String[] split = Integer.toBinaryString(integer).split("");
        int maxGap = 0;
        int count = 0;

        for (String number : split) {
            if (number.equals("0")) {
                count++;
            }
            if (number.equals("1")) {
                if (maxGap < count) {
                    maxGap = count;
                }
                count = 0;
            }
            if (split[0].equals("0") && split[maxGap].equals("1")) {
                maxGap = 0;
            }
        }
        System.out.println(Arrays.toString(split));
        System.out.println(maxGap);
    }
}

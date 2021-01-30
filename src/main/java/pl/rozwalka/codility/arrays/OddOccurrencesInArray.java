package pl.rozwalka.codility.arrays;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {
    public static void main(String[] args) {

        int[] A = {9, 3, 9, 3, 6, 6, 6, 6, 7};
        Set<Integer> set = new HashSet<>();

        for (int number: A ) {
            if (!set.contains(number)){
                set.add(number);
            } else {
                set.remove(number);
            }
        }
        System.out.println(set.stream().findFirst().orElseThrow());
    }

    public int solution(int[] A) {

        Set<Integer> set = new HashSet<>();

        for (int number: A ) {
            if (!set.contains(number)){
                set.add(number);
            } else {
                set.remove(number);
            }
        }
        for(int odd: set) {
            return odd;
        }
        return 0;
    }
}

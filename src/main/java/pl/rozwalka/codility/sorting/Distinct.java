package pl.rozwalka.codility.sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public static void main(String[] args) {

        int[] A = {2, 1, 1, 2, 3, 1};
        Set<Integer> distinct = new HashSet<>();

        for (int numb : A) {
            distinct.add(numb);
        }
        System.out.println(distinct.size());
    }

    public int solution(int[] A) {

        Set<Integer> distinct = new HashSet<>();

        for (int numb : A) {
            distinct.add(numb);
        }
        return distinct.size();
    }
}

package pl.rozwalka.codility.counting.elements;

import java.util.Arrays;

public class PermCheck {
    public static void main(String[] args) {

        int[] A = {4, 1, 3, 2};
        boolean[] bool = new boolean[A.length];
        int max = Arrays.stream(A).max().getAsInt();

        if (max != A.length) {
            System.out.println("0");
        }

        for (int i = 0; i < A.length; i++) {
            bool[A[i] - 1] = true;
        }
        for (int i = 0; i < A.length; i++) {
            if (!bool[i]) {
                System.out.println("0");
            }
        }
        System.out.println(1);

    }

    public int solution(int[] A) {
        boolean[] bool = new boolean[A.length];
        int max = Arrays.stream(A).max().getAsInt();

        if (max != A.length) {
            return 0;
        }
        for (int i = 0; i < A.length; i++) {
            bool[A[i] - 1] = true;
        }
        for (int i = 0; i < A.length; i++) {
            if (!bool[i]) {
                return 0;
            }
        }
        return 1;
    }
}

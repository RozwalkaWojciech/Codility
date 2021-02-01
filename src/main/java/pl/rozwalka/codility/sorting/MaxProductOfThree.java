package pl.rozwalka.codility.sorting;

import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {

        int[] A = {-5, -6, -4, -7, -10};
        int length = A.length;

        Arrays.sort(A);

        int begin = A[0] * A[1];
        int end = A[length - 2] * A[length - 3];

        if (begin > end && A[length - 1] > 0) {
            System.out.println(begin * A[length - 1]);
        }
        System.out.println(end * A[length - 1]);
    }

    public int solution(int[] A) {
        int length = A.length;

        Arrays.sort(A);

        int begin = A[0] * A[1];
        int end = A[length - 2] * A[length - 3];

        if (begin > end && A[length - 1] > 0) {
            return begin * A[length - 1];
        }
        return end * A[length - 1];
    }
}

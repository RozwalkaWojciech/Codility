package pl.rozwalka.codility.sorting;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {

        int[] A = {2147483647, 2147483647, 2147483647};

        if (A.length < 3) {
            System.out.println(0);
        }

        Arrays.sort(A);

        for (int num : A) {
            System.out.println(num);
        }

        for (int i = 0; i < A.length - 2; i++) {
            if ((long) A[i] + A[i + 1] > A[i + 2]) {
                System.out.println(1);
            }
        }
        System.out.println(0);
    }

    public int solution(int[] A) {

        if (A.length < 3) {
            return 0;
        }

        Arrays.sort(A);

        for (int i = 0; i < A.length - 2; i++) {
            if ((long) A[i] + A[i + 1] > A[i + 2]) {
                return 1;
            }
        }
        return 0;
    }
}

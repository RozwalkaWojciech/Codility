package pl.rozwalka.codility.arrays;

import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {

        int[] A = {3, 8, 9, 7, 6};
        int K = 11;
        int[] result = new int[A.length];

        K = K % A.length;
        if (K == 0) {
            result = A;
        }
        for (int i = 0; i < A.length; i++) {
            if (i + K < A.length) {
                result[i + K] = A[i];
            } else {
                result[i - (A.length - K)] = A[i];
            }
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] A, int K) {

        int[] rotateArray = new int[A.length];
        K = K % A.length;

        if(K == 0) {
            return A;
        }
        for(int i = 0; i < A.length; i++) {
            if(i + K < A.length) {
                rotateArray[i + K] = A[i];
            } else {
                rotateArray[i - (A.length - K)] = A[i];
            }
        }
        return rotateArray;
    }
}
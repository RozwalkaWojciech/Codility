package pl.rozwalka.codility.maximum.slice.problem;

public class MaximumSliceSum {
    public static void main(String[] args) {

        int[] A = {3, 2, -6, 4, 0};

        int maxSum = A[0];
        int maxEnd = A[0];

        for (int i = 1; i < A.length; i++) {
            maxEnd = Math.max(A[i], maxEnd + A[i]);
            maxSum = Math.max(maxSum, maxEnd);
        }
        System.out.println(maxSum);
    }

    public int solution(int[] A) {
        int maxSum = A[0];
        int maxEnd = A[0];

        for (int i = 1; i < A.length; i++) {
            maxEnd = Math.max(A[i], maxEnd + A[i]);
            maxSum = Math.max(maxSum, maxEnd);
        }
        return maxSum;
    }
}

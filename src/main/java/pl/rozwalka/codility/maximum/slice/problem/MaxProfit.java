package pl.rozwalka.codility.maximum.slice.problem;

public class MaxProfit {
    public static void main(String[] args) {

        int[] A = {8, 9, 3, 6, 1, 2};  //  23171, 21011, 21123, 21366, 21013, 21367

        if (A.length < 2) {
            System.out.println(0);
        }

        int max = A[0];
        int min = 0;
        int profit = 0;

        for (int i = 1; i < A.length; i++) {

            if (max > A[i]) {
                max = A[i];
                min = 0;
            } else {
                min = A[i];
            }
            if (min != 0) {
                profit = Math.max(min - max, profit);
            }
        }
        if (profit < 0) {
            System.out.println(0);
        }
        System.out.println(profit);
    }

    public int solution(int[] A) {
        if (A.length < 2) {
            return 0;
        }

        int max = A[0];
        int min = 0;
        int profit = 0;

        for (int i = 1; i < A.length; i++) {

            if (max > A[i]) {
                max = A[i];
                min = 0;
            } else {
                min = A[i];
            }
            if (min != 0) {
                profit = Math.max(min - max, profit);
            }
        }
        if (profit < 0) {
            return 0;
        }
        return profit;
    }
}
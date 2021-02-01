package pl.rozwalka.codility.prefix.sums;

public class PassingCars {
    public static void main(String[] args) {

        int[] A = {0, 1, 0, 1, 1};

        int east = 0;
        int west = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                east++;
            }
            if (A[i] == 1 && east > 0) {
                west += east;
            }
            if (west > 1000000000) {
                System.out.println(-1);
            }
        }
        System.out.println(west);
    }

    public int solution(int[] A) {

        int east = 0;
        int west = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                east++;
            }
            if (A[i] == 1 && east > 0) {
                west += east;
            }
            if (west > 1000000000) {
                return -1;
            }
        }
        return west;
    }
}

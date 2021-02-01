package pl.rozwalka.codility.time.complexity;

public class TapeEquilibrium {
    public static void main(String[] args) {

        int[] A = {3, 1, 2, 4, 3};
        int part1 = A[0];
        int part2 = 0;
        for (int i = 1; i < A.length; i++) {
            part2 += A[i];
        }
        int difference = Math.abs(part1 - part2);

        for (int i = 1; i < A.length - 1; i++) {
            part1 += A[i];
            part2 -= A[i];
            if (Math.abs(part1 - part2) < difference) {
                difference = Math.abs(part1 - part2);
            }
        }
        System.out.println(difference);
    }

    public int solution(int[] A) {

        int part1 = A[0];
        int part2 = 0;
        for (int i = 1; i < A.length; i++) {
            part2 += A[i];
        }
        int difference = Math.abs(part1 - part2);

        for (int i = 1; i < A.length - 1; i++) {
            part1 += A[i];
            part2 -= A[i];
            if (Math.abs(part1 - part2) < difference) {
                difference = Math.abs(part1 - part2);
            }
        }
        return difference;
    }
}

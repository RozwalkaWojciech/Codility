package pl.rozwalka.codility.time.complexity;

public class PermMissingElem {
    public static void main(String[] args) {

        int[] A = {2, 1, 4, 5};

        boolean[] elements = new boolean[A.length + 1];

        for (int i = 0; i < A.length; i++) {
            elements[A[i] - 1] = true;
        }
        for (int i = 0; i < elements.length; i++) {
            if (!elements[i]) {
                System.out.println(i +1);
            }
        }
    }

    public int solution(int[] A) {

        boolean[] elements = new boolean[A.length + 1];

        for (int i = 0; i < A.length; i++) {
            elements[A[i] - 1] = true;
        }
        for (int i = 0; i < elements.length; i++) {
            if (!elements[i]) {
                return i + 1;
            }
        }
        return 0;
    }
}
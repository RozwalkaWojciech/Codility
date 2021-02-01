package pl.rozwalka.codility.counting.elements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public static void main(String[] args) {

        int[] A = {4, 1, 3, 2};
        int len = A.length;
        boolean[] bool = new boolean[A.length +1];

        for (int i = 0; i < A.length; i++) {
            bool[A[i]-1] = true;
        }
        for (int i=0; i <A.length; i++){
            if(!bool[i]){
                System.out.println("0");
            }
        }
        System.out.println(1);

    }

    public int solution(int[] A) {

        boolean[] bool = new boolean[A.length +1];

        for (int i = 0; i < A.length; i++) {
            bool[A[i] -1] = true;
        }
        for (int i=0; i <A.length; i++){
            if(!bool[i]){
                return 0;
            }
        }
        return 1;
    }
}

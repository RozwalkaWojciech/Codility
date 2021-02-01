package pl.rozwalka.codility.counting.elements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static void main(String[] args) {

        int X = 5;
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        Set<Integer> leaves = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                leaves.add(A[i]);
                if (leaves.size() == X) {
                    System.out.println(i);
                }
            }
        }
    }
    public int solution(int X, int[] A) {

        Set<Integer> leavesPosition = new HashSet<>();

        for(int i=0; i<A.length; i++){
            if(A[i] <= X) {
                leavesPosition.add(A[i]);
                if(leavesPosition.size() == X){
                    return i;
                }
            }
        }
        return -1;
    }
}

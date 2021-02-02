package pl.rozwalka.codility.leader;

import java.util.HashMap;

public class Dominator {
    public static void main(String[] args) {

        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], 1);
            } else {
                int count = map.get(A[i]);
                map.put(A[i], count + 1);
            }
        }
        int maxNumber = 0;
        int maxCount = 0;
        for (int key : map.keySet()) {
            int curCount = map.get(key);
            if (curCount > maxCount) {
                maxCount = curCount;
                maxNumber = key;
            }
        }
        if (maxCount <= (A.length) / 2) {
            System.out.println(-1);
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] == maxNumber) {
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }

    public int solution(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], 1);
            } else {
                int count = map.get(A[i]);
                map.put(A[i], count + 1);
            }
        }
        int maxNumber = 0;
        int maxCount = 0;
        for (int key : map.keySet()) {
            int curCount = map.get(key);
            if (curCount > maxCount) {
                maxCount = curCount;
                maxNumber = key;
            }
        }
        if (maxCount <= (A.length) / 2) {
            return -1;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] == maxNumber) {
                return i;
            }
        }
        return -1;
    }
}

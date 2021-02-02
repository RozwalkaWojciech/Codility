package pl.rozwalka.codility.leader;

import java.util.HashMap;

public class EquiLeader {
    public static void main(String[] args) {

        int[] A = {4, 3, 4, 4, 4, 2};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], 1);
            } else {
                map.put(A[i], map.get(A[i]) + 1);
            }
        }

        int maxValue = A[0];
        int maxCount = 1;

        for (int i : map.keySet()) {
            int curCount = map.get(i);
            if (curCount > maxCount) {
                maxCount = curCount;
                maxValue = i;
            }
        }

        int leaderValue = 0;
        int leaderCount = 0;
        if (maxCount > (0.5) * (A.length)) {
            leaderValue = maxValue;
            leaderCount = maxCount;
        } else {
            System.out.println(0);
        }

        int numEquiLeaders = 0;
        int leftLeaderCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == leaderValue) {
                leftLeaderCount++;
            }
            if (leftLeaderCount > (0.5) * (i + 1)) {
                int rightLeaderCount = leaderCount - leftLeaderCount;
                if (rightLeaderCount > (0.5) * (A.length - i - 1)) {
                    numEquiLeaders++;
                }
            }
        }
        System.out.println(numEquiLeaders);
    }

    public int solution(int[] A) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) {
                map.put(A[i], 1);
            } else {
                map.put(A[i], map.get(A[i]) + 1);
            }
        }

        int maxValue = A[0];
        int maxCount = 1;

        for (int i : map.keySet()) {
            int curCount = map.get(i);
            if (curCount > maxCount) {
                maxCount = curCount;
                maxValue = i;
            }
        }

        int leaderValue = 0;
        int leaderCount = 0;
        if (maxCount > (0.5) * (A.length)) {
            leaderValue = maxValue;
            leaderCount = maxCount;
        } else {
            return 0;
        }

        int numEquiLeaders = 0;
        int leftLeaderCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == leaderValue) {
                leftLeaderCount++;
            }
            if (leftLeaderCount > (0.5) * (i + 1)) {
                int rightLeaderCount = leaderCount - leftLeaderCount;
                if (rightLeaderCount > (0.5) * (A.length - i - 1)) {
                    numEquiLeaders++;
                }
            }
        }
        return numEquiLeaders;
    }
}

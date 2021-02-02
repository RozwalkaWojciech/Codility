package pl.rozwalka.codility.stacks.queues;

import java.util.Stack;

public class Fish {
    public static void main(String[] args) {

        int[] A = {4, 3, 2, 1, 5};
        int[] B = {1, 0, 0, 1, 0};

        Stack<Integer> alive = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            int size = A[i];
            int dir = B[i];

            if (alive.empty()) {
                alive.push(i);
            } else {
                while (!alive.empty() && dir - B[alive.peek()] == -1 && A[alive.peek()] < size) {
                    alive.pop();
                }
                if (!alive.empty()) {
                    if (dir - B[alive.peek()] != -1) alive.push(i);
                } else {
                    alive.push(i);
                }
            }
        }
        System.out.println(alive.size());
    }

    public int solution(int[] A, int[] B) {

        Stack<Integer> alive = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            int size = A[i];
            int dir = B[i];

            if (alive.empty()) {
                alive.push(i);
            } else {
                while (!alive.empty() && dir - B[alive.peek()] == -1 && A[alive.peek()] < size) {
                    alive.pop();
                }
                if (!alive.empty()) {
                    if (dir - B[alive.peek()] != -1) alive.push(i);
                } else {
                    alive.push(i);
                }
            }
        }
        return alive.size();
    }
}


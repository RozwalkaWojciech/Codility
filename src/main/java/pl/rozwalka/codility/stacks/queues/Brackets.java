package pl.rozwalka.codility.stacks.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {
    public static void main(String[] args) {

        String S = "{[()()]}";
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            switch (c) {
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        System.out.println(0);
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        System.out.println(0);
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        System.out.println(0);
                    break;
                default:
                    stack.push(c);
                    break;
            }
        }
        System.out.println(stack.isEmpty() ? 1 : 0);
    }

    public int solution(String S) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            switch (c) {
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return 0;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return 0;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return 0;
                    break;
                default:
                    stack.push(c);
                    break;
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}

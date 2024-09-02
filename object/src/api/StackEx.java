package api;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        // Stack 과 Queue
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>(); // 구현 클래스는 없음; LinkedList 로

        // Stack => push(삽입) / pop(삭제) : ex) 웹 뒤로가기 앞으로가기
        stack.push("0");
        stack.push("1");
        stack.push("2");

        // queue => offer(삽입) / poll(삭제) : ex) 인쇄 대기열, word 최근 사용항목
        queue.offer("0");
        queue.offer("1");
        queue.offer("2");

        System.out.println("=== stack ===");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }  
        System.out.println();
        System.out.println("=== queue ===");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }





    }
}

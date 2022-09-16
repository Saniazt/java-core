package advancedJava.collections;

import java.util.Stack;

public class Stack1 {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(5);
    stack.push(3);
    stack.push(1);

    while (!stack.empty()) {
      System.out.println(stack.pop());
    }

    System.out.println("-------");

    /*  System.out.println(stack.pop()); // 5
    System.out.println(stack.peek()); // 3 покажет но не удалит
    System.out.println(stack.pop()); // 3
    System.out.println(stack.pop()); // 1*/
  }
}

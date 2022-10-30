package hmos9c.collection;

import java.util.Deque;
import java.util.LinkedList;

public class _14DequeApp {
  public static void main(String[] args) {

    Deque<String> stack = new LinkedList<>();

    stack.offerLast("Sanas");
    stack.offerLast("Febriyan");

    System.out.println(stack.pollLast());
    System.out.println(stack.pollLast());

    Deque<String> queue = new LinkedList<>();
    queue.offerLast("Sanas");
    queue.offerLast("Febriyan");

    System.out.println(queue.pollFirst());
    System.out.println(queue.pollFirst());

  }
}

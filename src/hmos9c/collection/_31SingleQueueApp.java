package hmos9c.collection;

import hmos9c.collection.collection._30SingleQueue;

import java.util.Queue;

public class _31SingleQueueApp {
  public static void main(String[] args) {

    Queue<String> queue = new _30SingleQueue<>();
    System.out.println(queue.size());

    System.out.println(queue.offer("Sanas"));
    System.out.println(queue.offer("Febriyan"));

    System.out.println(queue.size());

    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.poll());

    System.out.println(queue.size());

  }
}

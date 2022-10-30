package hmos9c.collection;

import java.util.Stack;

public class _26StackApp {
  public static void main(String[] args) {

    Stack<String> stack = new Stack<>();

    stack.push("Sanas");
    stack.push("Febriyan");

    for(var value = stack.pop(); value != null; value = stack.pop()){
      System.out.println(value);
    }

  }
}

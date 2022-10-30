package hmos9c.collection;

import java.util.ArrayList;
import java.util.List;

public class _3ListApp {
  public static void main(String[] args) {

    List<String> strings = new ArrayList<>();
    // List<String> strings = new LinkedList<>();

    strings.add("Sanas");
    strings.add("Febriyan");

    strings.set(0, "Akmal");

    strings.remove(1);
    System.out.println(strings.get(0));

    for (var value : strings){
      System.out.println(value);
    }

  }
}

package hmos9c.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class _7SetApp {
  public static void main(String[] args) {

    // Set<String> names = new HashSet<>();
    Set<String> names = new LinkedHashSet<>();

    names.add("Sanas");
    names.add("Febriyan");
    names.add("Sanas");
    names.add("Febriyan");

    for (var name : names) {
      System.out.println(name);
    }

  }
}

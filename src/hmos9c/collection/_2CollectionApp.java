package hmos9c.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class _2CollectionApp {
  public static void main(String[] args) {

    Collection<String> collection = new ArrayList<>();

    collection.add("Sanas");
    collection.add("Febriyan");
    collection.addAll(List.of("hmos9c", "Sanas", "Febriyan"));

    for (var value : collection) {
      System.out.println(value);
    }

    System.out.println("REMOVE");

    collection.remove("Sanas");
    collection.remove("Akmal");
    collection.removeAll(List.of("hmos9c", "Ardi"));

    for (var value : collection) {
      System.out.println(value);
    }

    System.out.println(
        collection.contains("Febriyan")
    );

    System.out.println(
        collection.containsAll(List.of("Sanas", "hmos9c"))
    );

    System.out.println(collection.size());

  }
}

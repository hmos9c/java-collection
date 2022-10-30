package hmos9c.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class _12NavigableSetApp {
  public static void main(String[] args) {

    NavigableSet<String> names = new TreeSet<>();
    names.addAll(Set.of("Sanas", "Febriyan", "hmos9c"));

    NavigableSet<String> namesReverse = names.descendingSet();
    NavigableSet<String> Febriyan = names.tailSet("Febriyan", true);

    for (var name : Febriyan) {
      System.out.println(name);
    }

    NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
    // immutable.add("Ups");

  }
}

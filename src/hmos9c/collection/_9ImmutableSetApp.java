package hmos9c.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class _9ImmutableSetApp {
  public static void main(String[] args) {

    Set<String> empty = Collections.emptySet();
    Set<String> one = Collections.singleton("Sanas");

    Set<String> mutable = new HashSet<>();
    mutable.add("Sanas");
    mutable.add("Febriyan");
    Set<String> immutable = Collections.unmodifiableSet(mutable);

    Set<String> set = Set.of("Sanas", "Febriyan");

    // set.add("Sanas"); error
    // set.remove("Sanas"); error

  }
}

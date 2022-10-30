package hmos9c.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _6ImmutableApp {
  public static void main(String[] args) {

    List<String> one = Collections.singletonList("Satu");
    List<String> empty = Collections.emptyList();

    List<String> mutable = new ArrayList<>();
    mutable.add("Sanas");
    mutable.add("Febriyan");
    List<String> immutable = Collections.unmodifiableList(mutable);

    List<String> elements = List.of("Sanas", "Febriyan");

  }
}

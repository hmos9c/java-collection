package hmos9c.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class _20ImmutableMapApp {
  public static void main(String[] args) {

    Map<String, String> empty = Collections.emptyMap();
    Map<String, String> singleton = Collections.singletonMap("name", "Sanas");

    Map<String, String> mutable = new HashMap<>();
    mutable.put("name", "Sanas");
    Map<String, String> immutable = Collections.unmodifiableMap(mutable);

    Map<String, String> map = Map.of(
        "first", "Sanas",
        "last", "Febriyan"
    );

    // map.put("a", "A"); error

  }
}

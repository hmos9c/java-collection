package hmos9c.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class _22NavigableMapApp {
  public static void main(String[] args) {

    NavigableMap<String, String> map = new TreeMap<>();

    map.put("Sanas", "Sanas");
    map.put("Akmal", "Akmal");
    map.put("Ardi", "Ardi");

    for (var key : map.keySet()){
      System.out.println(key);
    }

    System.out.println(map.lowerKey("Sanas"));
    System.out.println(map.higherKey("Sanas"));

    NavigableMap<String, String> mapDesc = map.descendingMap();
    for (var key : mapDesc.keySet()){
      System.out.println(key);
    }

    NavigableMap<String, String> empty = Collections.emptyNavigableMap();
    NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

    // immutable.put("Sanas", "Sanas"); error

  }
}

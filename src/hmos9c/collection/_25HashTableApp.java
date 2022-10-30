package hmos9c.collection;

import java.util.Hashtable;
import java.util.Map;

public class _25HashTableApp {
  public static void main(String[] args) {

    Map<String, String> map = new Hashtable<>();

    map.put("Sanas", "Sanas");
    map.put("Akmal", "Akmal");
    map.put("Ardi", "Ardi");

    for (var key : map.keySet()) {
      System.out.println(key);
    }

  }
}

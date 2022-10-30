package hmos9c.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _23EntryApp {
  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>();

    map.put("Sanas", "Sanas Value");
    map.put("Akmal", "Akmal Value");
    map.put("Ardi", "Ardi Value");

    Set<Map.Entry<String, String>> entries = map.entrySet();

    for (var entry : entries) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

  }
}

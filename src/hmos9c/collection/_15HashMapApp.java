package hmos9c.collection;

import java.util.HashMap;
import java.util.Map;

public class _15HashMapApp {
  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>();
    map.put("name.first", "Sanas");
    map.put("name.last", "Febriyan");

    System.out.println(map.get("name.first"));
    System.out.println(map.get("name.last"));

  }
}

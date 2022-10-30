package hmos9c.collection;

import com.sun.tools.javac.Main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class _18LinkedHashMapApp {
  public static void main(String[] args) {

    Map<String, String> map = new LinkedHashMap<>();

    map.put("first", "Sanas");
    map.put("last", "Febriyan");

    Set<String> keys = map.keySet();
    for (var key : keys) {
      System.out.println(key);
    }

  }
}

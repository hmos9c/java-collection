package hmos9c.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class _33MapDefaultMethodApp {
  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>();
    map.put("Sanas", "Sanas Value");
    map.put("Akmal", "Akmal Value");
    map.put("Ardi", "Ardi Value");

    map.forEach(new BiConsumer<String, String>() {
      @Override
      public void accept(String key, String value) {
        System.out.println(key + ":" + value);
      }
    });

  }
}

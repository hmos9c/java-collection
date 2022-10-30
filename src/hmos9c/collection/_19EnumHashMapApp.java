package hmos9c.collection;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class _19EnumHashMapApp {
  public static enum Level {
    FREE, STANDARD, PREMIUM, VIP
  }

  public static void main(String[] args) {

    Map<Level, String> map = new EnumMap<Level, String>(Level.class);
    map.put(Level.FREE, "Sanas");
    map.put(Level.STANDARD, "Akmal");
    map.put(Level.PREMIUM, "Ardi");
    map.put(Level.VIP, "Febriyan");


    for (var key : map.keySet()){
      System.out.println(map.get(key));
    }

  }
}

package hmos9c.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _29CollectionsApp {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.addAll(List.of("Sanas", "Febriyan", "Akmal", "Ardi", "Balqis", "hmos9c"));

    System.out.println(list);

    Collections.reverse(list);
    System.out.println(list);

    Collections.shuffle(list);
    System.out.println(list);

  }
}

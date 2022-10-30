package hmos9c.collection;

import java.util.List;
import java.util.Vector;

public class _24VectorApp {
  public static void main(String[] args) {

    List<String> list = new Vector<>();

    list.add("Sanas");
    list.add("Febriyan");

    for (var value : list){
      System.out.println(value);
    }

  }
}

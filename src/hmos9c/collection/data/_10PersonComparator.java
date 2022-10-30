package hmos9c.collection.data;

import java.util.Comparator;

public class _10PersonComparator implements Comparator<_4Person> {

  @Override
  public int compare(_4Person o1, _4Person o2) {
    return o1.getName().compareTo(o2.getName());
  }
}

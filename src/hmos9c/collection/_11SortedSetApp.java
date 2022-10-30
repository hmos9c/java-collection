package hmos9c.collection;

import hmos9c.collection.data._10PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class _11SortedSetApp {
  public static void main(String[] args) {

    SortedSet<hmos9c.collection.data._4Person> people = new TreeSet<>(new _10PersonComparator());

    people.add(new hmos9c.collection.data._4Person("Sanas"));
    people.add(new hmos9c.collection.data._4Person("Akmal"));
    people.add(new hmos9c.collection.data._4Person("Ardi"));

    for (var person : people){
      System.out.println(person.getName());
    }

    SortedSet<hmos9c.collection.data._4Person> sortedSet = Collections.unmodifiableSortedSet(people);
    // sortedSet.add(new Person("Febriyan"));

  }
}

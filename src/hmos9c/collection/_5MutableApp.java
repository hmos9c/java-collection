package hmos9c.collection;

import java.util.List;

public class _5MutableApp {
  public static void main(String[] args) {

    hmos9c.collection.data._4Person person = new hmos9c.collection.data._4Person("Sanas");

    person.addHobby("Game");
    person.addHobby("Coding");

    doSomethingWithHobbies(person.getHobbies());

    for(var hobby : person.getHobbies()){
      System.out.println(hobby);
    }

  }

  public static void doSomethingWithHobbies(List<String> hobbies){
    hobbies.add("Bukan Hobby");
  }
}

package Java_cert;

import java.util.Comparator;

public class Question36_Pojo implements Comparator<Question36_Pojo> {

  String name;
  double price;

  public Question36_Pojo() {
  }

  public Question36_Pojo(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public int compare(Question36_Pojo b1, Question36_Pojo b2) {
    return b1.name.compareTo(b2.name);
  }

  public String toString() {
    return name + ":" + price;
  }
}

package Java_cert;


public class Question17 {

  int id;
  String name;

  public Question17(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public boolean equals(Object obj) {  //line n1
    boolean output = false;
    Question17 b = (Question17) obj;
    if (this.name.equals(b.name)) {
      output = true;
    }
    return output;
  }

  public static void main(String[] args) {
    Question17 b1 = new Question17(101, "Java Programing");
    Question17 b2 = new Question17(102, "Java Programing");
    System.out.println(b1.equals(b2));
  }
}


//Output will be true
//Correct option is A nothing to change in the code


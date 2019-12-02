package Java_cert;

public class Question96 {
  String name;
  boolean contract;
  double salary;

  public Question96() {
    name ="Joe";
    salary=100.0f;
    contract=true;
  }

  public String toString(){
    return name + ":" + contract + ":" + salary;
  }

  public static void main(String[] args) {
    Question96 e = new Question96();
/*    e.name ="Joe";
    e.salary=100;
    e.contract=true;*/
    System.out.println(e);
  }
}

//Output:
// Joe:true:100.0
//Correct option is B, C, D
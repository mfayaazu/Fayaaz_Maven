package Java_cert;

public class Question95 {
  public static int stVar= 100;
  public int var=200;
  public String toString(){
    return var + ":" + stVar;
  }

  public static void main(String[] args) {
    Question95 t1 = new Question95();
    t1.var=300;
    System.out.println(t1);
    Question95 t2 = new Question95();
    t2.stVar =300;
    System.out.println(t2);
  }
}

//Output:
//300:100
//200:300

//Correct answer is A

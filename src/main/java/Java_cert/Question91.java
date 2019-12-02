package Java_cert;

public class Question91 {

  static class Student{
    String name;
    int age;

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }
  }

  public static class Test{
    public static void main(String[] args) {
      Student s1 =new Student();
      Student s2 =new Student();
      Student s3 =new Student();
      s1=s3;
      s3=s2;
      System.out.println(s2.getAge());
      s2=null;
      System.out.println(s2.getAge());
    }
  }
}


//Correct option is C. It gives Warning but Compiles.

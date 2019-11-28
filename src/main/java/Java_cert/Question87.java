package Java_cert;

public class Question87 {

  class Vehicle{
    int x;
    Vehicle(){
      this(10);     //line n1
    }
    Vehicle(int x){
      this.x=x;
    }
  }

  class Car extends Vehicle{
    int y;
    Car(){
      super();
     // this(20);       //line n2
    }
    Car(int y){
      this.y =y;
    }

    public String toString(){
      return super.x + ":" + this.y;
    }
  }


  public static void main(String[] args) {
    //Vehicle y = new Car();
   // System.out.println(y);

  }
}


//There is a compilation error at line n2
//Correct answer is C
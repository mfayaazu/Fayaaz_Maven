package Java_cert;

public class Question46 {

  public final class IceCream {

    public void prepare() {
    }
  }

  public class Cake {

    public void bake(int min, int temp) {
    }
/*    public final void bake(int min, int temp) {
    }*/             //This is the problem

    public void mix() {
    }
  }

  public class Shop {

    private Cake c = new Cake();
    private final double discount = 0.25;

    public void makeReady() {
      c.bake(10, 120);
    }
  }

  public class Bread extends Cake {

    public void bake(int minutes, int temperature) {
    }

    public void addToppings() {
    }
  }

}


//Answer: correct answer is D. A Compilation error occurs in Bread
//The bake method in the third line of Bread.java will compile errors, because the Cake class inherits the Cake class, and its bake method has been modified with final and cannot be overwritten.
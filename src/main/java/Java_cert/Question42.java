package Java_cert;

interface Question42 {
  Car getCar(String name);
}
class Car {
  private String name;
  public Car(String name) {
    this.name = name;
  }
}
class InstanceOfCarTest {
  public static void main(String[] args) {
//A.
// Car auto = Car("MyCar")::new;
//B.
// Car auto = Car::new;
// Car vehicle = auto::getCar("MyCar");
//C. (Only one correct):
    Question42 rider = Car::new;
    Car vehicle = rider.getCar("MyCar");
//D.
// Car vehicle = Question42::new::getCar("MyCar");
  }
}

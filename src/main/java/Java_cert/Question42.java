package Java_cert;

interface Question42 {
  Q_Car getCar(String name);
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
    Question42 rider = Q_Car::new;
    Q_Car vehicle = rider.getCar("MyCar");
//D.
// Car vehicle = Question42::new::getCar("MyCar");
  }
}

//Option C created the instance of the Car. other options give a compile time error

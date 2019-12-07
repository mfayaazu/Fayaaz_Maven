package Java_cert;

public class Question86 {

    static class Vehicle{
        int x;
        Vehicle(){
            this(10);       //line n1
        }
        Vehicle(int x){
            this.x =x;
        }
    }
    static class Car extends Vehicle {
        int y;
        Car(){
            //super();
            this(20);       //line n2
        }
        Car(int y){
            this.y=y;
        }

        @Override
        public String toString() {
            return super.x + ":" + this.y;
        }
    }

    public static void main(String[] args) {
        Vehicle y = new Car();
        System.out.println(y);
    }
}


//Output is :  10:20
// Correct answer is B
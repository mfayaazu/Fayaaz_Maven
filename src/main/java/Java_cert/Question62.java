package Java_cert;

public class Question62 {
    class FuelNotAvailException extends Exception {
    }

    static class Vehicle {
        protected void ride() throws FuelNotAvailException {    //line n1
            System.out.println("Happy Journey!");
        }
    }

    static class SolarVehicle extends Vehicle {
        public void ride() throws FuelNotAvailException {    //line n2
            super.ride();
        }
    }


    public static void main(String[] args) throws FuelNotAvailException, Exception {
        Vehicle v = new SolarVehicle();
        v.ride();
    }
}

/*
A.Replace line n1 with public void ride() throws FuelNotAvailException {
B.Replace line n1 with protected void ride() throws Exception {
C.Replace line n2 with void ride() throws Exception {
D.Replace line n2 with private void ride() throws FuelNotAvailException {

 */
//Correct option seems to be A but cannot decide which one is correct... I will go with A because with little modification I can execute the code.EME


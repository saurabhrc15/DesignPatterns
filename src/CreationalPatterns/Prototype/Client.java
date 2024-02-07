package DesignPatterns.Prototype;

public class Client {
    public static void main(String[] args) {
        Car carPrototype = new Car();

        try {
            Car car = (Car) carPrototype.clone();

            System.out.println(car.getVehicleType());
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        Bike bikePrototype = new Bike();

        try {
            Bike bike = (Bike) bikePrototype.clone();

            System.out.println(bike.getVehicleType());
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}

package outputbase;

interface Vehicle {
    void start();   
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with self start");
    }
}

public class output8 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();

        Vehicle v2 = new Bike();
        v2.start();
    }
}

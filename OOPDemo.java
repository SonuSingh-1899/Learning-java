// Abstraction (abstract class)
abstract class Vehicle {
    int speed;
    int wheels;

    // Abstract method
    abstract void start();

    // Normal method
    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Inheritance (Car extends Vehicle)
class Car extends Vehicle {
    private String brand;  // Encapsulation (private data)

    // Constructor
    Car(String brand, int speed, int wheels) {
        this.brand = brand;
        this.speed = speed;
        this.wheels = wheels;
    }

    // Getter (Encapsulation)
    public String getBrand() {
        return brand;
    }

    // Overriding (Polymorphism)
    @Override
    void start() {
        System.out.println(brand + " Car is starting with speed " + speed + " km/h.");
    }
}

// Another child class (Bike extends Vehicle)
class Bike extends Vehicle {
    private boolean hasHelmet;

    Bike(boolean hasHelmet, int speed, int wheels) {
        this.hasHelmet = hasHelmet;
        this.speed = speed;
        this.wheels = wheels;
    }

    @Override
    void start() {
        System.out.println("Bike is starting with speed " + speed + " km/h.");
        System.out.println("Helmet Required: " + hasHelmet);
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        // Polymorphism: Parent reference → Child object
        Vehicle v1 = new Car("Tesla", 200, 4);
        v1.start();   // Car ka start() chalega
        v1.stop();

        System.out.println("------");

        Vehicle v2 = new Bike(true, 120, 2);
        v2.start();   // Bike ka start() chalega
        v2.stop();
    }
}

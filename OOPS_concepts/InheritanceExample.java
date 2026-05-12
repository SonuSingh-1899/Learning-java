// Parent Class
class Vehicle {
    int speed;
    int wheels;

    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

// Child Class (Car inherits Vehicle)
class Car extends Vehicle {
    String brand;
    Car(String brand, int speed, int wheels){
        this.brand = brand;
        this.speed = speed;
        this.wheels = wheels;
    }

    public void showCarInfo() {
        System.out.println("Car brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Wheels: " + wheels);
    }
}



// Another Child Class (Bike inherits Vehicle)
class Bike extends Vehicle {
    boolean hasHelmet;
    Bike(boolean hasHelmet, int speed, int wheels){
        this.hasHelmet = hasHelmet;
        this.speed = speed;
        this.wheels = wheels;
    }

    public void showBikeInfo() {
        System.out.println("Bike speed: " + speed + " km/h");
        System.out.println("Wheels: " + wheels);
        System.out.println("Helmet Required: " + hasHelmet);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Car Object
        Car c1 = new Car("tesla",200,4);
        c1.start();          // Parent method
        c1.showCarInfo();    // Child method
        c1.stop();           // Parent method

        System.out.println("-----");

        // Bike Object
        Bike b1 = new Bike(true,120,2);
        b1.start();          // Parent method
        b1.showBikeInfo();   // Child method
        b1.stop();           // Parent method
    }
}

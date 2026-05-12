
class Vehicle {
    int speed;
    int wheel;

    public void start() {
        System.out.println("vehicle is starting .....");
    }

    public void stop() {
        System.out.println("vehicle is stopped ......");
    }
}

class Car extends Vehicle {   // ✅ class name capital C
    boolean ispresent;

    Car(boolean ispresent, int speed, int wheel) {  // ✅ Constructor name == Class name
        this.ispresent = ispresent;
        this.speed = speed;
        this.wheel = wheel;
    }

    public void showCar() {
        System.out.println("car speed: " + speed + " km/h");
        System.out.println("wheel: " + wheel);
        System.out.println("licence: " + ispresent);
    }
}

public class ques_01 {
    public static void main(String[] args) {
        Car c1 = new Car(true, 120, 4); // ✅ "Car" with capital C
        c1.start();
        c1.showCar();
        c1.stop();
    }
}

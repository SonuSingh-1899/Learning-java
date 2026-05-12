package testfinal;

class cars{
    int wheels = 4;


    void startEngine(){
        System.out.println("entine started!");
    }
}

class Bike{

    int wheels = 2;

    void show(){
        System.out.println("this is a bike");
    }
}

public class finalexample extends cars  {
    public static void main(String[] args) {
    finalexample obj = new finalexample();

    obj.wheels = 4;

     System.out.println("lets go");
    
    }
}


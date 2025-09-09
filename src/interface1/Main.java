package interface1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Interface");
        //Car c1 = new Car();
        Vehicle v1 = new Car();
    }

}

interface Vehicle {
    public void go();
    public void stop();
}

class Car implements Vehicle {
    public void go() {
        System.out.println("Go");
    }
    public void stop() {
        System.out.println("stop");
    }
}


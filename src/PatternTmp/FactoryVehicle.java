package PatternTmp;

public class FactoryVehicle {

    public static void main(String[] args) {
        Vehicle v1 = new CarFactory().createVehicle();
        v1.build();
        Vehicle v2 = new LorryFactory().createVehicle();
        v2.build();
        Vehicle v3 = new CarFactory().create();
        Vehicle v4 = new LorryFactory().create();

    }
}

interface Vehicle {
    public void build();
}

abstract class VehicleFactory {
    public Vehicle create() {
        Vehicle vehicle = createVehicle();
        vehicle.build();
        return vehicle;
    }
    abstract Vehicle  createVehicle();
}

class Car1 implements Vehicle{
    @Override
    public void build() {
        System.out.println("Build car");
    }
}

class Lorry implements Vehicle {
    @Override
    public void build() {
        System.out.println("Build lorry");
    }
}

class CarFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new Car1();
    }
}

class LorryFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new Lorry();
    }
}
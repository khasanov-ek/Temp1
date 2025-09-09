package PatternTmp;

public class BuilderCar {


    public static void main(String[] args) {
        System.out.println("Pattern Builder");

        Car car1 = new Car(new Car.CarBuilder(1));
        System.out.println(car1);
        Car car2 = new Car.CarBuilder(1).addCarType("CITY_CAR").addColor("white").addYear(2025).buildCar();
        System.out.println(car2);
    }
}


class Car {
    private final int id;
    private final String carType;
    private final String color;
    private final int year;

    public Car(CarBuilder builder) {
        this.id = builder.id;
        this.carType = builder.carType;
        this.color = builder.color;
        this.year = builder.year;
    }

    public String toString() {
        return "Car (id = " + id + ", carType = " + carType + ", color = " + color + ", year = " + year + ")";
    }

    // Builder must be static
    static class CarBuilder {
        private final int id;
        private String carType;
        private String color;
        private int year;
        public CarBuilder(int id) {
            this.id = id;
        }
        public CarBuilder addCarType(String carType) {
            this.carType = carType;
            return this;
        }
        public CarBuilder addColor(String color) {
            this.color = color;
            return this;
        }
        public CarBuilder addYear(int year) {
            this.year = year;
            return this;
        }
        public Car buildCar() {
            return new Car(this);
        }
    }
}





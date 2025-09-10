package PatternTmp;

public class FactoryDrinks {
    public static void main(String[] args) {
        DrinkFactory drinkFactory = new DrinkFactory();
        Drink d1 = drinkFactory.getDrink(DrinkFactory.coffee);
        Drink d2 = drinkFactory.getDrink(DrinkFactory.tea);
        d1.prepare();
        d2.prepare();

    }

}

interface Drink {
    public void prepare();
}

class Coffee implements Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing coffee .....");
    }
}

class Tea implements Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing tea .....");
    }
}

class DrinkFactory {
    public static final String coffee = "COFFEE";
    public static final String tea = "TEA";
    public Drink getDrink(String drinkType) {
        if (drinkType.equals(coffee)) {
            return new Coffee();
        } else if (drinkType.equals(tea)){
            return  new Tea();
        }
        return null;
    }
}

package PatternTmp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuilderCat {

    public static void main(String[] args) {
        System.out.println("Pattern Builder");
        System.out.println("-----------------------------------");
        Cat cat1 = new Cat.CatBuilder("Musya").addAge(1)
                        .addFavouriteFood("candy")
                        .addFavouriteFood("milk")
                        .build();
        System.out.println(cat1);
    }

}

class Cat {
    private final String name;
    private final String color;
    private final int age;
    private final boolean isFluffy;
    private final List<String> favoriteFoods;

    private Cat(CatBuilder catBuilder) {
        this.name = catBuilder.name;
        this.color = catBuilder.color;
        this.age = catBuilder.age;
        this.isFluffy = catBuilder.isFluffy;
        this.favoriteFoods = Collections.unmodifiableList(new ArrayList<>(catBuilder.favoriteFoods));
    }

    //Статистическмй внутренний класс CatBuilder
    public static class CatBuilder{
        private final String name;  // --Обязательное значение
        private String color = "Gray";
        private int age = 0;
        private boolean isFluffy = true;
        private List<String> favoriteFoods = new ArrayList<>();

        public CatBuilder(String name) {
            this.name = name;
        }
        public CatBuilder addColor(String color) {
            this.color = color;
            return this;
        }
        public CatBuilder addAge(int age) {
            this.age = age;
            return this;
        }
        public CatBuilder isFluffy(boolean isFluffy) {
            this.isFluffy = isFluffy;
            return this;
        }
        public CatBuilder addFavouriteFood(String food) {
            this.favoriteFoods.add(food);
            return this;
        }
        public Cat build() {
            return new Cat(this);
        }
    }
    @Override
    public String toString() {
        return "Cat (name = " + name +
                             ", color = " + color +
                             ", age = " + age +
                             ", isFluffy = " + isFluffy +
                             ", favorite food = " + (favoriteFoods.size() > 5 ? favoriteFoods.subList(0, 5) + "..." : favoriteFoods);
    }
}



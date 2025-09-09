package PatternTmp;

import java.lang.invoke.StringConcatFactory;

public class BuilderPerson {

    public static void main(String[] args) {
        Person person1 = new Person.PersonBuulder().addName("Name1").addSurname("Surname1").addAge(18).build();
        System.out.println(person1);
    }


}


class Person {
    private String name;
    private String surname;
    private int age;

    public static class PersonBuulder {
        private Person newPerson;
        public PersonBuulder() {
            newPerson = new Person();
        }
        public PersonBuulder addName(String name) {
            newPerson.name = name;
            return this;
        }
        public PersonBuulder addSurname(String surname) {
            newPerson.surname = surname;
            return this;
        }
        public PersonBuulder addAge(int age) {
            newPerson.age = age;
            return this;
        }
        public Person build() {
            return newPerson;
        }
    }

    @Override
    public String toString() {
        return "Person (" + name + ", " + surname + ", " + age + ")";
    }

}

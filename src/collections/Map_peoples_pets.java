package collections;

// хранение информации о людях, у каждого из готорых может быть несколько домашних животных

import java.util.*;

public class Map_peoples_pets {

    private static class Person {
        String name;

        public String getName() {
            return name;
        }

        public Person(String name) {
            this.name = name;
        }
    }

    private static class Pet {
        String name;

        public String getName() {
            return name;
        }

        public Pet(String mame) {
            this.name = mame;
        }

        @Override
        public String toString() {
            return "Pet{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    private static class Dog extends Pet {

        public Dog(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    private static class Cat extends Pet {

        public Cat(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        Map<Person, List<Pet>> map = new HashMap<>();
        map.put(new Person("Kate"), Arrays.<Pet>asList(new Dog("Bobik"), new Cat("Myrzik")));
        map.put(new Person("Vova"), Arrays.<Pet>asList(new Dog("Bocman"), new Dog("Sharik")));
        map.put(new Person("Valera"), Arrays.<Pet>asList(new Cat("Myrzik"), new Cat("Zorka")));

        for (Person xx : map.keySet()) {
            System.out.println(xx.getName() + " has: ");
            for (Pet x : map.get(xx)) {
                System.out.println("        " + x);
            }

        }

    }
}
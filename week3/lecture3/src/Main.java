public class Main {
    // Classes
    public static class Person {
        //attributes
        String name;
        int age;

        //methods
        public void greet(){
            System.out.println("Hi, my name is " + name); // class method
        }
    }

    //attributes
    public static class Car {
        String model; // attribute
        int year; // attribute
    }

    // methods
    public static class Calculator {
        public int add(int a, int b){ // class method
            return a + b;
        }
    }

    public static void main(String[] args) {
        //instances
        Person person1 = new Person();
        person1.name = "Anton";
        person1.age = 24;
        person1.greet();
    }
}
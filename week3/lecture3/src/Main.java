public class Main {
    /*

    // 2. CLASSES == blueprint of an object, can produce indefinite INSTANCES of itself via either manual initialization, or a CONSTRUCTOR method on the class
    public static class Person {

        // class attributes
        String name;
        int age;

        // class method
        public void greet(){
            System.out.println("Hi, my name is " + name); // class method
        }
    }

    // 3. INSTANCES
    // objects of a class

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Anton";
        person1.age = 24;
        person1.greet();
    }

    // 4. ATTRIBUTES
    // attributes are the OBJECT fields that need to be filled with PROPERTIES == the actual values.

    public static class Car {

        // class attribute
        String model;
        int year;
    }

    // 5. METHODS
    // methods == functions that belong to the class, normally return the values back to the caller OR update PROPETIES on the class INSTANCE

    public static class Calculator {
        // class method
        public int add(int a, int b){
            return a + b;
        }
    }

    */

    // 6. STATIC MEMBERS
    // static members belong to the class, but can be accessed without creating an INSTANCE.

    public static class MathUtils {
        //statuc method
        public static int add(int a, int b){
            return a + b;
        }
    }

    // 7. DEFAULT VALUES FOR ATTRIBUTES
    public static class DefaultValueExample {
        int intDef; // default == 0
        double doubleDef; // default == 0.0
        boolean boolDef; // default == false
        String strDef; // default == null

        public void printValues(){
            System.out.println("intDef: " + intDef);
            System.out.println("doubleDef: " + doubleDef);
            System.out.println("boolDef: " + boolDef);
            System.out.println("strDef: " + strDef);
        }
    }

    // 8. CONSTRUCTORS
    // special method that is called when obj initiated to initialize it's default state;
    // MUST have the same name as the class;
    // MUST NOT have any return type like other methods do;

    public static class Person {
        String name;
        int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        public void sayHello(){
            System.out.println("Hello, my name is " + name);
        }
    }

    // 9. CONSTRUCTOR OVERLOADING
    // Java technique of having more than one CONSTRUCTOR with different parameter lists

    public class Rectangle {
        int length;
        int width;

        // NO ARGUMENT CONSTRUCTOR
        public Rectangle() {
            this.length = 1;
            this.width = 1;
        }

        // PARAMETERIZED CONSTRUCTOR
        public Rectangle(int length, int width){
            this.length = length;
            this.width = width;
        }

        public void printArea(){
            int area = length * width;
            System.out.println("Area: " + area);
        }
    }

    // 10. ACCESS MODIFIERS
    // determine visibility and accessibility of classes, methods and variables.
    // PRIMARY access modifiers: public, private, protected

    // PUBLIC == class, method, variable are accessible from any other class in any package.
    public class PublicClass {
        public int num;
        public void method(){
            return;
        }
    }

    // PRIVATE == class, method, variable are accessible only from within the class it is declared in. (like main)
    private class PrivateClass {
        private int num;
        private void method(){
            System.out.println(this.num);
        }
    }

    // PROTECTED == class, method, variable are accessible only from within the same package and by subclasses in other packages
    protected class ProtectedClass {
        protected int num;
        protected void method(){
            System.out.println(this.num);
        }
    }

    // DEFAULT (PACKAGE PRIVATE) == if no access modifier defined on the class, class, method, variable are accessible only from within the same package
    class DefaultClass {
        int num;
        void method(){
            System.out.println(this.num);
        }
    }

    public void main(String[] args){

        // 6. STATIC MEMBERS
        int result = MathUtils.add(5, 10); // call a static method without creating an instance
        System.out.println(result);

        // 8. CONSTRUCTORS
        Person alice = new Person("Alice", 30);
        alice.sayHello();

        // 9. CONSTRUCTOR OVERLOADING
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5,10);
        rect1.printArea(); // 1
        rect2.printArea(); // 50
    }

}
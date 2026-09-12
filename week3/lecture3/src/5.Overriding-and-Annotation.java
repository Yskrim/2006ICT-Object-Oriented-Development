/***********************************************************************************************************************/
// 1. Method overriding
    static class Shape {
        public void area(){ System.out.println("Shape has no defined area"); }
    }
    static class Square extends Shape {
        @Override
        public void area(){ System.out.println("Square area calculated"); }
    }

/***********************************************************************************************************************/
// 2. this & super -- referencing properties & methods.
    class Shape {
        public void area(){ System.out.println("Shape has no defined area"); }
    }

    class Square extends Shape {
        @Override
        public void area() {
            super.area();
            System.out.println("Square area calculated");
        }
    }

/***********************************************************************************************************************/
// 3. this() - calling another constructor of the same class.
    class Item {
        String name;
        int quantity;

        public Item(){
            this("Unnamed", 1); // must be the first constructor to compile
        }

        public Item(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        @Override
        public String toString(){
            return "Item{name='" + name + "', quantity="+ quantity +"}";
        }
    }

/***********************************************************************************************************************/
// 4. super() parent constructor.
    class Vehicle {
        private String type;
        public Vehicle(String type){
            this.type = type;
        }
        public void describe(){
            System.out.println("Vehicle type: " + type);
        }
    }

    class Car extends Vehicle {
        private int doors;
        public Car(String type, int doors){
            super(type);
            this.doors = doors;
        }
        @Override
        public void describe(){
            super.describe();
            System.out.println("Doors" + doors);
        }
    }

public class Main {
    public static void main(String[] args){
        /***********************************************************************/
        // 2. this() & super()
        Square square = new Square();
        square.area(); // "Shape has no defined area" \n "Square area calculated"

        /***********************************************************************/
        // 3. this() another constructor of the same class.
        Item item1 = new Item();
        System.out.println(item1); // "Item{name='Unnamed', quantity=1}";
        Item item2 = new Item("Sword", 2);
        System.out.println(item2); // "Item{name='Sword', quantity=2}";
    }
}
/***********************************************************************************************************************/
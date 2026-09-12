public class CodeGen {

// 2. UNDERSTANDING GETTERS, SETTERS AND toString METHODS
    // GETTERS == methods that retrieve the value of a private field
    // SETTERS == methods that set/update the value on a private field
    // PURPOSE == provide a way to access and modify private fields while encapsulating on object

    public class Person {
        private String name;
        private int age;

        // GETTER FOR NAME
        public String getName() {
            return name;
        }
        // SETTER FOR NAME
        public void setName(String name) {
            this.name = name;
        }
        // GETTER FOR AGE
        public int getAge() {
            return age;
        }
        // SETTER FOR AGE
        public void setAge(int age) {
            this.age = age;
        }
    }


// toString() METHOD
    // PURPOSE == returns a string representation of an object.
    // OVERRIDE == to provide a meaningful representation of objects state.(LOGGING/DEBUGGING)
    // I suppose that this method name is a convention. It gets overridden in case any other methods on an object have this one already.

    public class Persona {
        private String name;
        private int age;

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

// 3. USING INTELLIJ TO GENERATE CODE
    // - create a java class
    // - generate GETTERS AND SETTERS (r-click on class body -> generate -> getter and setter -> ok)
    // - generate CONSTRUCTOR (r-click on class body -> generate -> constructor -> ok)
    // - generate toString method (r-click on class body -> generate -> toString -> ok)
// 4. EXAMPLE CODE

    public void main(String[] args){
        System.out.println("HI");
    }
}

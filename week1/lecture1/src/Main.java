//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/// 1 - Method Basics
    //What is a method?
        // Method is a function == reusable code block of code for specific task

    //Why use methods?
        // - to break down problems into smaller tasks
        // - to reuse code without duplication
        // - to make programs modular and easier to read


/// 2 - Where are methods defined?
    void greet() { // invalid because placed in source code.
        System.out.println("Hello");
    }

    public class Hello { // Valid because inside a class
        void greet() {
            System.out.println("Hello");
        }
    }


/// Jshell methods
    // Can be defined directly without putting in a class. Jshell wraps code behind the scenes.

/*
    jshell> int square(int x) {return x * x};
    jshell> square(5)
    $1 ==> 25
    */

/// 3 - Method syntax

    /*
    returnType methodName(parameterList) {
        //method body
        return value;
    }
    */

    int add(int x, int y){
        return x + y;
    }

    // int - return type
    // add - method name
    // (int a, int b) - parameters
    // return a + b - method body

/// 4 - Calling a method
    /*
    int result = add(5,3);
    System.out.println(result); // 8

    Calculator calc = new Calculator();
    result = calc.add(5,3);
    */

/// 5- Parameters and return values
    // Method with return value
    double area(double radius) { return 3.14 * radius * radius; }

    // No return value
    void sayHello(){
        System.out.println("Hello");
    }


/// 6 - Method overloading
    // Java selects the right method based on argument types
    int multiply(int a, int b){
        return a * b;
    }

    double multiply(double a, double b){
        return a * b;
    }

/// 7 - Method Entry Point
    // The starting point of every Java app
    public static void main(String[] args){
        System.out.println("Program started");
    }
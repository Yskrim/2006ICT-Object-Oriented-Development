/***********************************  1. Polymorphism - upcasting  ***************************************/

/// Переменная может быть обьявлена типом родителя, но содержать обьект подкласса.
/// При вызове вызывается именно подкласс. определяется в Java Runtime. (Runtime Polymorphism)

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
class Circle extends Shape {
    @Override
    public void area(){ System.out.println("Circle area calculated"); }
}
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Square(), new Circle()};
        for (Shape s : shapes) {
            System.out.print("Shape: '" + s.getClass()  + "' == ");
            s.area();
        }
    }
}

/// dynamic method dispatch -- джава сама определяет класс обьекта по реальному типу в памяти а не заявленному типу переменной.
/// это Работает только, если подкласс говорит, что продолжает родительский класс.
/// тип переменной в коде важен только для того, какие методы вообще будут доступны для вызова.
    /// Компилятор не даст вызвать метод, которого нет у Shape.

/***********************************  2. Method Overloading (не путать с Overriding)   ***************************************/

/// это пример оверрайдинга, а не оверлоадинга.
/// несколько вариантов одной и той же функции в зависимости от варианта инпута.

class Printer {
    public static void print(String text){
        System.out.println("Text: " + text);
    }
    public static void print(String text, int times){
        for(int i=0; i<times; i++){
            System.out.println("Parameter: " + text);
        }
    }
    public static void print(int number){
        System.out.println("Number: " + number);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.print("case1: "); Printer.print("my string");
        System.out.print("case2: "); Printer.print("new string", 2);
        System.out.print("case3: "); Printer.print(25);
    }
}

/********************************************************************************************************************************/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        // 1 -- variable declaration and initialization
        int age = 25;
        double salary = 55000.75;
        boolean isEmployed = true;
        char grad = 'A';

        // 2 -- arithmetic operations
        int a = 10;
        int b = 20;
        int sum = a + b;
        int diff = b - a;
        double quotient = (double) b / a;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(quotient);

        // 3 -- Boolean expressions
        boolean isEqual = (a == b);
        boolean isGreater = (a > b);
        System.out.println(isEqual);
        System.out.println(isGreater);

        // 4 -- Type casting
        double x = 9.7;
        int y = (int) x;
        System.out.println(y);
    }
}


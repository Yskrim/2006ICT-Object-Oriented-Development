//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // expressions in Java

    // 1 - arithmetic
    int sum = 10 + 5;
    int product = sum * 2;

    // 2 - Relational -- compare two values for true/false
    boolean isEqual = (10 == 10);
    boolean isGreater = (10 > 5);

    // 3 - Logical -- combine boolean values using logical operators
    boolean result = (10 > 5) && (5 < 10);

    // 4 - Assignment -- assign a value to a variable
    int x = 5;
    x = x + 2; // 7

    // 5 - Method calls -- calls a method -> returns a value
    int length = "Hello".length(); // 5

    // Combining expressions:
    int a = 10;
    int b = 20;
    int c = (a + b) * 2; // 60
    boolean isPositive = (c > 0) && (a < b); // true
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // 4-Integer pooling
    // Java caches Integer values from -128 to 127 for performance
    Integer a = 100;
    Integer b = 100;
    System.out.println(a == b); // true == both point to the same pooled object

    Integer x = 200;
    Integer y = 200;
    System.out.println(x == y); // false == different objects

    System.out.println(x.equals(y)); // compare values of wrapper objects
}

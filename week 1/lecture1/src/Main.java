//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // 5-String pooling
    // Strings are immutable and are pooled by default when created using literals(letters)
    String s1 = "Hello";
    String s2 = "Hello";
    System.out.println(s1 == s2); // true -- both point to pooled string

    String s3 = new String("Hello");
    System.out.println(s3 == s1); //false -- different objects

    System.out.println(s1.equals(s3)); // true -- compares values of objects
}

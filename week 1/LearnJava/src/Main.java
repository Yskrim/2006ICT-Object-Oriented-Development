//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String greeting = "Hello, world!";
    String byes = "Good bye!";
    int greetLen = greeting.length();

    System.out.println(greetLen);
    System.out.println(greeting.toLowerCase(Locale.ROOT));
    System.out.println(greeting.toUpperCase(Locale.ROOT));
    System.out.println(greeting.getBytes());
    System.out.println(greeting.equals(byes));
    System.out.println(greeting.equals(greeting));

}

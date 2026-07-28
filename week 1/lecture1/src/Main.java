//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // 2-Wrapper classes
    // used to represent primitives as objects in complex structures
    int i = 1; // Integer
    double d = 2.1; // Double
    char c = 'A'; // Character
    boolean b = true; // Boolean

    int x = 10;
    Integer y = Integer.valueOf(x); // Explicit boxing
    System.out.println(y);

    List<Integer> list = new ArrayList<>();
    list.add(x); // Autoboxing
    list.add(y);
    System.out.println(list);
}

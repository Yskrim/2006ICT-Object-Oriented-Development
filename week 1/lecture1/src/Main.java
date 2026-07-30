//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
// Code blocks in Java
    // Nesting code blocks -- blocks can be nested within each other and nesting defines scope of variables
}

public void exampleMethod(){
    int outer = 10;

    if (outer > 5){
        int inner = 20;
        System.out.println("Inner " + inner);
        System.out.println("Outer is > 5");
    }

    System.out.println("Inner " + inner); // error because inner is not in this block's scope
}
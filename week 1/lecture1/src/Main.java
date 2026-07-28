//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
// Code blocks in Java
    // A code block is a group of zero or more statements enclosed in {braces}
    // Code blocks are used to group statements together and define the scope of variables

    // 2 -- Loop block -- defines a loop body
    for(int i = 0; i < 10; i++){
        System.out.println(i);
    }


    // 3 -- Conditional block -- defines conditional statement body
    int a = 100;
    if (a > 5){
        System.out.println("Greater than 5");
    } else {
        System.out.println("Less or equal to 5");
    }


    // 4 -- Anonymous block -- groups statements without being associated with any control flow or method.
    {
        int b = 10;
        System.out.println("a is " + a);
    }
}
// 1 -- Method block -- defines the body of a method
public void printMsg(){
    System.out.println("Hello world");
    // block is on the bottom because it's declared outside of main
}
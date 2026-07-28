//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Statements in Java
    // 1 - Declaration statements -- declare a variable + optionally initialize it
    int number;
    String message = "Hello";

    // 2 - Expression statements -- preform an action like assignment or a method call
    number = 10;
    System.out.println(message);

    // 3 - Control flow statements -- controls the order of statement execution


    // 3a - Conditional statements -- execute blocks based on condition
    if(number > 0){
        System.out.println("Positive");
    } else {
        System.out.println("Non-positive");
    }

    switch (number) {
        case 1:
            System.out.println("One");
        case 2:
            System.out.println("Two");
        default:
            System.out.println("Other num");
    }


    // 3b - Looping statements

    for(int i = 0; i < 10; i++){
        System.out.println("i is " + i);
    }

    int i = 0;
    while (i < 5){
        System.out.println("i is " + i);
        i++;
    }

    i = 0;
    do {
        System.out.println("i is " + i);
        i++;
    } while (i < 5);


    // 3c -- Jump statements -- alter the flow of execution by jumping to another part of the program
    for(int j=0; j<10; j++){
        if (j==5){
            break; // exits loop
        }
        if (j % 2 == 0){
            continue; // skips iteration
        }
        System.out.println("i is " + j);
    }
}

// 3c -- Jump statements
public int add(int a, int b){
    return a + b; // exits the method
}

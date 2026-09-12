package lecture3;

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

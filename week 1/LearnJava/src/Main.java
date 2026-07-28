public class Main{
    public static void main(String[] args){
        String greeting = "Hello, world!";
        int num = 5;
        int greetLen = greeting.length();

        int total =greetLen + num;
        System.out.println(total);

        int newTotal = add(greetLen, num);
        System.out.println(newTotal);
    }

    public static int add(int a, int b){
        return a + b;
    }
}

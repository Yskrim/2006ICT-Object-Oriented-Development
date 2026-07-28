public class Main{
    public static void main(String[] args){
        String greeting = "HelloHelloHello";
        int greetLen = greeting.length();

        for(int i = 0; i < greetLen; i++){
            System.out.println(greeting.charAt(i));
        }
    }
}

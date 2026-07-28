public class Main{
    public static void main(String[] args){

        int likes = 4035;
        int dislikes = 4035;
        double newRatio = ratio(likes, dislikes);
        System.out.println(newRatio);
    }

    public static double ratio(int likes, int dislikes){
        if(likes + dislikes == 0){
            return 0;
        }
        return (double) likes / (likes + dislikes) * 100;
    }
}

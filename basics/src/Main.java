import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main {

    public static String pluralize( String word , int num )
    {
        if (num == 1)
            word = word;
        else
            word =word +"s";

        return word;

    }

    public static void flipNHeads( int n)
    {
//            int count =3;
        int heads =0;
        for (int i=0; i<n; i++) {
            double x = Math.random();

            if (x < 0.5)
                System.out.println("tails");
            else {
                System.out.println("heads");
                heads++;
            }
        }
        System.out.println("It took " + n +" flips to flip " +heads +" heads in a row.\n");


    }

    public static void LocalClock () {
        LocalDateTime  now = LocalDateTime.now(); // the time now
        int count=0;
        double million = 1_000_000;

        while(true) {
            count++;

            LocalDateTime after = LocalDateTime.now(); // the next second
            if(now.getSecond() != after.getSecond()) {

                now = after; // to continue
                System.out.println(after.format(DateTimeFormatter.ofPattern("HH:mm:ss"))+" "+(count/million)+" MHz");
                count=0;
            }
        }
    }
    public static void main(String[] args)
    {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".\n");




        flipNHeads(4);
        flipNHeads(1);
        flipNHeads(6);

        LocalClock();
    }
}

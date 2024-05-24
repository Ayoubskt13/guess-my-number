import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // explaining the game
        System.out.print("I'm thinking of a number between 1 and 100(including both). can you guess what it is");
        // use random
        Random rand = new Random();
        int randomNumber = rand.nextInt(100)+1;
        // read a number from the user
        int i ;
        Scanner in = new Scanner(System.in);
        i = in.nextInt();

        int x = Math.abs (randomNumber - i) ;
        // print the number that i guess and the user guess
        System.out.printf("your guess is : %d%n the number i was thinking of is : %d%n you were off by : %d%n",i ,randomNumber , x);
    }
}
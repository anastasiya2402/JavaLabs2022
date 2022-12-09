import java.util.Random;
import java.util.Scanner;

public class LabRockPaperScissors {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int ROCK = 0;
        final int PAPER = 1;
        final int SCISSORS = 2;
        Random rand = new Random();
        int seed = scnr.nextInt();
        rand.setSeed(seed);
        String firstPlayer = scnr.next();
        String secondPlayer = scnr.next();
        int numRounds = scnr.nextInt();
        int numfirstPlayer = 0;
        int numsecondPlayer = 0;

        while (numRounds < 0) {
            numRounds = scnr.nextInt();
            System.out.println("Rounds must be > 0");
        }
        System.out.printf("%s vs %s for %d rounds\n", firstPlayer, secondPlayer, numRounds);

        for (int i = 0; i < numRounds; ++i) {
            int randValue1 = rand.nextInt(3);
            int randValue2 = rand.nextInt(3);
            if (randValue1 == randValue2) {
                System.out.println("Tie");
                i = i - 1;
            } else if (randValue1 == ROCK && randValue2 == PAPER) {
                System.out.printf("%s wins with paper\n", secondPlayer);
                numsecondPlayer = numsecondPlayer + 1;
            } else if (randValue1 == PAPER && randValue2 == ROCK) {
                System.out.printf("%s wins with paper\n", firstPlayer);
                numfirstPlayer = numfirstPlayer + 1;
            } else if (randValue1 == ROCK && randValue2 == SCISSORS) {
                System.out.printf("%s wins with rock\n", firstPlayer);
                numfirstPlayer = numfirstPlayer + 1;
            } else if (randValue1 == SCISSORS && randValue2 == ROCK) {
                System.out.printf("%s wins with rock\n", secondPlayer);
                numsecondPlayer = numsecondPlayer + 1;
            } else if (randValue1 == PAPER && randValue2 == SCISSORS) {
                System.out.printf("%s wins with scissors\n", secondPlayer);
                numsecondPlayer = numsecondPlayer + 1;
            } else if (randValue1 == SCISSORS && randValue2 == PAPER) {
                System.out.printf("%s wins with scissors\n", firstPlayer);
                numfirstPlayer = numfirstPlayer + 1;
            }
        }
        System.out.printf("%s wins %d and %s wins %d\n", firstPlayer, numfirstPlayer, secondPlayer, numsecondPlayer);
    }
}

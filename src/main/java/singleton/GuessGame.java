package singleton;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    private static GuessGame game = new GuessGame();
    private Random random = new Random();
    private int score=0;
    private Scanner scanner=new Scanner(System.in);

    public GuessGame() {
    }
    public static GuessGame getInstance(){
        return game;
    }
    protected Object readResolve(){
        return getInstance();
    }

    public int getScore() {
        return score;
    }
    public void play(){
        for (int i = 0; i < 9; i++) {
            System.out.println("rudna: "+(i+1));
            int number=random.nextInt(3);
            System.out.println("zgadnij cyfre od 0-3");
            int userNumb=scanner.nextInt();
            if (number==userNumb){
                System.out.println("zgadza się myślałem o: "+number);
                score++;
            }else{
                System.out.println("niestety myślałem o: "+number);
            }
        }
        System.out.println("twój wynik to: "+score);
    }
}

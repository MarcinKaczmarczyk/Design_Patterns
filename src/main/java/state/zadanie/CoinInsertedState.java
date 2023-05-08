package state.zadanie;

import java.util.Random;

public class CoinInsertedState implements State {
    @Override
    public void insertCoin(OneHandBanditGame oneHandBanditGame) {
        System.out.println("moneta została już wrzucona");
    }

    @Override
    public void pullTheLevers(OneHandBanditGame oneHandBanditGame) {
        int number;
        Random random = new Random();
        number = random.nextInt(100);
        System.out.println(number);
        if (number <= 20) {
            System.out.println("Wygrałeś");
            oneHandBanditGame.state = new FinishGameState();
        } else {
            System.out.println("Przegrałeś");
            oneHandBanditGame.state = new NoCoinState();
        }
    }

    @Override
    public void takeTheWin(OneHandBanditGame oneHandBanditGame) {
        System.out.println("pociągnij dźwignię");
    }

    @Override
    public void listTheCurrentState(OneHandBanditGame oneHandBanditGame) {
        System.out.println("moneta wrzucona");
    }
}

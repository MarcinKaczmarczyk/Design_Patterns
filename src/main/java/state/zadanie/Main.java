package state.zadanie;

public class Main {
    public static void main(String[] args) {
        OneHandBanditGame oneHandBanditGame= new OneHandBanditGame();

        oneHandBanditGame.listTheCurrentState();
        oneHandBanditGame.insertCoin();
        oneHandBanditGame.pullTheLevers();
        oneHandBanditGame.takeTheWin();
    }
}

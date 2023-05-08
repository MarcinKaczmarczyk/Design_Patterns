package state.zadanie;

public class NoCoinState implements State{
    @Override
    public void insertCoin(OneHandBanditGame oneHandBanditGame) {
        System.out.println("Moneta została wrzucona");
        oneHandBanditGame.state = new CoinInsertedState();
    }

    @Override
    public void pullTheLevers(OneHandBanditGame oneHandBanditGame) {
        System.out.println("wrzuć monetę");
    }

    @Override
    public void takeTheWin(OneHandBanditGame oneHandBanditGame) {
        System.out.println("wrzuć monetę");
    }

    @Override
    public void listTheCurrentState(OneHandBanditGame oneHandBanditGame) {
        System.out.println("wrzuć monetę");
    }
}

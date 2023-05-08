package state.zadanie;

public class FinishGameState implements State{
    @Override
    public void insertCoin(OneHandBanditGame oneHandBanditGame) {
        System.out.println("Odbierz wygraną");
    }

    @Override
    public void pullTheLevers(OneHandBanditGame oneHandBanditGame) {
        System.out.println("Odbierz wygraną");
    }

    @Override
    public void takeTheWin(OneHandBanditGame oneHandBanditGame) {
        System.out.println("Możesz odebrać wygraną i spróbować ponownie");
        oneHandBanditGame.state=new NoCoinState();
    }

    @Override
    public void listTheCurrentState(OneHandBanditGame oneHandBanditGame) {
        System.out.println("Wygrałeś!");
    }
}

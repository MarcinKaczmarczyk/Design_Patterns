package state.zadanie;

public interface State {

    void insertCoin(OneHandBanditGame oneHandBanditGame);
    void pullTheLevers(OneHandBanditGame oneHandBanditGame);
    void takeTheWin(OneHandBanditGame oneHandBanditGame);
    void listTheCurrentState(OneHandBanditGame oneHandBanditGame);

}

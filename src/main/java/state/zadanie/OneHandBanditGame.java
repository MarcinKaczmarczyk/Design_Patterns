package state.zadanie;

public class OneHandBanditGame {

    State state;

    public OneHandBanditGame() {
        this.state = new NoCoinState();
    }

    public void insertCoin(){
        state.insertCoin(this);
    }
    public void pullTheLevers(){
        state.pullTheLevers(this);
    }
    public void takeTheWin(){
        state.takeTheWin(this);
    }
    public void listTheCurrentState(){
        state.listTheCurrentState(this);
    }
}

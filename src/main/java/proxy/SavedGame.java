package proxy;

public interface SavedGame {
    void initialize();
    void loadGame();
    String getName();
    String getGameData();
}

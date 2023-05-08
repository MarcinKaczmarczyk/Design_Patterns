package command.zadanie;

import command.zadanie.command.PlayFirstTrackCommand;
import command.zadanie.command.PlayNextTrackCommand;
import command.zadanie.command.PlayRandomTrackCommand;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();
        remote.setMusicPlayerCommand(new PlayFirstTrackCommand(musicPlayer));
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayNextTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayRandomTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
    }
}

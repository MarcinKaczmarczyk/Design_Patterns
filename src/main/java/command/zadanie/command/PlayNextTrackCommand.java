package command.zadanie.command;

import command.zadanie.MusicPlayer;

public class PlayNextTrackCommand implements MusicPlayerCommand{
    MusicPlayer player;

    public PlayNextTrackCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
    player.playNextTrack();
    }
}

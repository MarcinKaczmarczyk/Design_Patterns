package command.zadanie.command;

import command.zadanie.MusicPlayer;

public class PlayFirstTrackCommand implements MusicPlayerCommand{
    MusicPlayer player;

    public PlayFirstTrackCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
    player.playFirstTrack();
    }
}

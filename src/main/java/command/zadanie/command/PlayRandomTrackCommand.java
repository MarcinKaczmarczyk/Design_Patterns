package command.zadanie.command;

import command.zadanie.MusicPlayer;

public class PlayRandomTrackCommand implements MusicPlayerCommand {
    MusicPlayer player;

    public PlayRandomTrackCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
        player.playRandomTrack();
    }
}

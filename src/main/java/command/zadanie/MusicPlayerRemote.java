package command.zadanie;

import command.zadanie.command.MusicPlayerCommand;

public class MusicPlayerRemote {
    MusicPlayerCommand musicPlayer;


    public void pressButton(){
    musicPlayer.play();
    }

    public void setMusicPlayerCommand(MusicPlayerCommand musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
}

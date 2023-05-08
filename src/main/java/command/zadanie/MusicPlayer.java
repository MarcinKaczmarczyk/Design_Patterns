package command.zadanie;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");

    int currentTrackNumber = 0;

    public void playFirstTrack() {
        System.out.println(tracks.get(0));
        currentTrackNumber = 0;
    }

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber > tracks.size() - 1) {
            currentTrackNumber = 0;
        }
        System.out.println("Gram kolejny utwór: "+ tracks.get(currentTrackNumber));
    }

    public void playRandomTrack() {
        Random random=new Random();
        int rIndex=random.nextInt(tracks.size());
        System.out.println(tracks.get(rIndex));
    }
}

package pl.wnukedwarda.cd_library.CD;

import pl.wnukedwarda.cd_library.Genre;
import pl.wnukedwarda.cd_library.TimeUtil;
import pl.wnukedwarda.cd_library.Track.Track;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class CD {

    private UUID uuid;
    private String title;
    private String artist;
    private int releaseYear;
    private String producer;
    private List<Track> tracks;
    private boolean original;
    private int discCount;

    public int getTotalTime() {
        if (tracks != null) {
            return tracks.stream()
                    .mapToInt(track -> track.getTime())
                    .sum();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        String result = "Title: " + title +
                ", UUID: " + uuid +
                ", artist: " + artist +
                ", release year: " + releaseYear +
                ", producer: " + producer +
                ", total time: " + TimeUtil.intTimeToString(getTotalTime());
        //TODO ", genre: " + genre.getDescription() + "\n";
        if (original) {
            result += "CD is original\n";
        }
        result += "disc count: " + discCount +
                "\nTracks:\n";
        for (int i = 0; i < tracks.size(); i++) {
            result += (i + 1) + " " + tracks.get(i).toString() + "\n";
        }
        return result;
    }

    public Set<Genre> getGenres() {
        return tracks.stream()
                .flatMap(track -> track.getGenres().stream())
                .collect(Collectors.toSet());
    }
}

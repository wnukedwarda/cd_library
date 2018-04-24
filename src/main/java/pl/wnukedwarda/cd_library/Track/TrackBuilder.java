package pl.wnukedwarda.cd_library.Track;

import pl.wnukedwarda.cd_library.Genre;

import java.util.HashSet;
import java.util.Set;

public class TrackBuilder {

    private String title;
    private int time;
    private String artist;
    private Set<Genre> genres = new HashSet<>();

    public TrackBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public TrackBuilder setTime(int time) {
        this.time = time;
        return this;
    }

    public TrackBuilder setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public TrackBuilder setGenre(Genre genre) {
        this.genres.add(genre);
        return this;
    }

    public TrackBuilder setGenres(Set<Genre> genres) {
        this.genres.addAll(genres);
        return this;
    }

    public Track build() {
        return new Track(title, time, artist, genres);
    }
}

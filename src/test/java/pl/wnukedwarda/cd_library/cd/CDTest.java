package pl.wnukedwarda.cd_library.cd;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.wnukedwarda.cd_library.Genre;
import pl.wnukedwarda.cd_library.track.Track;
import pl.wnukedwarda.cd_library.track.TrackBuilder;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CDTest {

    private static final int TRACK1_TIME = 100;
    private static final int TRACK2_TIME = 100;
    private static final Genre GENRE1 = Genre.RAP;
    private static final Genre GENRE2 = Genre.ROCK;
    private static final Genre GENRE3 = Genre.JAZZ;
    private static final Genre GENRE4 = Genre.POP;

    private CD cd;

    @BeforeEach
    void setup() {
        Track track1 = new TrackBuilder()
                .setTime(TRACK1_TIME)
                .setGenre(GENRE1)
                .setGenre(GENRE2)
                .build();
        Track track2 = new TrackBuilder()
                .setTime(TRACK2_TIME)
                .setGenre(GENRE3)
                .setGenre(GENRE4)
                .build();
        cd = new CDBuilder()
                .setTrack(track1)
                .setTrack(track2)
                .build();
    }

    @Test
    void shouldReturnTotalTimeOfAllTracks() {
        int expectedTime = TRACK1_TIME + TRACK2_TIME;
        assertEquals(expectedTime, cd.getTotalTime());
    }

    @Test
    void shouldReturnGenresFromAllTracks() {
        Set<Genre> genres = cd.getGenres();
        assertEquals(4, genres.size());
        assertTrue(genres.contains(GENRE1));
        assertTrue(genres.contains(GENRE2));
        assertTrue(genres.contains(GENRE3));
        assertTrue(genres.contains(GENRE4));
    }
}


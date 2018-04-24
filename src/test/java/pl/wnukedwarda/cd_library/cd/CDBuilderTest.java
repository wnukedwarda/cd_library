package pl.wnukedwarda.cd_library.cd;

import org.junit.jupiter.api.Test;
import pl.wnukedwarda.cd_library.track.Track;
import pl.wnukedwarda.cd_library.track.TrackBuilder;

import static org.junit.jupiter.api.Assertions.*;

class CDBuilderTest {

    @Test
    void testCDBuilder() {
        Track track1 = new TrackBuilder()
                .setTitle("title1")
                .build();
        Track track2 = new TrackBuilder()
                .setTitle("title2")
                .build();
        Track track3 = new TrackBuilder()
                .setTitle("title3")
                .build();
        CD cd = new CDBuilder()
                .setTitle("cd title")
                .setTrack(track1)
                .setTrack(track2)
                .setTrack(track3)
                .build();
        assertEquals("cd title", cd.getTitle());
        assertEquals(3, cd.getTracks().size(), "CD should has got 3 tracks");
        assertEquals("title1", cd.getTracks().get(0).getTitle());
        assertEquals("title2", cd.getTracks().get(1).getTitle());
        assertEquals("title3", cd.getTracks().get(2).getTitle());
    }
}
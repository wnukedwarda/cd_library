package pl.wnukedwarda.cd_library.Track;

import pl.wnukedwarda.cd_library.Genre;
import pl.wnukedwarda.cd_library.TimeUtil;
import java.util.Set;
import java.util.stream.Collectors;

    public class Track {

        private String title;
        private int time;
        private String artist;
        private Set<Genre> genres;

        public Track(String title, int time, String artist, Set<Genre> genres) {
            this.title = title;
            this.time = time;
            this.artist = artist;
            this.genres = genres;
        }

        public String getTitle() {
            return title;
        }

        public int getTime() {
            return time;
        }

        public String getArtist() {
            return artist;
        }

        public Set<Genre> getGenres() {
            return genres;
        }

        @Override
        public String toString() {
            return "Title: " + title +
                    ", time: " + TimeUtil.intTimeToString(time) +
                    ", artist: " + artist +
                    ", genres: " + getGenresDescription();
        }

        private String getGenresDescription() {
            return genres.stream()
                    .map(Genre::getDescription)
                    .collect(Collectors.joining(", "));
        }
    }



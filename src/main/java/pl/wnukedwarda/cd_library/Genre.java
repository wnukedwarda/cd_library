package pl.wnukedwarda.cd_library;

public enum Genre {

    AFRICAN_HEAVY_METAL("african heavy metal"),
    BENGA("benga"),
    CLASSICAL("classical"),
    JAZZ("jazz"),
    POP("pop"),
    ROCK("rock"),
    RAP("rap");

    private String description;

    public String getDescription() {
        return description;
    }

    Genre(String description) {
        this.description = description;
    }

    public static Genre fromDescription(String description) {
        return null;
    }
}

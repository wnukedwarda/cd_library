package pl.wnukedwarda.cd_library;

import pl.wnukedwarda.cd_library.cd.CD;
import pl.wnukedwarda.cd_library.menu.CDDisplay;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ArtistFinder {

    private CDLibrary cdLibrary;
    private Scanner scanner;

    public ArtistFinder(CDLibrary cdLibrary, Scanner scanner) {
        this.cdLibrary = cdLibrary;
        this.scanner = scanner;
    }

    public void findByArtist() {
        System.out.println("Enter artist:");
        String artist = scanner.nextLine();
        System.out.println("All CDs of " + artist);
        List<CD> CDs = cdLibrary.findByArtist(artist);
        CDDisplay.show(CDs);
    }

    public void findAllArtists() {
        Set<String> allArtists = cdLibrary.findAllArtists();
        System.out.println("All artists from CD library");
        allArtists.forEach(artist -> System.out.println(artist));
    }
}

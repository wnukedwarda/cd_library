package pl.wnukedwarda.cd_library;

import pl.wnukedwarda.cd_library.menu.CDDisplay;

import java.util.Scanner;

public class TitleFinder {

    private CDLibrary cdLibrary;
    private Scanner scanner;

    public TitleFinder(CDLibrary cdLibrary, Scanner scanner) {
        this.cdLibrary = cdLibrary;
        this.scanner = scanner;
    }


    public void findCDs() {
        System.out.println("Enter CD title:");
        String title = scanner.nextLine();
        System.out.println("CDs with title containing " + title);
        CDDisplay.show(cdLibrary.findCDByTitle(title));
    }

    public void findTracks() {
        System.out.println("Enter track title:");
        String title = scanner.nextLine();
        System.out.println("Tracks with title containing " + title);
        cdLibrary.findTrackByTitle(title)
                .forEach(track -> System.out.println(track));
    }

}

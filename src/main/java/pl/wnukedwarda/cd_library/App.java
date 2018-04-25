package pl.wnukedwarda.cd_library;

import pl.wnukedwarda.cd_library.menu.CDDisplay;
import pl.wnukedwarda.cd_library.menu.CDReader;

import java.util.Scanner;

public class App {
    private static final String FILENAME = "cdlibrary.txt";

    private CDLibrary cdLibrary = new CDLibrary();
    private Scanner scanner = new Scanner(System.in);
    private CDReader cdReader = new CDReader(cdLibrary, scanner);
    private ArtistFinder artistFinder = new ArtistFinder(cdLibrary, scanner);
    private TitleFinder titleFinder = new TitleFinder(cdLibrary, scanner);

    public void showMainMenu() {
        cdLibrary.loadFromFile(FILENAME);
        boolean exit = false;
        while (!exit) {
            System.out.println("Main menu:");
            System.out.println("1. Add new CD");
            System.out.println("2. Show all CDs");
            System.out.println("3. Find CDs by artist");
            System.out.println("4. Show all artists");
            System.out.println("5. Find CDs by title");
            System.out.println("6. Find tracks by title");
            System.out.println("7. Exit");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    cdReader.addNewCD();
                    break;
                case 2:
                    CDDisplay.show(cdLibrary.getCDs());
                    break;
                case 3:
                    artistFinder.findByArtist();
                    break;
                case 4:
                    artistFinder.findAllArtists();
                    break;
                case 5:
                    titleFinder.findCDs();
                    break;
                case 6:
                    titleFinder.findTracks();
                    break;
                default:
                    exit = true;
            }
        }
        cdLibrary.saveToFile(FILENAME);
    }

    public static void main(String[] args) {
        App app = new App();
        app.showMainMenu();
    }
}

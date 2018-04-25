package pl.wnukedwarda.cd_library.menu;

import pl.wnukedwarda.cd_library.cd.CD;

import java.util.List;

public class CDDisplay {
    public static void show(List<CD> list) {
        list.forEach(cd -> System.out.println(cd));
    }
}

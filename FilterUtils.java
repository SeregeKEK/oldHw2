package Hw6;

import java.util.HashSet;
import java.util.Set;

public class FilterUtils {
    public static Set<NoteBook> filterByRAM(Set<NoteBook> notebooks, int minRAM) {
        Set<NoteBook> filteredNotebooks = new HashSet<>();
        for (NoteBook notebook : notebooks) {
            if (notebook.getRam() >= minRAM) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }

    public static Set<NoteBook> filterByHDD(Set<NoteBook> notebooks, int minHDD) {
        Set<NoteBook> filteredNotebooks = new HashSet<>();
        for (NoteBook notebook : notebooks) {
            if (notebook.getHdd() >= minHDD) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }

    public static Set<NoteBook>
    filterByOperatingSystem(Set<NoteBook> notebooks, String operatingSystem) {
        Set<NoteBook> filteredNotebooks = new HashSet<>();
        for (NoteBook notebook : notebooks) {
            if
            (notebook.getOperatingSystem().equalsIgnoreCase(operatingSystem)) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }

    public static Set<NoteBook> filterByColor(Set<NoteBook> notebooks, String color) {
        Set<NoteBook> filteredNotebooks = new HashSet<>();
        for (NoteBook notebook : notebooks) {
            if (notebook.getColor().equalsIgnoreCase(color)) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }
}
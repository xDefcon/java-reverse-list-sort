package com.luigimartinelli;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Luca");
        list.add("Franco");
        list.add("Mario");
        list.add("Alfredo");
        list.add("Zanzibar");

        ListSorter ls = new ListSorter(list);
        List<String> sortedList = ls.getReverseAlphabeticalSortedList();

        logger.info("Lista ordinata: ");
        for (String s : sortedList) {
            logger.info(s);
        }
    }
}
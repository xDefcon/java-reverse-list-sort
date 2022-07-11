package com.luigimartinelli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Simple implementation of a ListSorter class
 * with only the single method as requested
 *
 * @author Luigi Martinelli
 */
public class ListSorter {
    private List<String> list;

    public ListSorter(List<String> list) {
        this.list = list;
    }

    public List<String> getReverseAlphabeticalSortedList() {
        List<String> sortedList = new ArrayList<>(list);
        sortedList.sort(Collections.reverseOrder());
        return sortedList;
    }

    public List<String> getOriginalList() {
        return list;
    }

    public void setOriginalList(List<String> list) {
        this.list = list;
    }
}

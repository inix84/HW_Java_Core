package org.skypro.skyshop;

import org.skypro.skyshop.Search.Searchable;

import java.util.Comparator;

public class MaxLengthNameComparator implements Comparator<Searchable> {
    @Override
    public int compare(Searchable o1, Searchable o2) {
        //return o2.compareTo(o1); // для обратного порядка по имени
        return o1.getNameLength()-o2.getNameLength();
    }
}

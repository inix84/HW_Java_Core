package org.skypro.skyshop;

import org.skypro.skyshop.Search.Searchable;

import java.util.Comparator;

public class MaxLengthNameComparator implements Comparator<Searchable> {
    @Override
    public int compare(Searchable o1, Searchable o2) {
        int r=0;
        if (o1.getNameLength() - o2.getNameLength() == 0) {
            r = o2.getSearchTerm().compareTo(o1.getSearchTerm());// по естественному порядку
        }
//        int r = -1;
//        if (o1.getNameLength() - o2.getNameLength() == 0) {
//            if (o1.gettingContentType() == "ARTICLE") {
//                r = 1;
//            }
//        }
        if (o1.getNameLength() - o2.getNameLength() != 0) {
            r = o1.getNameLength() - o2.getNameLength();// по длине имени
        }
        return r;
    }
}

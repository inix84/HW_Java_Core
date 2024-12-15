package org.skypro.skyshop.Search;

import java.util.Arrays;

public class SearchEngine { // Поисковый движок
    private Searchable[] searchable;
    private int sizeSearchable = 0;

    public SearchEngine(int size) {
        this.searchable = new Searchable[size];
    }

    public void add(Searchable searchableName) {
        searchable[sizeSearchable] = searchableName;
        sizeSearchable++;
    }

    public Searchable[] search(String searchableName) {
        Searchable[] searchable1 = new Searchable[5]; // создала новый массив, на 5 элементов
        int j = 0; // индекс нового массива
        for (int i = 0; i < sizeSearchable; i++) {
            if (searchable[i].gettingSearchTerm().equals(searchableName)) {
                searchable1[j] = searchable[i];
                j++;
            }
            if (searchable1.length == 5) {
                break;
            }
        }
        System.out.println(Arrays.toString(searchable1));
        return searchable1;
    }

}
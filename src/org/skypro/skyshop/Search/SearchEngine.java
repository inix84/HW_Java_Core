package org.skypro.skyshop.Search;


import java.util.Arrays;

public class SearchEngine { // Поисковый движок
    private Searchable[] Searchable;
    private int sizeSearchable = 0;

    public SearchEngine() {
        this.Searchable = new Searchable[5];
    }

    public void add(Searchable SearchableName) {
        Searchable newSearchable = new Searchable() {
            @Override
            public String gettingSearchTerm() {
                return "";
            }

            @Override
            public String gettingContentType() {
                return "";
            }
        };
        Searchable[sizeSearchable] = newSearchable;
        sizeSearchable++;
    }

    public void search(String SearchableName) {
        for (int i = 0; i < sizeSearchable; i++) {
            if (Searchable[i].gettingSearchTerm().equals(SearchableName)) {

                ;
            }
            System.out.println(Arrays.toString(Searchable));
        }
    }
}
package org.skypro.skyshop.article;

import org.skypro.skyshop.Searchable;

public class Article implements Searchable {
    String titleArticle; // название статьи
    String textArticle; // тест статьи

    @Override
    public String toString() {
        return " Название статьи " + titleArticle + '\'' +
                "Текст статьи " + textArticle;
    }

    @Override
    public String gettingSearchTerm() {
        return toString();
    }

    @Override
    public String gettingContentType() {
        return "ARTICLE";
    }
}

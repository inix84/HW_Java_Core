package org.skypro.skyshop.article;

import org.skypro.skyshop.Search.Searchable;

public class Article implements Searchable {
    private final String titleArticle; // название статьи
    private final String textArticle; // текст статьи

    public Article(String titleArticle, String textArticle) {
        this.textArticle = textArticle;
        this.titleArticle = titleArticle;
    }

    @Override
    public String toString() {
        return " Название статьи: " + titleArticle + ", Текст статьи: " + textArticle;
    }

    @Override
    public String gettingSearchTerm() {
        return titleArticle + textArticle;
    }

    @Override
    public String gettingContentType() {
        return "ARTICLE";
    }
}

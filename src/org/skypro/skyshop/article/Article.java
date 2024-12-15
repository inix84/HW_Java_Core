package org.skypro.skyshop.article;

import org.skypro.skyshop.Search.Searchable;

public class Article implements Searchable {
    String titleArticle; // название статьи
    String textArticle; // тест статьи

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
        return toString();
    }

    @Override
    public String gettingContentType() {
        return "ARTICLE";
    }
}

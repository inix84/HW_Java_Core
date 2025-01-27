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
        return "СТАТЬЯ: Название - " + titleArticle + ", текст - " + textArticle;
    }

    @Override
    public String gettingSearchTerm() {
        return titleArticle; //+ ":" + textArticle;
    }
    @Override
    public String getSearchTerm() {
        String article = titleArticle + textArticle; // склееенная строка
        return article;
    }
    @Override
    public String gettingContentType() {
        return "ARTICLE";
    }
}
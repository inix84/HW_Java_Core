package org.skypro.skyshop.article;

import org.skypro.skyshop.Search.Searchable;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article article)) return false;
        return Objects.equals(titleArticle, article.titleArticle);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titleArticle);
    }
}
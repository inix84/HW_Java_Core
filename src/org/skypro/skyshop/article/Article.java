package org.skypro.skyshop.article;

import org.skypro.skyshop.Search.Searchable;

import java.util.Objects;

public class Article implements Searchable, Comparable<Searchable> {
    private final String titleArticle; // название статьи
    private final String textArticle; // текст статьи

    public Article(String titleArticle, String textArticle) {
        this.textArticle = textArticle;
        this.titleArticle = titleArticle;
    }

    @Override
    public String toString() {
        return "СТАТЬЯ: " + titleArticle + " /текст: " + textArticle + "/";
    }

    @Override
    public String gettingSearchTerm() {
        return titleArticle;
    }

    @Override
    public String getSearchTerm() {
        String article = titleArticle + textArticle; // склееенная строка
        return article;
    }

    @Override
    public Integer getNameLength() {
        return gettingSearchTerm().length();
    }

    @Override
    public String gettingContentType() {
        return "ARTICLE";
    }

    @Override
    public void getStringRepresentation() {
        Searchable.super.getStringRepresentation();
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

    @Override
    public int compareTo(Searchable o) {
        return gettingSearchTerm().compareTo(o.gettingSearchTerm()); // естественный порядок сравнения имен
    }
}
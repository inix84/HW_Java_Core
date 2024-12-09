package org.skypro.skyshop.Article;

public class Article {
    String titleArticle; // название статьи
    String textArticle; // тест статьи

    @Override
    public String toString() {
        return " Название статьи " + titleArticle + '\'' +
                "Текст статьи " + textArticle;
    }
}

package org.skypro.skyshop.application.errors;

import java.io.IOException;

public class BestResultNotFound extends IOException {
private String search;

    public BestResultNotFound(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "Для поискового запроса по слову '" + search + "' не нашлось подходящей статьи.";
    }
}

package org.skypro.skyshop.Search; // ПОИСК это серч

import org.skypro.skyshop.application.errors.BestResultNotFound;

import java.util.*;

public class SearchEngine { // Поисковый движок
    private Set searchable; // заменила

    public SearchEngine() {
        this.searchable = new HashSet(); // поменяла конструктор
    }

    public void add(Searchable searchableName) { // все созданные элементы добавляются в мно searchable
        searchable.add(searchableName);
    }

    public Set<Searchable> search(String searchableName) {
        Set<Searchable> result = new HashSet<>(); // создала новый список для найденных
        Iterator<Searchable> iterator = searchable.iterator();// получаем итератор по списку searchable
        while (iterator.hasNext()) { // пока есть след/элемент в списке
            Searchable element = iterator.next();
            if (element.gettingSearchTerm().equals(searchableName)) {
                result.add(element);
            }
        }
        System.out.println(result);
        return result;
    }

    public Searchable searchSuitableElement(String search) throws BestResultNotFound { //  метод Поиска Подходящего Элемента (продукт/ статья)
        Searchable searchResult = null; // подходящий элемент
        String str, substring; // строка, подстрока
        int quantityResult = 0; // счетчик вхождений

        Iterator<Searchable> iterator = searchable.iterator();// получаем итератор по списку searchable
        while (iterator.hasNext()) { // пока есть след/элемент в списке
            Searchable element = iterator.next();
            if (element.gettingSearchTerm().equals(search)) {
                str = element.getSearchTerm(); // строка element
                substring = search; // подстрока

                int quantity = 0; // количество вхождений
                int index = 0; // текущий индекс в строке
                int indexSubStr = str.indexOf(substring, index); // целое число 'Индекс подстроки' это индекс первого вхождения начиная с индекса строки (при первом вхождении =0)

                while (indexSubStr != -1) { // возвращает -1 когда не находит вхождений
                    quantity++; // увеличение количества, при нахождении подстроки в строке
                    index = indexSubStr + substring.length(); // переприсвоение текущему индексу номера подиндекса + длина слова
                    indexSubStr = str.indexOf(substring, index); // переприсвоение подиндекса с учетом нового индекса начала
                }
                if (quantityResult < quantity) {
                    quantityResult = quantity;
                    searchResult = element;
                }
            }
        }

        if (searchResult == null) {
            throw new BestResultNotFound(search);
        }
        System.out.println("Самый подходящий элемент поиска по слову '" +
                search + "' является элемент /" + searchResult +
                "/, в нем количество вхождений поискового слова = " + quantityResult);
        return searchResult;
    }

    @Override
    public String toString() {
        return "В поиске участвуют следующие элементы = " +
                "\n" + searchable;
    }
}

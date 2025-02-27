package org.skypro.skyshop.Search; // ПОИСК это серч

import org.skypro.skyshop.application.errors.BestResultNotFound;
import org.skypro.skyshop.product.Product;

import java.util.*;

public class SearchEngine { // Поисковый движок
    private Map<String, List<Searchable>> searchable; // заменила на Map

    public SearchEngine() {
        this.searchable = new TreeMap<>(); // поменяла конструктор на TreeMap
    }

    public void add(Searchable searchableName) { // все созданные элементы (продукты и статьи) добавляются в searchable
        List searchableList = searchable.computeIfAbsent(searchableName.gettingSearchTerm(), k -> new ArrayList<>()); // лист для значений, если нет, будет создан
        searchableList.add(searchableName); // положен термин в лист значений
        searchable.put(searchableName.gettingSearchTerm(), searchableList); // добавление ключа и значения
        System.out.println("мапа содержит теперь  = " + searchable);
    }

    public Map <String, Searchable> search(String searchableName) {
        //System.out.println("searchable.get(searchableName)" + searchable.get(searchableName));
        Map<String, Searchable> result = new TreeMap<>(); // создала новую мапу для найденных ЭЛЕМЕНТОВ(статьи и продукты)
        for (String name : searchable.keySet()) { // идем по всем ключам
            if (name == searchableName) { // если строковые поля равны, ключ и поисковое слово
                result.put(name, (Searchable) searchable.get(searchableName)); // добавляем в ключ этот ключ, а в значение значение этого поискового слова
            }
        }
        System.out.println("по поисковому запросу /" + searchableName + "/ найдены след.продукты и статьи: " + result);
        return result;
    }

    public Searchable searchSuitableElement(String search) throws BestResultNotFound { //  метод Поиска Подходящего Элемента (продукт/ статья)
        Searchable searchResult = null; // подходящий элемент
        String str, substring; // строка, подстрока
        int quantityResult = 0; // счетчик вхождений

        for (List<Searchable> searchableList : searchable.values()) {
            for (Searchable searchable : searchableList) {
                if (searchable.gettingSearchTerm().equals(search)) {

                    str = searchable.getSearchTerm(); // строка element
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
                        searchResult = searchable;
                    }
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
}
package org.skypro.skyshop.Search; // ПОИСК это серч

import org.skypro.skyshop.application.errors.BestResultNotFound;

import java.util.Arrays;

public class SearchEngine { // Поисковый движок
    private Searchable[] searchable;
    private int sizeSearchable = 0;

    public SearchEngine(int size) {
        this.searchable = new Searchable[size]; // заданный размер сайз для созжания всех элементов
    }

    public void add(Searchable searchableName) { // сначала они все созданные элементы добавляются в массив элементов searchable[sizeSearchable], ограниченного размером сайз
        searchable[sizeSearchable] = searchableName;
        sizeSearchable++; // и число элементов увеличивается
    }

    public Searchable[] search(String searchableName) {
        Searchable[] result = new Searchable[5]; // создала новый массив, на 5 элементов, у него индекс j
        int j = 0; // индекс нового массива
        for (int i = 0; i < sizeSearchable; i++) {
            if (searchable[i].gettingSearchTerm().equals(searchableName)) {
                result[j] = searchable[i];
                j++;
            }
            if (j == 5) {
                break;
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public Searchable searchSuitableElement(String search) throws BestResultNotFound { //  метод Поиска Подходящего Элемента (продукт/ статья)
        Searchable searchResult = null; // подходящий элемент
        String str, substring; // строка, подстрока
        int quantityResult = 0; // счетчик вхождений
        for (int i = 0; i < sizeSearchable; i++) { // перебор всех созданных номеров элементов
            if (searchable[i].gettingSearchTerm().equals(search)) { // нашел совпадающий по имени элемент
                str = searchable[i].getSearchTerm(); // строка
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
                    searchResult = searchable[i];
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
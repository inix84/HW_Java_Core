package org.skypro.skyshop.Search;

public interface Searchable { // ДОПУСТИМЫЙ ПОИСК
    // Метод получения search term (термина поиска) — метод, который будет возвращать текст, по которому мы будем искать.
    String gettingSearchTerm();

    // Метод получения типа контента, который мы нашли. Метод должен возвращать строку с названием типа контента.
    String gettingContentType();

    //Метод получения имени Searchable-объекта. лучше назвать getStringRepresentation()
    default void getStringRepresentation() {// представление в виде строки всего найденного
        //Стоит сделать этот метод интерфейса default и добавить реализацию, которая будет выводить строку вида: «имя Searchable-объекта — типSearchable -объекта».
        System.out.println(gettingSearchTerm() + " - имя Searchable-объекта, " + gettingContentType() + " — тип Searchable-объекта");
    }
    String getSearchTerm(); // метод получение одной строчки из элементов для нахождения вхождений

    // Метод получения длины имени ЭЛЕМЕНТа.
    Integer getNameLength();
// для компаратора (???)
    //int compareTo(Searchable o1); (???)
}
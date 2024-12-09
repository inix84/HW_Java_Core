package org.skypro.skyshop;

public interface Searchable {
    // Метод получения search term (термина поиска) — метод, который будет возвращать текст, по которому мы будем искать.
    String gettingSearchTerm();

    // Метод получения типа контента, который мы нашли. Метод должен возвращать строку с названием типа контента.
    String gettingContentType();

    //Метод получения имени Searchable-объекта. лучше назвать getStringRepresentation()
    default void getStringRepresentation() {
        //Стоит сделать этот метод интерфейса default и добавить реализацию, которая будет выводить строку вида: «имя Searchable-объекта — типSearchable -объекта».
        System.out.println("имя Searchable-объекта" + "— типSearchable -объекта");
    }
}

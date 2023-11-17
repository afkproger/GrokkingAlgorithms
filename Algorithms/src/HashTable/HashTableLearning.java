package HashTable;

import java.util.*;

/**
 * Хэш - Функции
 * Представляет собой функцию, которая получает данные и возвращает число(т.е отображает строки на числа)
 * Требования хэш - функции
 * 1)Она должна быть последовательной.Т.е для одних и тех же данных возвращать одно и то же число
 * 2)Разным данным должны соответствовать разные числа(но не всегда так получается, разберёмся позже)
 * <p>
 * <p>
 * Хэш - Таблицы
 * Хэш таблица хранит пары ключ значение. В самом лучшем и идеальном случае в основе таблицы лежит просто массив,
 * где хэш код ключа - это индекс массива, а вот значение по этому индексу и есть наше значение.
 * <p>
 * <p>
 * Хэш таблицы отлично работают когда мы хотим
 * 1)создать связь, отображающую один объект на другой
 * 2)найти значение в списке
 * <p>
 * Использование хэш - таблиц
 * 1)Используем для поиска
 * пример:Телефонная книга(ключ - имя,значение - номер телефона)
 * 2)Исключение дубликатов
 * Как проверить то, голосовал ли избиратель или нет?
 * Создадим хэш - мап и будем проверять по ключу (имя ключ) голосовал ли человек или нет?
 * Если да, то гоним наглеца, иначе добавляем его в список проголосовавших.
 *
 *
 * Коллизия
 * Что это такое. Это ситуация при которой двум одинаковым ключам сопоставляются два разных значения
 *
 */

public class HashTableLearning {
    public static void exampleForShop() {
        Map<String, Double> book = new HashMap<>();
        book.put("apple", 0.67);
        book.put("milk", 1.49);
        book.put("avocado", 1.49);

        System.out.println(book);
        System.out.println(book.get("avocado"));
    }

    public static void exampleForPhoneBook() {
        Map<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("jenny", 8677309);
        phoneBook.put("emergency", 911);


        System.out.println(phoneBook.get("jenny"));
    }

    public static void thePollingStation() {
        Map<String, Boolean> voted = new HashMap<>();
        voted.put("Alex", true);
        voted.put("Nikolay", true);
        voted.put("Ivan", true);

        isPersonVoted("Alex", voted);

        System.out.println(voted);

        isPersonVoted("Dima", voted);
        System.out.println(voted);
    }

    private static void isPersonVoted(
            String name, Map<String, Boolean> voted) {
        if(voted.containsKey(name)){
            System.out.println("Вы уже проголосовали");
            return;
        }
        voted.putIfAbsent(name, true);
    }


}






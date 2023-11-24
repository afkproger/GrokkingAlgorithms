package Graphs;


import java.util.ArrayList;
import java.util.List;

/**
 * Мы разбираем такую структуру данных как графы. Они используются для моделирования связей между объектами.
 * Самый главный алгоритм поиска связанный с графом - это поиск в ширину, который позволяет решить 2 вопроса
 * 1) Существует ли путь из узла А в узел В
 * 2) Поиск кратчайшего пути из узла А в узел В
 *
 * Для реализации такого алгоритма нам нужно разобраться с такой структурой данных как "Очередь"
 * Это структура данных входит в категорию FIFO(First In First Out)
 * Поэтому в этом классе мы реализуем очередь
 */




public class Queue_Implementation<T> implements Queue <T>{
    @Override
    public String toString() {
        return "Queue_Implementation{" +
                "arrayForQueueRealization=" + arrayForQueueRealization +
                '}';
    }
//В этом алгоритме мы добавляем элемент за элементом в порядке ввода, а потом первый достаем

    private List<T> arrayForQueueRealization = new ArrayList<>();
    @Override
    public void add(T item) {
        arrayForQueueRealization.add(item); // в ArrayList элементы добавляются в конец листа
    }

    @Override
    public void add(List<T> list) {
        System.out.println(list);
        arrayForQueueRealization.addAll(list);
    }

    @Override
    public T remove() {
        return arrayForQueueRealization.remove(0); // удаляем первый элемент
    }

    @Override
    public boolean isEmpty() {
        return arrayForQueueRealization.isEmpty(); // проверяем пуста ли очередь
    }
}






// Простой интерфейс с методами, которые нужны для реализации очереди
interface Queue<T> {
    void add (T item);

    void add (List<T> list);

    T remove();

    boolean isEmpty();
}
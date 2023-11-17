package HashTable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashTableRealization {

    private int capacity = 0;
    private List<LinkedList<Integer>> table;

    public HashTableRealization(int capacity) {
        this.capacity = capacity;
        this.table = makeTable(this.capacity);
    }

    //выделяем память для нашей таблицы
    private static List<LinkedList<Integer>> makeTable(int capacity) {
        List<LinkedList<Integer>> table = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            table.add(new LinkedList<>());
        }

        return table;
    }
    // функция хеширования, не самая лучшая, но какую придумал
    private static int hashFunctionRealization(int inputData) {
        inputData = Math.abs(((inputData * (17 * 31) / (47 * 7)) - 31) + (inputData / 2) * 7);
        return inputData;
    }
    //добавление значений в таблицу
    public void addValueToTable(int value) {
        int index = hashFunctionRealization(value) % this.capacity;
        table.get(index).add(value);
    }

    @Override
    public String toString() {
        return "HashTableRealization{" +
                ", table=" + table +
                '}';
    }
}

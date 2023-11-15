package Sotrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * Напоминание: Массивы размерностью 1 и 0 сортировать не нужно, мы можем просто их вернуть(это будет нащ базовый
 * случай для быстрой сортировки)!
 * Алгоритм быстрой сортировки основывается на стратегии - разделяй и властвуй. Следовательно, массив
 * должен разделяться до тех пор, пока мы не дойдем до базового случая.
 * 1 - Ищем опорный элемент.
 * 2 - Ищем элементы больше и меньше опорного. Этот процесс называется разделением. После этого
 * этапа у нас есть под массив всех элементов, меньших опорного, опорный элемент,
 * подмассив всех элементов больше опорного
 */


/**
 * Быстрая сортировка доказывается методом индукции. При этом доказательстве есть 2 этапа
 * 1 - базовый случай(Массив с 1 элементов и пустой массив)
 * 2 - индукционный переход (если я могу доказать что - то для 2 вещей, я могу доказать то же самое и для 3
 * и т.д. Т.е если быстрая сортировка работает для 2 элементов, то она будет работать для 3 элементов и тюд и т.п
 */


public class QuickSort {
    public List<Integer> quicksort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        } else {
            int middleIndex = list.size() / 2;
            int middleElement = list.get(middleIndex);
            List<Integer> smallest = new ArrayList<>();
            List<Integer> biggest = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                if (i == middleIndex) {
                    continue;
                }
                if (list.get(i) >= middleElement) {
                    biggest.add(list.get(i));
                } else {
                    smallest.add(list.get(i));
                }
            }

            smallest = quicksort(smallest);
            biggest = quicksort(biggest);


            List<Integer> sorted = new ArrayList<>(smallest);
            sorted.add(middleElement);
            sorted.addAll(biggest);
            return sorted;
        }
    }
}

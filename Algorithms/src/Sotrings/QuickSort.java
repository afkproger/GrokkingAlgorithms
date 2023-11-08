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
            // Базовый случай
        } else {
            int pivot = list.get(0); // это наша опорная точка
            List<Integer> smallestPivot = new ArrayList<>();  // подмассив для элементов меньше опорной точки
            List<Integer> biggestPivot = new ArrayList<>();   // подмассив для элементов больше опорной точки

            //цикл для отбора подмассивов, нужно не забыть что мы идём от 1 элемента, т.к.опорная точка - нулевой эллемент
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) <= pivot) {
                    smallestPivot.add(list.get(i));
                } else {
                    biggestPivot.add(list.get(i));
                }
            }
            /**
             * Почему не получалось до этого?
             * Я забывал присвоить smallest and biggest новые значения, т.е. отсортированные массивы
             * Как это выглядело:quicksort(smallestPivot);  quicksort(biggestPivot);
             * Короче, как обычно, накринжевал и сидел довольным
             */

            smallestPivot = quicksort(smallestPivot);
            biggestPivot = quicksort(biggestPivot);

            List<Integer> sortingList = new ArrayList<>(smallestPivot);
            sortingList.add(pivot);
            sortingList.addAll(biggestPivot);

            return sortingList;
        }
    }
}

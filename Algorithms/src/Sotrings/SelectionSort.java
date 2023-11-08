package Sotrings;

import java.util.ArrayList;
import java.util.List;

class SelectionSort {
    private int findSmallest(List<Integer> array) {
        int smallest = array.get(0);
        int smallest_index = 0;
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < smallest) {
                smallest = array.get(i);
                smallest_index = i;
            }
        }
        return smallest_index;
    }


    public List<Integer> sort(List<Integer> array) {
        List<Integer> newArr = new ArrayList<>();
        int arraySizeBeforeDelete = array.size(); // когда мы удаляем элемент размерность
        for (int i = 0; i < arraySizeBeforeDelete; i++) {
            int smallest = findSmallest(array);
            newArr.add(array.remove(smallest));
        }
        return newArr;
    }
}

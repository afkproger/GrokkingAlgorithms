package Sotrings;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        ArrayList<Integer> integers = new ArrayList<>(List.of(10, 5, 3, 2));
        System.out.println(quickSort.quicksort(integers));
    }
}

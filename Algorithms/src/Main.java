import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(List.of(1,3,5,7,9));
        System.out.println(BinarySearch(myList,3));
        System.out.println(BinarySearch(myList,-1));
    }

    //TODO:Бинарный поиск работает только на отсортированных элементах
    // Если количество попыток поиска элемента = кол - ву элементов
    // то время выполнения называют - линейным
    // А бинарный поиск выполняется логарифмическое время
    // 0 - big описывает насколько быстро растёт время выполнения с увеличением кол - ва элементов

    // разобраться с умными комментариями
    public static int BinarySearch(List<Integer> list , int item){
        int low = 0 ;
        int high = list.size()  - 1;
        while (low <= high){
            int mid = (low + high)/2;
            int guess = list.get(mid);
            if (guess == item){
                return mid;
            }
            if (guess > item){
                high = mid -1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }



}
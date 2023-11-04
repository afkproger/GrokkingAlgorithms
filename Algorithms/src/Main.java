import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Recursion.factorial(5));
    }





}
class BinarySearch {
    public int search (List<Integer> list, int item){
        int low = 0 ;
        int high = list.size() - 1;
        int guess = 0;
        while (low <= high){
            int mid = (low + high)/2;
            guess = list.get(mid);
            if (guess == item){
                return mid;
            }
            if (guess < item){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
class SelectionSort {
    private int findSmallest(List<Integer> array){
        int smallest = array.get(0);
        int smallest_index = 0;
        for (int i = 1; i < array.size() ; i++) {
            if (array.get(i) < smallest){
                smallest = array.get(i);
                smallest_index = i;
            }
        }
        return smallest_index;
    }


    public List<Integer> sort (List<Integer> array){
        List<Integer> newArr =  new ArrayList<>();
        int arraySizeBeforeDelete = array.size(); // когда мы удаляем элемент размерность
        for (int i = 0; i < arraySizeBeforeDelete; i++) {
            int smallest = findSmallest(array);
            newArr.add( array.remove(smallest));
        }
        return newArr;
    }
}

class Recursion {
    /*Любая рекурсия должна содержать две части
    1) базовый случай (функция себя не вызывает, чтобы предотвратить зацикливание)
    2) рекурсивный случай
    */
    public static void greet(String name){
        System.out.println("Hello " + name + " !");
        greet2(name);
        System.out.println("getting ready to say bye...");
        bye();
    }

    public static void greet2 (String name){
        System.out.println("how are you, " + name + " ?");
    }
    public static void bye(){
        System.out.println("bye");
    }
    public void countdown(int number){
        if (number == 0){
            return;
            //базовый случай
        }
        System.out.println(number);
        countdown(number - 1); // рекурсивный случай
    }

    public static int factorial(int number){
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
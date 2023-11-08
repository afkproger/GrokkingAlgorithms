import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3, 45, 23, 12, 3, 55, 21, 24, 5, 7, 5, 34, 643, 8));
        System.out.println(DivideAndConquer.findMaxValue(list));
    }

}


class DivideAndConquer {
    public static void theTaskOfTheFarmer(int width, int height) {
        int square_face = findSquare(width, height);
        //System.out.println("Количество квадратов - " + (width * height)/(Math.pow(square_face,2)));
        List<Integer> list = new ArrayList<>(List.of(2, 4, 6));
        taskAboutSquare(list);
    }

    public static void taskAboutSquare(List<Integer> array) {
        System.out.println("Сумма списка - " + findSum(array));
    }

    private static int findSum(List<Integer> array) {
        if (array.size() == 1) {
            return array.get(0);
        }
        return array.remove(0) + findSum(array);
    }

    public static int findSquare(int width, int height) {
        // базовый случай
        if (width % height == 0) {
            return height;
        } else if (height % width == 0) {
            return width;
        }
        // рекурсивный случай (т.е уменьшаем задачу)
        if (width > height) {
            int countHeightInWidth = width / height;
            return findSquare(width - height * countHeightInWidth, height);

        } else {
            int countWidthInHeight = height / width;
            return findSquare(width, height - width * countWidthInHeight);
        }

    }

    /**
     * Вообще "Разделяй и властвуй" - не простой алгоритм, который можно применить для решения задачи.
     * Скорее, это подход к решению задачи.
     */


    public static int findCountOfElement(List<Integer> list) {
        if (list.size() == 1) {
            return 1;
        } else {
            list.remove(0);
            return 1 + findCountOfElement(list);
        }

    }

    public static int findMaxValue(List<Integer> list) {
        if (list.size() == 1) {
            return list.get(0);
        }

        int smallestIndex = findSmallestIndex(list);
        list.remove(smallestIndex);

        return findMaxValue(list);
    }

    // лучше искать через минимальный индекс
    public static int findSmallestIndex(List<Integer> list) {
        int smallest = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
            }
        }

        return list.indexOf(smallest);
    }



    public static int binarySearch(int start, int end, List<Integer> list, int elementToFind) {
        // базовый случай
        if (start == end) {
            if (list.get(start).equals(elementToFind)) {
                return start;
            } else {
                return -1;
            }
        }

        if (start < end) {
            int middle = (start + end) / 2;
            if (list.get(middle) > elementToFind) {
                return binarySearch(start, middle - 1, list, elementToFind);
            } else {
                return binarySearch(middle + 1, end, list, elementToFind);
            }
        } else {
            return -1;
        }

    }

}


class BinarySearch {
    public int search(List<Integer> list, int item) {
        int low = 0;
        int high = list.size() - 1;
        int guess = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            guess = list.get(mid);
            if (guess == item) {
                return mid;
            }
            if (guess < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

class Recursion {
    /*Любая рекурсия должна содержать две части
    1) базовый случай (функция себя не вызывает, чтобы предотвратить зацикливание)
    2) рекурсивный случай
    */
    public static void greet(String name) {
        System.out.println("Hello " + name + " !");
        greet2(name);
        System.out.println("getting ready to say bye...");
        bye();
    }

    public static void greet2(String name) {
        System.out.println("how are you, " + name + " ?");
    }

    public static void bye() {
        System.out.println("bye");
    }

    public void countdown(int number) {
        if (number == 0) {
            return;
            //базовый случай
        }
        System.out.println(number);
        countdown(number - 1); // рекурсивный случай
    }

    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
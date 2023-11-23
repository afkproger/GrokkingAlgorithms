package Graphs;

public class Main {
    public static void main(String[] args) {
        Queue_Implementation <Integer> queue = new Queue_Implementation<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        while (!queue.isEmpty()){
            queue.remove();
            System.out.println(queue);
        }

    }
}

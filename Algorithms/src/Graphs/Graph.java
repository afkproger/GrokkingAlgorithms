package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Граф состоит из нескольких узлов. А каждый узел соединяется с другими узлами.
 * Как выразить отношения типа 'вы' - > 'Боб'?
 * Для этого хорошо подходит такая структура данных как хэш - таблица;
 * Т.е мы можем задать Map с ключем - узел, а значение - список с узлами с которыми он связан
 */
public class Graph {

    // метод для заполнения данными в соответствии с заданием
    public static Map<Friend , List<Friend>> getGraphForExample (){
        Map<Friend , List<Friend>> graph = new HashMap<>();
        graph.put(new Friend("you",false),new ArrayList<Friend>(List.of(new Friend("alice", false),
                new Friend("bob",false),
                new Friend("clarie",false))));

        graph.put(new Friend("bob",false) , new ArrayList<>(List.of(new Friend("anuj", false),
                new Friend("peggy",false))));

        graph.put(new Friend("alice",false) , new ArrayList<>(List.of(new Friend("peggy", false))));

        graph.put(new Friend("clarie",false) , new ArrayList<>(List.of(new Friend("thom", false),
                new Friend("jonny",true))));


        graph.put(new Friend("anuj",false) , new ArrayList<>());
        graph.put(new Friend("peggy",false) , new ArrayList<>());
        graph.put(new Friend("thom",false) , new ArrayList<>());
        graph.put(new Friend("jonny",true) , new ArrayList<>());



        return graph;
    }



    public static void implementingBreadthFirstSearch (){

        Queue_Implementation <Friend> queue = new Queue_Implementation<>();
        Map<Friend , List<Friend>> graph = getGraphForExample();
        queue.add(graph.get(new Friend("you",false)));
        // у меня было queue.add(graph.get(you)), ХОТЯ КЛЮЧ У МЕНЯ FRIEND
        // в этом была ошибка, хорошо что сам допёр
        while (!queue.isEmpty()){
            Friend friend = queue.remove();
            if (friend.isMangoSeller()){
                System.out.println("Продавец манго - " + friend.getName());
                return;
            }

            else {
                queue.add(graph.get(friend));
            }
        }


        System.out.println("Продавец манго не найден");
    }
}

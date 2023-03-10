/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
package home4;

import java.util.LinkedList;

public class task_2LinkedList {
    public static void main(String[] args) {

        int[] arr = {1,2,6,3,7,2,8,1,9,0};
  
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (Integer i : arr) {
              list.add(i);
        }
        System.out.println("Исходная очередь: " + list);
  
        enqueue(list, -99); 
        System.out.println("Метод enqueue: " + list);
  
        System.out.println("Метод dequeue:\nПервый элемент: " + dequeue(list) + "\nОчередь: "+ list);
  
        System.out.println("Метод first:\nПервый элемент: " + first(list) + "\nОчередь: "+ list);
     }
     public static void enqueue(LinkedList<Integer> arr, int num) {
        arr.add(num);
     }
  
     public static int dequeue(LinkedList<Integer> arr) {
        int num = 0;
        num = arr.get(0);
        arr.remove(0);
        return num;
     }
  
     public static int first(LinkedList<Integer> arr) {
        int num = 0;
        num = arr.get(0);
        return num;
     } 
}

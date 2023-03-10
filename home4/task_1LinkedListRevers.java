/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */

package home4;
import java.util.LinkedList;

public class task_1LinkedListRevers {
    public static void main(String[] args) {
        int[] arr = {1,5,6,3,7,2,8,1,9,0};
        LinkedList<Integer> list = new LinkedList<Integer>();
  
        for (Integer i : arr) {
           list.add(i);
        }
        System.out.println("Исходный LinkedList = " + list);
        int i = 0;
        while (i != list.size() - 1) {
           list.add(list.size()-i, list.getFirst());
           list.removeFirst();
           i++;
        }
  
        System.out.println("Перевернутый LinkedList = " + list);
     }
}
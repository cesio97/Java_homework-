/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */

package home_5;

import java.util.HashMap;
import java.util.Map;

public class task_1 {
    public static void main(String[] args) {
        Map<String, String> bookPhone = new HashMap<>();
        bookPhone.put("Смирнов", "375293626519");
        bookPhone.put("Сидоров", "375445944228");
        bookPhone.put("Козлов", "375293416907");
        bookPhone.put("Петров", "375295678912");

        System.out.println("Справочник: \n" + bookPhone);

        add(bookPhone, ",Баранов", "375294567890");
        System.out.println("После добавления: \n" + bookPhone);

        remove(bookPhone, "Смирнов");
        System.out.println("После удаления: \n" + bookPhone);
    }

    public static void add(Map<String, String> note, String name, String num){
        note.put(name, num);
    }

    public static void remove(Map<String, String> note, String name){
        note.remove(name);
    } 
}

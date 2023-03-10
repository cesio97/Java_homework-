/*
 * Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
 *  Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
 * Отсортировать по убыванию популярности.
*/


package home_5;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class task_2 {
    public static void main(String[] args) {
        List<String> sotrudniki = List.of("Иван", "Светлана", "Кристина", "Анна", "Анна",
        "Иван", "Петр", "Павел", "Петр", "Мария",
        "Марина", "Мария", "Мария", "Марина", "Анна", "Иван", 
        "Петр", "Иван");
        System.out.println(repeat(sotrudniki));
   }

   private static Map<String, Integer> repeat(List<String> workers) {
        Map<String, Integer> nameCount = new LinkedHashMap<>();

        for (int i = 0; i < workers.size(); i++) {
             if (nameCount.containsKey(workers.get(i))) {
                  nameCount.put(workers.get(i), nameCount.get(workers.get(i)) + 1);
             } else {
                  nameCount.put(workers.get(i), 1);
             }
        }

        Map<String, Integer> sortedMap = nameCount.entrySet().stream()
                  .sorted(Comparator.comparingInt(e -> -e.getValue()))
                  .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (a, b) -> {
                                 throw new AssertionError();
                            },
                            LinkedHashMap::new));
        return sortedMap;
   }

}


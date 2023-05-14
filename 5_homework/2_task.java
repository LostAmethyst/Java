import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        Map<String, Integer> nameCountMap = new HashMap<>();

        // Подсчет количества повторений имен
        for (String employee : employees) {
            if (nameCountMap.containsKey(employee)) {
                nameCountMap.put(employee, nameCountMap.get(employee) + 1);
            } else {
                nameCountMap.put(employee, 1);
            }
        }

        // Создание списка пар (имя, количество повторений)
        List<Map.Entry<String, Integer>> nameCountList = new ArrayList<>(nameCountMap.entrySet());

        // Сортировка списка в порядке убывания количества повторений
        nameCountList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Вывод повторяющихся имен с количеством повторений
        for (Map.Entry<String, Integer> entry : nameCountList) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}

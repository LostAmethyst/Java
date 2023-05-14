import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String searchWord = "Россия";

        // Удаление пунктуации из текста
        String cleanedText = text.replaceAll("[^a-zA-Zа-яА-Я ]", "");

        // Приведение текста к нижнему регистру
        String lowerCaseText = cleanedText.toLowerCase();

        // Разделение текста на отдельные слова
        String[] words = lowerCaseText.split(" ");

        // Создание карты для подсчета количества слов
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Подсчет количества искомого слова
        for (String word : words) {
            if (word.equals(searchWord.toLowerCase())) {
                // Если слово уже присутствует в карте, увеличиваем его счетчик на 1
                if (wordCountMap.containsKey(searchWord)) {
                    int count = wordCountMap.get(searchWord);
                    wordCountMap.put(searchWord, count + 1);
                } else {
                    // Если слово встречается впервые, добавляем его в карту с начальным значением 1
                    wordCountMap.put(searchWord, 1);
                }
            }
        }

        // Вывод результатов
        if (wordCountMap.containsKey(searchWord)) {
            int count = wordCountMap.get(searchWord);
            System.out.println(searchWord + " - " + count);
        } else {
            System.out.println(searchWord + " - 0");
        }
    }
}

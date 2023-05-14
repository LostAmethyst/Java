class Solution {
    public String reverseWords(String s) {
        // Удаление начальных и конечных пробелов
        s = s.trim();
        
        // Разделение строки на слова
        String[] words = s.split("\\s+");
        
        // Обратный порядок слов
        Collections.reverse(Arrays.asList(words));
        
        // Соединение слов с пробелами
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            reversed.append(words[i]);
            if (i != words.length - 1) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
}


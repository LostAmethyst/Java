public class Main {
    public static boolean isValidSudoku(char[][] board) {
        // Проверка каждой строки
        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[9];
            for (int j = 0; j < 9; j++) {
                char currentChar = board[i][j];
                if (currentChar != '.') {
                    int digit = currentChar - '0' - 1;
                    if (rowCheck[digit]) {
                        return false; // Повторяющаяся цифра в строке
                    }
                    rowCheck[digit] = true;
                }
            }
        }

        // Проверка каждого столбца
        for (int j = 0; j < 9; j++) {
            boolean[] colCheck = new boolean[9];
            for (int i = 0; i < 9; i++) {
                char currentChar = board[i][j];
                if (currentChar != '.') {
                    int digit = currentChar - '0' - 1;
                    if (colCheck[digit]) {
                        return false; // Повторяющаяся цифра в столбце
                    }
                    colCheck[digit] = true;
                }
            }
        }

        // Проверка каждого подблока 3x3
        for (int block = 0; block < 9; block++) {
            boolean[] blockCheck = new boolean[9];
            int blockRow = block / 3;
            int blockCol = block % 3;
            for (int i = blockRow * 3; i < blockRow * 3 + 3; i++) {
                for (int j = blockCol * 3; j < blockCol * 3 + 3; j++) {
                    char currentChar = board[i][j];
                    if (currentChar != '.') {
                        int digit = currentChar - '0' - 1;
                        if (blockCheck[digit]) {
                            return false; // Повторяющаяся цифра в подблоке
                        }
                        blockCheck[digit] = true;
                    }
                }
            }
        }

        return true; // Все правила судоку выполняются
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("Validate: " + isValidSudoku(board));
    }
}

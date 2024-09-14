public class TableCalculator {
    public static void main(String[] args) {
        // Тестирование метода tables
        System.out.println(tables(5, 2)); // ➞ 1
        System.out.println(tables(31, 20)); // ➞ 0
        System.out.println(tables(123, 58)); // ➞ 4
    }

    // Метод для определения количества недостающих столов
    public static int tables(int students, int tables) {
        // Расчет количества столов, необходимых для размещения всех студентов
        int requiredTables = (students + 1) / 2; // Округляем вверх

        // Расчет количества недостающих столов
        int missingTables = requiredTables - tables;

        // Если недостающих столов нет, возвращаем 0
        return missingTables > 0 ? missingTables : 0;
    }
}

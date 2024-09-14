public class TernaryEvaluation {
    public static void main(String[] args) {
        // Тестирование метода ternaryEvaluation
        System.out.println(ternaryEvaluation(8, 4)); // ➞ 8
        System.out.println(ternaryEvaluation(1, 11)); // ➞ 11
        System.out.println(ternaryEvaluation(5, 9)); // ➞ 9
    }

    // Метод для определения большего числа с помощью тернарного оператора
    public static int ternaryEvaluation(int a, int b) {
        // Используем тернарный оператор для определения большего числа
        return a > b ? a : b;
    }
}

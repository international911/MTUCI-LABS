public class FactorialCalculator {
    public static void main(String[] args) {
        // Тестирование метода factorial
        System.out.println(factorial(3)); // ➞ 6
        System.out.println(factorial(5)); // ➞ 120
        System.out.println(factorial(7)); // ➞ 5040
    }

    // Метод для вычисления факториала числа
    public static int factorial(int n) {
        // Проверка на отрицательные числа и 0
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел.");
        }
        // Факториал 0 равен 1
        if (n == 0) {
            return 1;
        }
        // Вычисление факториала
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

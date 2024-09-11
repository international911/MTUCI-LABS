public class Primes {
    public static void main(String[] args) {
        // Перебираем числа от 2 до 100
        for (int i = 2; i <= 100; i++) {
            // Проверяем, является ли число простым
            if (isPrime(i)) {
                // Выводим простое число
                System.out.println(i);
            }
        }
    }

    // Метод для проверки, является ли число простым
    public static boolean isPrime(int n) {
        // Перебираем числа от 2 до n-1
        for (int i = 2; i < n; i++) {
            // Если n делится на i без остатка, то n не является простым числом
            if (n % i == 0) {
                return false;
            }
        }
        // Если n не делится ни на одно число от 2 до n-1, то n является простым числом
        return true;
    }
}

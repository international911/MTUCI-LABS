public class GCDCalculator {
    public static void main(String[] args) {
        // Тестирование метода gcd
        System.out.println(gcd(48, 18)); // ➞ 6
        System.out.println(gcd(52, 8)); // ➞ 4
        System.out.println(gcd(259, 28)); // ➞ 1
    }

    // Метод для нахождения наибольшего общего делителя (НОД) двух чисел
    public static int gcd(int a, int b) {
        // Используем алгоритм Евклида
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

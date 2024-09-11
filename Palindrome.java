public class Palindrome {
    public static void main(String[] args) {
        // Перебираем аргументы командной строки
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            // Проверяем, является ли строка палиндромом
            if (isPalindrome(s)) {
                // Выводим строку, если она является палиндромом
                System.out.println(s + " is a palindrome");
            } else {
                // Выводим строку, если она не является палиндромом
                System.out.println(s + " is not a palindrome");
            }
        }
    }

    // Метод для переворачивания строки
    public static String reverseString(String s) {
        // Создаем пустую строку для хранения перевернутой строки
        String reversed = "";
        // Перебираем символы входной строки в обратном порядке
        for (int i = s.length() - 1; i >= 0; i--) {
            // Добавляем символы в обратном порядке
            reversed += s.charAt(i);
        }
        // Возвращаем перевернутую строку
        return reversed;
    }

    // Метод для проверки, является ли строка палиндромом
    public static boolean isPalindrome(String s) {
        // Переворачиваем строку
        String reversed = reverseString(s);
        // Сравниваем исходную строку с перевернутой строкой
        return s.equals(reversed);
    }
}

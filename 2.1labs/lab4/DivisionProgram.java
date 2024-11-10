package lab4;

// Пользовательское исключение для обработки деления на ноль
class CustomDivisionException extends Exception {
    // Конструктор, принимающий сообщение об ошибке
    public CustomDivisionException(String message) {
        super(message);
    }
}

// Основной класс программы для деления чисел
public class DivisionProgram {
    // Точка входа в программу
    public static void main(String[] args) {
        try {
            // Вызов метода divide с аргументами 10 и 0
            double result = divide(10, 0);
            // Вывод результата деления
            System.out.println("Результат деления: " + result);
        } catch (CustomDivisionException e) {
            // Обработка пользовательского исключения и вывод сообщения об ошибке
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    // Метод для деления двух чисел, который может выбросить пользовательское исключение
    public static double divide(double numerator, double denominator) throws CustomDivisionException {
        // Проверка, является ли знаменатель равным нулю
        if (denominator == 0) {
            // Выброс пользовательского исключения с сообщением об ошибке
            throw new CustomDivisionException("Деление на ноль недопустимо.");
        }
        // Возврат результата деления
        return numerator / denominator;
    }
}

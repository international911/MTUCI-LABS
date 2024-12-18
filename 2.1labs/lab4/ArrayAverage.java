package lab4;

public class ArrayAverage {
    public static void main(String[] args) {
        // Создание и инициализация массива строк
        String[] arr = {"1", "2", "3", "4", "5"};
        // Переменная для хранения суммы чисел
        int sum = 0;
        // Переменная для подсчета количества чисел
        int count = 0;

        try {
            // Цикл для прохода по всем элементам массива
            for (int i = 0; i < arr.length; i++) {
                try {
                    // Преобразование текущего элемента массива в целое число
                    int num = Integer.parseInt(arr[i]);
                    // Добавление значения к сумме
                    sum += num;
                    // Увеличение счетчика чисел
                    count++;
                } catch (NumberFormatException e) {
                    // Обработка исключения, если элемент массива не является числом
                    System.out.println("Элемент массива на позиции " + i + " не является числом: " + arr[i]);
                }
            }

            // Проверка, что количество чисел больше нуля
            if (count > 0) {
                // Вычисление среднего арифметического значения
                double average = (double) sum / count;
                // Вывод среднего арифметического значения
                System.out.println("Среднее арифметическое: " + average);
            } else {
                // Вывод сообщения, если нет числовых элементов для вычисления среднего арифметического
                System.out.println("Нет числовых элементов для вычисления среднего арифметического.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Обработка исключения выхода за границы массива
            System.out.println("Ошибка выхода за границы массива: " + e.getMessage());
        } catch (Exception e) {
            // Обработка всех остальных исключений
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}

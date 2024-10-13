import java.util.ArrayList; // Импортируем класс ArrayList из пакета java.util
import java.util.List; // Импортируем интерфейс List из пакета java.util

public class JavaTasks {

    // Task 1: Странная пара
    public static boolean isStrangePair(String str1, String str2) {
        // Проверяем, являются ли обе строки пустыми
        if (str1.isEmpty() && str2.isEmpty()) {
            return true;
        }
        // Проверяем, совпадает ли первый символ первой строки с последним символом второй строки
        // и последний символ первой строки с первым символом второй строки
        return str1.charAt(0) == str2.charAt(str2.length() - 1) && str1.charAt(str1.length() - 1) == str2.charAt(0);
    }

    // Task 2: Скидочные цены
    public static List<Object[]> sale(List<Object[]> items, int discount) {
        // Создаем новый список для хранения товаров со скидкой
        List<Object[]> discountedItems = new ArrayList<>();
        // Проходим по каждому товару в исходном списке
        for (Object[] item : items) {
            // Получаем текущую цену товара
            int price = (int) item[1];
            // Вычисляем новую цену с учетом скидки
            int newPrice = Math.max(1, (int) (price * (1 - discount / 100.0)));
            // Добавляем товар с новой ценой в новый список
            discountedItems.add(new Object[]{item[0], newPrice});
        }
        // Возвращаем список товаров со скидкой
        return discountedItems;
    }

    // Task 3: Успешный выстрел
    public static boolean successShoot(int x, int y, int r, int m, int n) {
        // Вычисляем разницу координат между центром круга и точкой выстрела
        int dx = m - x;
        int dy = n - y;
        // Проверяем, попадает ли точка выстрела в круг с радиусом r
        return dx * dx + dy * dy <= r * r;
    }

    // Task 4: Анализ четности
    public static boolean parityAnalysis(int num) {
        // Инициализируем сумму цифр числа
        int sum = 0;
        // Создаем копию числа для вычислений
        int temp = num;
        // Пока число больше нуля
        while (temp > 0) {
            // Добавляем последнюю цифру числа к сумме
            sum += temp % 10;
            // Удаляем последнюю цифру числа
            temp /= 10;
        }
        // Проверяем, совпадает ли четность числа и суммы его цифр
        return (num % 2 == sum % 2);
    }

    // Task 5: Камень, ножницы, бумага
    public static String rps(String player1, String player2) {
        // Проверяем, совпадают ли ходы игроков
        if (player1.equals(player2)) {
            return "Tie";
        }
        // Проверяем, выиграл ли первый игрок
        if ((player1.equals("rock") && player2.equals("scissors")) ||
            (player1.equals("paper") && player2.equals("rock")) ||
            (player1.equals("scissors") && player2.equals("paper"))) {
            return "Player 1 wins";
        } else {
            // В противном случае выиграл второй игрок
            return "Player 2 wins";
        }
    }

    // Task 6: Мультипликативная постоянность
    public static int bugger(int num) {
        // Инициализируем счетчик итераций
        int count = 0;
        // Пока число больше или равно 10
        while (num >= 10) {
            // Инициализируем произведение цифр числа
            int product = 1;
            // Пока число больше нуля
            while (num > 0) {
                // Умножаем произведение на последнюю цифру числа
                product *= num % 10;
                // Удаляем последнюю цифру числа
                num /= 10;
            }
            // Обновляем число произведением цифр
            num = product;
            // Увеличиваем счетчик итераций
            count++;
        }
        // Возвращаем количество итераций
        return count;
    }

    // Task 7: Самый дорогой инвентарь
    public static String mostExpensive(List<Object[]> inventory) {
        // Инициализируем имя самого дорогого предмета
        String itemName = "";
        // Инициализируем максимальную стоимость
        int maxCost = 0;
        // Проходим по каждому предмету в инвентаре
        for (Object[] item : inventory) {
            // Вычисляем общую стоимость предмета
            int cost = (int) item[1] * (int) item[2];
            // Если общая стоимость текущего предмета больше максимальной
            if (cost > maxCost) {
                // Обновляем максимальную стоимость
                maxCost = cost;
                // Обновляем имя самого дорогого предмета
                itemName = (String) item[0];
            }
        }
        // Возвращаем строку с именем самого дорогого предмета и его стоимостью
        return "Наиб. общ. стоимость у предмета " + itemName + " - " + maxCost;
    }

    // Task 8: Самая длинная уникальная подстрока
    public static String longestUnique(String str) {
        // Инициализируем самую длинную уникальную подстроку
        String longest = "";
        // Инициализируем текущую уникальную подстроку
        String current = "";
        // Проходим по каждому символу в строке
        for (int i = 0; i < str.length(); i++) {
            // Получаем текущий символ
            char c = str.charAt(i);
            // Проверяем, содержит ли текущая подстрока этот символ
            int index = current.indexOf(c);
            // Если символ уже содержится в текущей подстроке
            if (index != -1) {
                // Обновляем текущую подстроку, удаляя часть до повторяющегося символа
                current = current.substring(index + 1);
            }
            // Добавляем текущий символ к текущей подстроке
            current += c;
            // Если текущая подстрока длиннее самой длинной уникальной подстроки
            if (current.length() > longest.length()) {
                // Обновляем самую длинную уникальную подстроку
                longest = current;
            }
        }
        // Возвращаем самую длинную уникальную подстроку
        return longest;
    }

    // Task 9: Префикс и суффикс
    public static boolean isPrefix(String word, String prefix) {
        // Проверяем, начинается ли слово с префикса (без последнего символа)
        return word.startsWith(prefix.substring(0, prefix.length() - 1));
    }

    public static boolean isSuffix(String word, String suffix) {
        // Проверяем, заканчивается ли слово суффиксом (без первого символа)
        return word.endsWith(suffix.substring(1));
    }

    // Task 10: Поместится ли кирпич
    public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
        // Находим минимальное и среднее значения размеров кирпича
        int minBrick1 = Math.min(a, Math.min(b, c));
        int minBrick2 = a + b + c - minBrick1 - Math.max(a, Math.max(b, c));
        // Проверяем, поместится ли кирпич в отверстие
        return (minBrick1 <= w && minBrick2 <= h) || (minBrick1 <= h && minBrick2 <= w);
    }

    public static void main(String[] args) {
        // Тестирование метода isStrangePair
        System.out.println(isStrangePair("ratio", "orator"));

        // Создание списка товаров для тестирования метода sale
        List<Object[]> items = new ArrayList<>();
        items.add(new Object[]{"Laptop", 124200});
        items.add(new Object[]{"Phone", 51450});
        // Тестирование метода sale
        System.out.println(sale(items, 25));

        // Тестирование метода successShoot
        System.out.println(successShoot(0, 0, 5, 2, 2));

        // Тестирование метода parityAnalysis
        System.out.println(parityAnalysis(243));

        // Тестирование метода rps
        System.out.println(rps("rock", "paper"));

        // Тестирование метода bugger
        System.out.println(bugger(39));

        // Создание списка инвентаря для тестирования метода mostExpensive
        List<Object[]> inventory = new ArrayList<>();
        inventory.add(new Object[]{"Скакалка", 550, 8});
        inventory.add(new Object[]{"Шлем", 3750, 4});
        // Тестирование метода mostExpensive
        System.out.println(mostExpensive(inventory));

        // Тестирование метода longestUnique
        System.out.println(longestUnique("abcba"));

        // Тестирование метода isPrefix
        System.out.println(isPrefix("automation", "auto-"));

        // Тестирование метода isSuffix
        System.out.println(isSuffix("arachnophobia", "-phobia"));

        // Тестирование метода doesBrickFit
        System.out.println(doesBrickFit(1, 2, 2, 1, 1));
    }
}

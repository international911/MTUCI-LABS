public class Warehouse {
    public static void main(String[] args) {
        // Тестирование метода containers
        System.out.println(containers(3, 4, 2)); // ➞ 460
        System.out.println(containers(5, 0, 2)); // ➞ 300
        System.out.println(containers(4, 1, 4)); // ➞ 530
    }

    // Метод для расчета общего количества товаров на складе
    public static int containers(int boxes, int bags, int barrels) {
        // Коэффициенты для различных типов емкостей
        final int BOX_CAPACITY = 20;
        final int BAG_CAPACITY = 50;
        final int BARREL_CAPACITY = 100;

        // Расчет общего количества товаров
        int totalItems = (boxes * BOX_CAPACITY) + (bags * BAG_CAPACITY) + (barrels * BARREL_CAPACITY);

        // Возвращаем общее количество товаров
        return totalItems;
    }
}

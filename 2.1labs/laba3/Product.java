import java.util.HashMap;

// Класс для хранения информации о товаре
public class Product {
    private final String name; // Название товара
    private final String description; // Описание товара
    private final double price; // Цена товара
    private final int quantity; // Количество товара на складе

    // Конструктор для инициализации объекта Product
    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // Метод для получения названия товара
    public String getName() {
        return name;
    }

    // Метод для получения описания товара
    public String getDescription() {
        return description;
    }

    // Метод для получения цены товара
    public double getPrice() {
        return price;
    }

    // Метод для получения количества товара на складе
    public int getQuantity() {
        return quantity;
    }

    // Метод для представления объекта в виде строки
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    // Вложенный класс для работы с хэш-таблицей товаров
    public static class ProductHashTable {
        private final HashMap<String, Product> products; // Хэш-таблица для хранения товаров

        // Конструктор для инициализации хэш-таблицы
        public ProductHashTable() {
            products = new HashMap<>();
        }

        // Метод для добавления товара в таблицу
        public void addProduct(String article, Product product) {
            products.put(article, product);
        }

        // Метод для получения товара по артикулу
        public Product getProduct(String article) {
            return products.get(article);
        }

        // Метод для удаления товара по артикулу
        public void removeProduct(String article) {
            products.remove(article);
        }

        // Основной метод для тестирования работы хэш-таблицы
        public static void main(String[] args) {
            ProductHashTable table = new ProductHashTable(); // Создаем экземпляр хэш-таблицы
            table.addProduct("A123", new Product("Laptop", "High-end laptop", 1500.0, 10)); // Добавляем товар
            table.addProduct("B456", new Product("Smartphone", "Latest model", 800.0, 20)); // Добавляем товар

            System.out.println(table.getProduct("A123")); // Получаем и выводим информацию о товаре
            System.out.println(table.getProduct("B456")); // Получаем и выводим информацию о товаре

            table.removeProduct("A123"); // Удаляем товар
            System.out.println(table.getProduct("A123")); // Проверяем, что товар удален
        }
    }
}

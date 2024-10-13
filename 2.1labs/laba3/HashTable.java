import java.util.LinkedList;

public class HashTable<K, V> {
    // Начальная емкость хэш-таблицы
    private static final int INITIAL_CAPACITY = 16;

    // Массив связанных списков для хранения пар "ключ-значение"
    private final LinkedList<Entry<K, V>>[] table;

    // Количество элементов в таблице
    private int size;

    // Конструктор, инициализирующий таблицу
    @SuppressWarnings("unchecked")
    public HashTable() {
        table = new LinkedList[INITIAL_CAPACITY];
        size = 0;
    }

    // Хэш-функция для преобразования ключа в индекс массива
    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    // Метод для добавления пары "ключ-значение" в таблицу
    public void put(K key, V value) {
        int index = hash(key); // Получаем индекс для ключа
        if (table[index] == null) { // Если список для этого индекса еще не создан
            table[index] = new LinkedList<>(); // Создаем новый список
        }
        for (Entry<K, V> entry : table[index]) { // Проверяем, есть ли уже такой ключ
            if (entry.getKey().equals(key)) { // Если ключ найден
                entry.setValue(value); // Обновляем значение
                return;
            }
        }
        table[index].add(new Entry<>(key, value)); // Добавляем новую пару в список
        size++; // Увеличиваем размер таблицы
    }

    // Метод для получения значения по ключу
    public V get(K key) {
        int index = hash(key); // Получаем индекс для ключа
        if (table[index] != null) { // Если список для этого индекса существует
            for (Entry<K, V> entry : table[index]) { // Проверяем все элементы списка
                if (entry.getKey().equals(key)) { // Если ключ найден
                    return entry.getValue(); // Возвращаем значение
                }
            }
        }
        return null; // Если ключ не найден, возвращаем null
    }

    // Метод для удаления пары "ключ-значение" из таблицы
    public void remove(K key) {
        int index = hash(key); // Получаем индекс для ключа
        if (table[index] != null) { // Если список для этого индекса существует
            for (Entry<K, V> entry : table[index]) { // Проверяем все элементы списка
                if (entry.getKey().equals(key)) { // Если ключ найден
                    table[index].remove(entry); // Удаляем пару из списка
                    size--; // Уменьшаем размер таблицы
                    return;
                }
            }
        }
    }

    // Метод для получения количества элементов в таблице
    public int size() {
        return size;
    }

    // Метод для проверки, пуста ли таблица
    public boolean isEmpty() {
        return size == 0;
    }

    // Внутренний класс для хранения пар "ключ-значение"
    private static class Entry<K, V> {
        private final K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}

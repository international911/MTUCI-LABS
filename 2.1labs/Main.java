public class Main {
    // Абстрактный класс, представляющий бытовую технику
    public static abstract class Appliance {
        private String brand; // Бренд
        private String model; // Модель
        private double price; // Цена

        private static int applianceCount = 0; // Статическая переменная для подсчета созданных объектов

        // Конструктор с параметрами
        public Appliance(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
            applianceCount++; // Увеличиваем счетчик созданных объектов
        }

        // Конструктор по умолчанию
        public Appliance() {
            this("Unknown", "Unknown", 0.0);
        }

        // Геттер для бренда
        public String getBrand() {
            return brand;
        }

        // Сеттер для бренда
        public void setBrand(String brand) {
            this.brand = brand;
        }

        // Геттер для модели
        public String getModel() {
            return model;
        }

        // Сеттер для модели
        public void setModel(String model) {
            this.model = model;
        }

        // Геттер для цены
        public double getPrice() {
            return price;
        }

        // Сеттер для цены
        public void setPrice(double price) {
            this.price = price;
        }

        // Геттер для статической переменной applianceCount
        public static int getApplianceCount() {
            return applianceCount;
        }

        // Абстрактный метод для отображения информации о бытовой технике
        public abstract void displayInfo();

        // Метод для включения бытовой техники
        public void turnOn() {
            System.out.println(brand + " " + model + " is turned on.");
        }

        // Метод для выключения бытовой техники
        public void turnOff() {
            System.out.println(brand + " " + model + " is turned off.");
        }
    }

    // Класс, представляющий холодильник
    public static class Refrigerator extends Appliance {
        private double capacity; // Объем
        private boolean hasFreezer; // Наличие морозильной камеры

        // Конструктор с параметрами
        public Refrigerator(String brand, String model, double price, double capacity, boolean hasFreezer) {
            super(brand, model, price);
            this.capacity = capacity;
            this.hasFreezer = hasFreezer;
        }

        // Конструктор по умолчанию
        public Refrigerator() {
            super();
            this.capacity = 0.0;
            this.hasFreezer = false;
        }

        // Геттер для объема
        public double getCapacity() {
            return capacity;
        }

        // Сеттер для объема
        public void setCapacity(double capacity) {
            this.capacity = capacity;
        }

        // Геттер для наличия морозильной камеры
        public boolean isHasFreezer() {
            return hasFreezer;
        }

        // Сеттер для наличия морозильной камеры
        public void setHasFreezer(boolean hasFreezer) {
            this.hasFreezer = hasFreezer;
        }

        // Переопределенный метод для отображения информации о холодильнике
        @Override
        public void displayInfo() {
            System.out.println("Refrigerator: " + getBrand() + " " + getModel() + ", Price: " + getPrice() +
                    ", Capacity: " + capacity + " liters, Has Freezer: " + hasFreezer);
        }
    }

    // Класс, представляющий посудомоечную машину
    public static class Dishwasher extends Appliance {
        private int numberOfPrograms; // Количество программ
        private boolean hasDryer; // Наличие сушки

        // Конструктор с параметрами
        public Dishwasher(String brand, String model, double price, int numberOfPrograms, boolean hasDryer) {
            super(brand, model, price);
            this.numberOfPrograms = numberOfPrograms;
            this.hasDryer = hasDryer;
        }

        // Конструктор по умолчанию
        public Dishwasher() {
            super();
            this.numberOfPrograms = 0;
            this.hasDryer = false;
        }

        // Геттер для количества программ
        public int getNumberOfPrograms() {
            return numberOfPrograms;
        }

        // Сеттер для количества программ
        public void setNumberOfPrograms(int numberOfPrograms) {
            this.numberOfPrograms = numberOfPrograms;
        }

        // Геттер для наличия сушки
        public boolean isHasDryer() {
            return hasDryer;
        }

        // Сеттер для наличия сушки
        public void setHasDryer(boolean hasDryer) {
            this.hasDryer = hasDryer;
        }

        // Переопределенный метод для отображения информации о посудомоечной машине
        @Override
        public void displayInfo() {
            System.out.println("Dishwasher: " + getBrand() + " " + getModel() + ", Price: " + getPrice() +
                    ", Number of Programs: " + numberOfPrograms + ", Has Dryer: " + hasDryer);
        }
    }

    // Класс, представляющий пылесос
    public static class VacuumCleaner extends Appliance {
        private double power; // Мощность
        private String type; // Тип

        // Конструктор с параметрами
        public VacuumCleaner(String brand, String model, double price, double power, String type) {
            super(brand, model, price);
            this.power = power;
            this.type = type;
        }

        // Конструктор по умолчанию
        public VacuumCleaner() {
            super();
            this.power = 0.0;
            this.type = "Unknown";
        }

        // Геттер для мощности
        public double getPower() {
            return power;
        }

        // Сеттер для мощности
        public void setPower(double power) {
            this.power = power;
        }

        // Геттер для типа
        public String getType() {
            return type;
        }

        // Сеттер для типа
        public void setType(String type) {
            this.type = type;
        }

        // Переопределенный метод для отображения информации о пылесосе
        @Override
        public void displayInfo() {
            System.out.println("Vacuum Cleaner: " + getBrand() + " " + getModel() + ", Price: " + getPrice() +
                    ", Power: " + power + " W, Type: " + type);
        }
    }

    // Основной метод для демонстрации работы иерархии классов
    public static void main(String[] args) {
        // Создание объектов холодильника, посудомоечной машины и пылесоса
        Refrigerator refrigerator = new Refrigerator("Samsung", "RF23M8090SG", 1500.0, 600.0, true);
        Dishwasher dishwasher = new Dishwasher("Bosch", "SMS67MW00I", 800.0, 5, true);
        VacuumCleaner vacuumCleaner = new VacuumCleaner("Dyson", "V11", 500.0, 120.0, "Cordless");

        // Отображение информации о созданных объектах
        refrigerator.displayInfo();
        dishwasher.displayInfo();
        vacuumCleaner.displayInfo();

        // Включение и выключение бытовой техники
        refrigerator.turnOn();
        dishwasher.turnOff();

        // Отображение общего количества созданных объектов
        System.out.println("Total appliances created: " + Appliance.getApplianceCount());
    }
}

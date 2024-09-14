public class FabricCalculator {
    public static void main(String[] args) {
        // Тестирование метода howManyItems
        System.out.println(howManyItems(22, 1.4, 2)); // ➞ 3
        System.out.println(howManyItems(45, 1.8, 1.9)); // ➞ 6
        System.out.println(howManyItems(100, 2, 2)); // ➞ 12
    }

    // Метод для расчета количества пододеяльников
    public static int howManyItems(double fabricLength, double width, double height) {
        // Расчет общей площади ткани
        double totalFabricArea = fabricLength * 2;

        // Расчет площади одной детали
        double itemArea = width * height;

        // Расчет количества пододеяльников
        int numberOfItems = (int) (totalFabricArea / itemArea);

        // Возвращаем количество пододеяльников
        return numberOfItems;
    }
}

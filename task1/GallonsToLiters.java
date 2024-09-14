public class GallonsToLiters {
    public static void main(String[] args) {
        // Тестирование метода convert
        System.out.println(convert(5)); // ➞ 18.925
        System.out.println(convert(3)); // ➞ 11.355
        System.out.println(convert(8)); // ➞ 30.28
    }

    // Метод для преобразования галлонов в литры
    public static double convert(int gallons) {
        // Коэффициент преобразования галлонов в литры
        final double GALLON_TO_LITER = 3.78541;
        // Преобразование галлонов в литры
        return gallons * GALLON_TO_LITER;
    }
}

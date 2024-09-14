public class FitnessCalculator {
    public static void main(String[] args) {
        // Тестирование метода fitCalc
        System.out.println(fitCalc(15, 1)); // ➞ 15
        System.out.println(fitCalc(24, 2)); // ➞ 48
        System.out.println(fitCalc(41, 3)); // ➞ 123
    }

    // Метод для расчета сожженных калорий
    public static int fitCalc(int minutes, int intensity) {
        // Коэффициенты для различных уровней интенсивности
        final int LOW_INTENSITY = 1;
        final int MEDIUM_INTENSITY = 2;
        final int HIGH_INTENSITY = 3;

        // Расчет сожженных калорий
        int caloriesBurned = minutes * intensity;

        // Возвращаем количество сожженных калорий
        return caloriesBurned;
    }
}
public class TriangleType {
    public static void main(String[] args) {
        // Тестирование метода triangleType
        System.out.println(triangleType(5, 5, 5)); // ➞ equilateral
        System.out.println(triangleType(5, 4, 5)); // ➞ isosceles
        System.out.println(triangleType(3, 4, 5)); // ➞ different-sided
        System.out.println(triangleType(5, 1, 1)); // ➞ not a triangle
    }

    // Метод для определения типа треугольника
    public static String triangleType(int x, int y, int z) {
        // Проверка, является ли треугольник равносторонним
        if (x == y && y == z) {
            return "equilateral";
        }
        // Проверка, является ли треугольник равнобедренным
        else if (x == y || y == z || x == z) {
            return "isosceles";
        }
        // Проверка, является ли треугольник разносторонним
        else if (x + y > z && y + z > x && x + z > y) {
            return "different-sided";
        }
        // Если невозможно построить треугольник с заданными сторонами
        else {
            return "not a triangle";
        }
    }
}

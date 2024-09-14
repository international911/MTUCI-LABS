public class TicketSaler {
    public static void main(String[] args) {
        // Тестирование метода ticketSaler
        System.out.println(ticketSaler(70, 1500)); // ➞ 75600
        System.out.println(ticketSaler(24, 950)); // ➞ 16416
        System.out.println(ticketSaler(53, 1250)); // ➞ 47700
    }

    // Метод для расчета общей выручки от продажи билетов
    public static int ticketSaler(int tickets, int pricePerTicket) {
        // Фиксированная комиссия
        final double COMMISSION = 0.04; // 4% комиссия

        // Расчет общей выручки
        double totalRevenue = tickets * pricePerTicket;

        // Учет комиссии
        totalRevenue -= totalRevenue * COMMISSION;

        // Возвращаем общую выручку в виде целого числа
        return (int) totalRevenue;
    }
}

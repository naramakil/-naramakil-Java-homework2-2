public class Main {
    public static void main(String[] args) {
        int current_balance = 100; // Объявляем переменную и текущий баланс счета
        int rub_per_bonus = 100; // Объявляем переменную и количество рублей за бонус
        int paid_amount = 1100; // Объявляем переменную и указазываем сумму пополнения
        int bonus; // Объявляем переменную начисляемых бонусов
        int total_balance; // Объявляем переменную общего баланса
        if (paid_amount > 1000) {
            bonus = paid_amount / rub_per_bonus;
            total_balance = current_balance + paid_amount + bonus;
        } else {
            bonus = 0;
            total_balance = current_balance + paid_amount;
        }
        System.out.println("Бонусные баллы: " + bonus); // Выводим баланс бонусов
        System.out.println("Баланс счета: " + total_balance); // Выводим общий баланс
    }
}
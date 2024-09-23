public class Main {
    public static void main(String[] args) {
        int currentBalance = 100; // Объявляем переменную и текущий баланс счета
        int rubPerBonus = 100; // Объявляем переменную и количество рублей за бонус
        int paidAmount = 1100; // Объявляем переменную и указазываем сумму пополнения
        int bonus; // Объявляем переменную начисляемых бонусов
        int totalBalance; // Объявляем переменную общего баланса
        if (paidAmount > 1000) {
            bonus = paidAmount / rubPerBonus;
            totalBalance = currentBalance + paidAmount + bonus;
        } else {
            bonus = 0;
            totalBalance = currentBalance + paidAmount;
        }
        System.out.println("Бонусные баллы: " + bonus); // Выводим баланс бонусов
        System.out.println("Баланс счета: " + totalBalance); // Выводим общий баланс
    }
}
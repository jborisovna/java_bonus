public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int topUp = 1100;

        int bonus;
        if(topUp > 1000) {
            bonus = topUp / 100 * 1;
        } else {
            bonus = 0;
        }
        int amount = balance + topUp + bonus;

        System.out.println("Итого на счёте: " + amount);
        System.out.println("Начислено бонусных рублей: " + bonus);
    }
}
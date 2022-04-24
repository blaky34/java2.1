public class Main {
    public static void main(String[] args) {
        int initialAccount = 400;
        int amount = 100;
        int rubles = 100;
        int result = initialAccount + amount;
        int bonusRub = 1;
        boolean bonus = initialAccount > 1000;
        int totalBonus;
        if (bonus) {
            totalBonus = initialAccount * bonusRub / rubles;
        } else {
            totalBonus = 0;
        }
        System.out.println((totalBonus) + " Бонусные рубли");
        System.out.println((result) + " Сумма на счете");

    }
}
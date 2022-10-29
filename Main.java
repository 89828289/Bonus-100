public class Main {
    public static void main(String[] args) {
        int initialAmount = 200;
        int depositAmount = 1700;

        if (depositAmount > 1000) {
            int bonus = depositAmount / 100;
            int totalAmount = bonus + depositAmount + initialAmount;

            System.out.println("Итоговый счет:" + totalAmount);
            System.out.println("Бонусные рубли" + bonus);

        } else {
            int totalAmount = depositAmount + initialAmount;

            System.out.println("Итоговый счет:" + totalAmount);
            System.out.println("Бонусные рубли" + 0);
        }

    }
}
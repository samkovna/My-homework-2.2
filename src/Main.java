public class Main {
    public static void main(String[] args) {
        int initialBalance = 125;
        int replenishment = 1277;

        int bonus = (replenishment >= 1000) ? replenishment / 100 : 0;

        int finalBalance = initialBalance + replenishment + bonus;

        System.out.println("Количество бонусных рублей: " + bonus);
        System.out.println("Итоговая сумма на счету: " + finalBalance + " рублей");
    }
}

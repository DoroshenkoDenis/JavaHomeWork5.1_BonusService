public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        //  данные:
        long amount = 5000_55;
        boolean registered = false;

        // вызываем целевой метод:
        long bonus = service.calculate(amount, registered);

        // выводим результат
        System.out.println(bonus);
    }
}


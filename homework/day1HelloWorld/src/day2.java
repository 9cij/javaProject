public class day2 {
    public static void main(String[] args) {
        int money = 10000;
        double lv = 0.0315;
        double sum = 0;

        sum = money + money * lv / 365 * 35;
        System.out.println("" + sum);

    }
}

package package1;

public class Bank {
    public static int calculateProfit(double amount, double percent, int period) {
        double result = amount;
        for (int i = 0; i < period; i++) {
            result = result + result  * percent;
        }
        return (int) (result - amount);
    }
}

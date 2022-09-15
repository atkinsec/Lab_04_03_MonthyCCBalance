public class Main {
    public static void main(String[] args)
    {
        double interestRate = 0.17;
        double balance = 5000;
        double oneMonth;
        double twoMonths;

        oneMonth = balance * interestRate;
        twoMonths = (balance + oneMonth) * interestRate;

        System.out.println("your interest after one month is " + oneMonth + " and your interest after two months is " + twoMonths);
    }
}
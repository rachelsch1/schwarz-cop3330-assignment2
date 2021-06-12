package assignment2.ex26.base;

/* n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.
 */

public class PaymentCalculator {
    public static int calculateMonthsUntilPaidOff(double balance, double apr, double monthly) {
        double rate = apr / 365;

        double months = -(.0333333) * Math.log(1 + (balance / monthly) * (1 - Math.pow((1 + rate), 30))) / Math.log(1 + rate);
        months = Math.ceil(months);

        return (int) months;
    }
}

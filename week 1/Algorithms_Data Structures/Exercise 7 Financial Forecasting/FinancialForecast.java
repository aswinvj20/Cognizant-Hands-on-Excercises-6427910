public class FinancialForecast {
    public static double futureValueRecursive(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return futureValueRecursive(principal, rate, years - 1) * (1 + rate);  // Recursive step
    }
    public static double futureValueIterative(double principal, double rate, int years) {
        double result = principal;
        for (int i = 0; i < years; i++) {
            result *= (1 + rate);
        }
        return result;
    }
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 0.05;      
        int years = 10;
        double futureRecursive = futureValueRecursive(principal, rate, years);
        double futureIterative = futureValueIterative(principal, rate, years);
        System.out.printf("Future Value (Recursive) after %d years: %.2f\n", years, futureRecursive);
        System.out.printf("Future Value (Iterative) after %d years: %.2f\n", years, futureIterative);
    }
}

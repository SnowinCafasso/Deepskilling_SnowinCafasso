package Deepskilling_SnowinCafasso.Week1.FinancialForecasting;

public class FinancialForecast {

    public static double forecast(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return forecast(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialValue = 10000;
        double growthRate = 0.07;
        int years = 5;

        double futureValue = forecast(initialValue, growthRate, years);
        System.out.printf("Projected value after %d years: %.2f%n", years, futureValue);
    }
}

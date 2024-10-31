package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    
    public static double convertToReais(double dollarAmount, double exchangeRate) {
        return dollarAmount * exchangeRate * (1.0 + IOF);
    }
}

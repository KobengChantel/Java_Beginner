package Book3.chapter3;
//You can access static methods and fields from an instance method,

public class Invoice {
    private static double taxRate = 0.75;
    private double salesTotal;
    public double getTax()
    {
        return salesTotal * taxRate;
    }
}

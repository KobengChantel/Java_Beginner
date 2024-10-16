package Book4.chapter2;

import java.text.NumberFormat;

public class TwoDimensional {
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();

        // Sample sales data for 5 years and 4 regions
        double[][] sales = {
                {15000.50, 20000.75, 25000.30, 30000.90}, // 2004
                {16000.60, 21000.85, 26000.40, 31000.95}, // 2005
                {17000.70, 22000.95, 27000.50, 32001.00}, // 2006
                {18000.80, 23001.05, 28000.60, 33001.10}, // 2007
                {19000.90, 24001.15, 29000.70, 34001.20}  // 2008
        };

        System.out.println("\tNorth\t\tSouth\t\tEast\t\tWest");
        int year = 2004;

        for (int y = 0; y < sales.length; y++) {
            System.out.print(year + "\t");
            for (int region = 0; region < sales[y].length; region++) {
                System.out.print(cf.format(sales[y][region]));
                System.out.print("\t");
            }
            year++; // Increment the year for the next row
            System.out.println(); // Move to the next line after printing sales for the year
        }

        System.out.println("\nSales by Region:");
        for (int region = 0; region < sales[0].length; region++) {
            System.out.print("Region " + (region + 1) + ": ");
            for (int y = 0; y < sales.length; y++) {
                System.out.print(cf.format(sales[y][region]) + " ");
            }
            System.out.println(); // Move to the next line after printing sales for the region
        }
    }
}

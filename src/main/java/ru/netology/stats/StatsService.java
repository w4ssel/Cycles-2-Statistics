package ru.netology.stats;

public class StatsService {

    public int totalSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double averageSales(long[] sales) {
        double sum = totalSales(sales);
        double average = sum / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsBelowAverageSales(long[] sales) {
        double average = averageSales(sales);
        int months = 0;
        for (long sale : sales) {
            if (sale < average) {
                months++;
            }
        }
        return months;
    }

    public int monthsAboveAverageSales(long[] sales) {
        double average = averageSales(sales);
        int months = 0;
        for (long sale : sales) {
            if (sale > average) {
                months++;
            }
        }
        return months;
    }
}

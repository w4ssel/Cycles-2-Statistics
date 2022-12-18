package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.totalSales(sales));
        System.out.printf("%.1f", service.averageSales(sales));
        System.out.println(service.maxSales(sales));
        System.out.println(service.minSales(sales));
        System.out.println(service.monthsBelowAverageSales(sales));
        System.out.println(service.monthsAboveAverageSales(sales));

    }
}
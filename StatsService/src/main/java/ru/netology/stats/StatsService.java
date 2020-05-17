package ru.netology.stats;

public class StatsService {

    public long getAmount(long[] sales) {
        long sum = 0;
        for (long amount : sales) {
            sum += amount;
        }
        return sum;
    }

    public long getAverageAmount(long[] sales) {
        long sum = getAmount(sales);
        sum = sum / sales.length;
        return sum;
    }

    public long getMaxAmount(long[] sales) {
        long sum = sales[0];;
        long maxMonth = 1;
        for (int i = 0; i < sales.length; i++ ) {
            if (sum <= sales[i]) {
                sum = sales[i];
                maxMonth = i + 1;
            }
        }
        return maxMonth;
    }

    public long getMinAmount(long[] sales) {
        long sum = sales[0];;
        long minMonth = 1;
        for (int i = 0; i < sales.length; i++ ) {
            if (sum >= sales[i]) {
                sum = sales[i];
                minMonth = i + 1;
            }
        }
        return minMonth;
    }

    public long getBelowAverage(long[] sales) {
        long average = getAverageAmount(sales);
        long belowAverage = 0;
        for (long sum : sales) {
            if (sum < average) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public long getAboveAverage(long[] sales) {
        long average = getAverageAmount(sales);
        long aboveAverage = 0;
        for (long sum : sales) {
            if (sum > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }

}

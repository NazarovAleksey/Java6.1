package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    StatsService statistics = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldGetAmount() {
        long expected = 180;
        long actual = statistics.getAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetAverageAmount() {
        long expected = 15;
        long actual = statistics.getAverageAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetMaxAmount() {
        long expected = 8;
        long actual = statistics.getMaxAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetMinAmount() {
        long expected = 9;
        long actual = statistics.getMinAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetBelowAverage() {
        long expected = 5;
        long actual = statistics.getBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetAboveAverage() {
        long expected = 5;
        long actual = statistics.getAboveAverage(sales);
        assertEquals(expected, actual);
    }

}
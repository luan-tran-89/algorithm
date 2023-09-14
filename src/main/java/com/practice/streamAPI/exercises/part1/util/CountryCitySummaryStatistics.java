package com.practice.streamAPI.exercises.part1.util;

import com.practice.streamAPI.exercises.part1.domain.City;
import com.practice.streamAPI.exercises.part1.domain.Country;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author gasieugru
 */
public class CountryCitySummaryStatistics implements Consumer<Country> {
    private City min;
    private City max;
    private long count;

    public CountryCitySummaryStatistics() {
    }

    @Override
    public void accept(Country country) {
        Supplier<CitySummaryStatistics> citySummaryStatisticsSupplier=
                () -> new CitySummaryStatistics((l,r)-> Long.compare(l.getPopulation(),r.getPopulation()));
        var css= country.getCities()
                .stream()
                .collect(citySummaryStatisticsSupplier,CitySummaryStatistics::accept,CitySummaryStatistics::combine);
        min= css.getMin();
        max= css.getMax();
        count= css.getCount();
    }

    public void combine(CountryCitySummaryStatistics other) {
    }

    public City getMin() {
        return min;
    }

    public void setMin(City min) {
        this.min = min;
    }

    public City getMax() {
        return max;
    }

    public void setMax(City max) {
        this.max = max;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "CountryCitySummaryStatistics{" +
                "min=" + getMin() +
                ", max=" + getMax() +
                ", count=" + getCount() +
                '}';
    }
}

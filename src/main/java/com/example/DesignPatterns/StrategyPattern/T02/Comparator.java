package com.example.DesignPatterns.StrategyPattern.T02;

/**
 * @author nameM
 */
@FunctionalInterface
public interface Comparator<T> {

    int compare(T o1, T o2);

    default void m() {
        System.out.println("m");
    }
}

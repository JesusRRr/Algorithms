package com.rolon.algorithm.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class QuickSearchTest {
    QuickSearch quickSearch;

    static Stream<Arguments> trueArguments() {
        return Stream.of(
                Arguments.of(new int[]{0}, 0),
                Arguments.of(new int[]{1, 2, 3}, 1),
                Arguments.of(new int[]{10, 21, 31, 47, 55,62}, 55)
        );
    }
    static Stream<Arguments> falseArguments() {
        return Stream.of(
                Arguments.of(new int[]{0}, 1),
                Arguments.of(new int[]{1, 2, 3}, 4),
                Arguments.of(new int[]{10, 21, 31, 47, 55,62}, 51)
        );
    }
    @ParameterizedTest
    @MethodSource("trueArguments")
    public void checkTrueSearch(int[] elements,int value){
        Assertions.assertEquals(true,quickSearch.search(elements,value));

    }
    @ParameterizedTest
    @MethodSource("falseArguments")
    public void checkFalseSearch(int[] elements,int value){
        Assertions.assertEquals(false,quickSearch.search(elements,value));

    }
}

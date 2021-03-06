package com.rolon.algorithm.search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class QuickSearchTest {

    static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 1)
        );
    }
    @ParameterizedTest
    @MethodSource("arguments")
    public void checkSearch(int[] elements,int value){

    }
}

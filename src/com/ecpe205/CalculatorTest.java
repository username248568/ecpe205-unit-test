package com.ecpe205;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {
    Calculator calc;

    @BeforeAll
    void setup(){
        calc = new Calculator();
    }

    //CREATE A TEST TO TEST isEven


    @ParameterizedTest
    @MethodSource("PowerInputValues")
    void shouldPowerTwoInputValues(int a, int b) {
        assertEquals(Math.pow(a,b), calc.power(a, b));
    }

    static Stream<Arguments> PowerInputValues () {
        return Stream.of(
                Arguments.of(2,2),
                Arguments.of(4,6),
                Arguments.of(2,7),
                Arguments.of(3,7),
                Arguments.of(3,0)
        );
    }

    @ParameterizedTest
    @MethodSource("FactorialInputValues")
    void shouldFactorialValueWithOne( int a,int b ) {
        assertEquals(a, calc.factorial(b));
    }

    static Stream<Arguments> FactorialInputValues () {
        return Stream.of(
                Arguments.of(1,0),
                Arguments.of(2,2),
                Arguments.of(6,3),
                Arguments.of(-24,-4),
                Arguments.of(-120,-5)
        );
    }

    @ParameterizedTest
    @MethodSource("PalindromeInputValues")
    void shouldPalindromeValueWithOne(Boolean a, String word ) {
        assertEquals(a, calc.Palindrome(word));
    }

    static Stream<Arguments> PalindromeInputValues () {
        return Stream.of(
                Arguments.of(true,"racecar"),
                Arguments.of(true,"bib"),
                Arguments.of(false,"maid"),
                Arguments.of(false,"four"),
                Arguments.of(true,"madam")
        );
    }

    @ParameterizedTest
    @MethodSource("ArrayInputValues")
    void shouldPalindromeValueWithOne(int[] a, int[] b) {
        assertArrayEquals(a, calc.Sort(b));
    }

    static Stream<Arguments> ArrayInputValues () {
        return Stream.of(
                Arguments.of(new int[]{1,1,2,3,4}, new int[]{1,2,3,4,1}),
                Arguments.of(new int[]{1,1,4,5,7},new int[]{7,1,5,4,1}),
                Arguments.of(new int[]{2,3,4,7,8},new int[]{7,2,8,3,4}),
                Arguments.of(new int[]{4,9,13,22,35},new int[]{35,9,13,22,4}),
                Arguments.of(new int[]{-20,-6,2,4,7},new int[]{7,2,-20,4,-6})
        );
    }
}
package com.techyourchance.unittestingfundamentals.exercise1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import com.techyourchance.unittestingfundamentals.example1.PositiveNumberValidator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NegativeNumberValidatorTest {

    NegativeNumberValidator SUT;

    @Before
    public void setup() {
        SUT = new NegativeNumberValidator();
    }

    @Test
    public void negativeNumberTest() {
        boolean result = SUT.isNegative(-1);
        assertThat(result, is(true));
    }

    @Test
    public void zeroNumberTest() {
        boolean result = SUT.isNegative(0);
        assertThat(result, is(false));
    }

    @Test
    public void positiveNumberTest() {
        boolean result = SUT.isNegative(1);
        assertThat(result, is(false));
    }

}
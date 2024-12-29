package com.techyourchance.unittestingfundamentals.exercise2;

import static org.hamcrest.CoreMatchers.is;

import com.techyourchance.unittestingfundamentals.example1.PositiveNumberValidator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringDuplicatorTest {

    StringDuplicator SUT;

    @Before
    public void setup() {
        SUT = new StringDuplicator();
    }

    @Test
    public void duplicate_emptyString_returnEmptyString() {
        String result = SUT.duplicate("");
        Assert.assertThat(result, is(""));
    }

    @Test
    public void duplicate_oneWord_returnWordDuplicated() {
        String result = SUT.duplicate("apples");
        Assert.assertThat(result, is("applesapples"));
    }

    @Test
    public void duplicate_oneWord_returnMultipleWordsDuplicated() {
        String result = SUT.duplicate("multiple apples");
        Assert.assertThat(result, is("multiple applesmultiple apples"));
    }

}
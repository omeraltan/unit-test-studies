package com.omer.junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringHelperParametersAndParameterizedTest {

    StringHelper helper = new StringHelper();

    @Parameterized.Parameter(value = 0)
    public String input;
    @Parameterized.Parameter(value = 1)
    public String expectedOutput;

    @Parameterized.Parameters
    public static Collection<String[]> testConditions() {
        String expectedOutputs[][] = {{"AACD", "CD"}, {"ACD","CD"}, {"AABB", "BB"}, {"AAC", "C"}};
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }

}

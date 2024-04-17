package com.test.mockito.examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    AssertTest.class,
    ParametreTest.class,
    YasamDongusuTest.class,
    HesapMakinesiTest.class
})
public class SuiteTest {
}

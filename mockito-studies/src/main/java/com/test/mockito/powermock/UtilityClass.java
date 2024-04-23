package com.test.mockito.powermock;

public class UtilityClass {
    // some complex logic is done here...
    static int staticMethod(long value){
        throw new RuntimeException("I don't want to be executed. I will anyway be mocked out.");
    }
}

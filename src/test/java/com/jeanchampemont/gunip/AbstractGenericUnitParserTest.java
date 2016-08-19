package com.jeanchampemont.gunip;

import org.junit.Assert;

public abstract class AbstractGenericUnitParserTest {

    protected GenericUnitParser sut;

    public AbstractGenericUnitParserTest() {
        super();
    }

    protected void runTestCase(String input, double expectedTimeInS) throws GenericUnitParserException {
        double parsedResult = 0;
        parsedResult = sut.parse(input);
        Assert.assertEquals(expectedTimeInS, parsedResult, 0);
    }

}
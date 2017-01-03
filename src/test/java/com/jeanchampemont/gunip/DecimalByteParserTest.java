/*
 * Copyright (C) 2016 Gunip
 *
 * This file is part of the Gunip project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jeanchampemont.gunip;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class DecimalByteParserTest extends AbstractGenericUnitParserTest {

    private static final long KB = 1000;
    private static final long MB = 1000 * KB;
    private static final long GB = 1000 * MB;
    private static final long TB = 1000 * GB;
    private static final long PB = 1000 * TB;
    private static final long EB = 1000 * PB;
    private static final long ZB = 1000 * EB;
    private static final long YB = 1000 * ZB;

    @Before
    public void init() {
        sut = new DecimalByteParser();
    }

    @Test
    public void parsingTest() throws GenericUnitParserException {
        runTestCase("2 MB 20 kilobyte", 2 * MB + 20 * KB);
        runTestCase("2mb20kb", 2 * MB + 20 * KB);
        runTestCase("6 gb 1 kb", 6 * GB + KB);
    }

    @Test
    public void parsingInvalidStrings() throws GenericUnitParserException {
        runTestCase("2 sausages 20 kb", 20 * KB);
        runTestCase("2minths5dhs", 0);
        runTestCase("15 dayz", 0);
        runTestCase("", 0);
    }
}

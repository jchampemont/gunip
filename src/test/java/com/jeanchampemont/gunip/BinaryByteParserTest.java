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
public class BinaryByteParserTest extends AbstractGenericUnitParserTest {

    private static final long KIB = 1024;
    private static final long MIB = 1024 * KIB;
    private static final long GIB = 1024 * MIB;
    private static final long TIB = 1024 * GIB;
    private static final long PIB = 1024 * TIB;
    private static final long EIB = 1024 * PIB;
    private static final long ZIB = 1024 * EIB;
    private static final long YIB = 1024 * ZIB;

    @Before
    public void init() {
        sut = new BinaryByteParser();
    }

    @Test
    public void parsingTest() throws GenericUnitParserException {
        runTestCase("2 MiB 20 kibibyte", 2 * MIB + 20 * KIB);
        runTestCase("2mib20kib", 2 * MIB + 20 * KIB);
        runTestCase("6 gib 1 kib", 6 * GIB + KIB);
    }

    @Test
    public void parsingInvalidStrings() throws GenericUnitParserException {
        runTestCase("2 sausages 20 kib", 20 * KIB);
        runTestCase("2minths5dhs", 0);
        runTestCase("15 dayz", 0);
        runTestCase("", 0);
    }
}

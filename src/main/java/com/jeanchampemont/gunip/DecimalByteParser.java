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

import static java.lang.Math.pow;

/**
 * A DecimalByteParser is a {@link GenericUnitParser} for decimal units of information, from bytes
 * to yottabyte.
 *
 */
public class DecimalByteParser extends GenericUnitParser {

    public DecimalByteParser() {
        super(UnitsBuilder.baseUnit(        "B" , "byte")
                .addUnit(1000             , "kB", "kilobyte")
                .addUnit(pow(1000, 2)     , "MB", "megabyte")
                .addUnit(pow(1000, 3)     , "GB", "gigabyte")
                .addUnit(pow(1000, 4)     , "TB", "terabyte")
                .addUnit(pow(1000, 5)     , "PB", "petabyte")
                .addUnit(pow(1000, 6)     , "EB", "exabyte")
                .addUnit(pow(1000, 7)     , "ZB", "zettabyte")
                .addUnit(pow(1000, 8)     , "YB", "yottabyte")
            .build()
        );
    }
}

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
 * A BinaryByteParser is a {@link GenericUnitParser} for binary units of information, from bytes
 * to yobibyte.
 *
 */
public class BinaryByteParser extends GenericUnitParser {

    public BinaryByteParser() {
        super(UnitsBuilder.baseUnit(        "B"  , "byte")
                .addUnit(1024             , "KiB", "kibibyte")
                .addUnit(pow(1024, 2)     , "MiB", "mebibyte")
                .addUnit(pow(1024, 3)     , "GiB", "gibibyte")
                .addUnit(pow(1024, 4)     , "TiB", "tebibyte")
                .addUnit(pow(1024, 5)     , "PiB", "pebibyte")
                .addUnit(pow(1024, 6)     , "EiB", "exbibyte")
                .addUnit(pow(1024, 7)     , "ZiB", "zebibyte")
                .addUnit(pow(1024, 8)     , "YiB", "yobibyte")
            .build()
        );
    }
}

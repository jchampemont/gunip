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

/**
 * A MetricDistanceParser is a {@link GenericUnitParser} for metric distances, from millimeters
 * to kilometers.
 *
 */
public class MetricDistanceParser extends GenericUnitParser {

    public MetricDistanceParser() {
        super(UnitsBuilder.baseUnit("mm", "millimetre", "millimeter")
                .addUnit(10,        "cm", "centimetre", "centimeter")
                .addUnit(100,       "dm", "decimetre", "decimetre")
                .addUnit(1000,      "m", "metre", "meter")
                .addUnit(10000,     "dam", "decametre", "decameter")
                .addUnit(100000,    "hm", "hectometre", "hectometer")
                .addUnit(1000000,   "km", "kilometre", "kilometer")
            .build()
        );
    }
}

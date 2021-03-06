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
 * A ImperialDistanceParser is a {@link GenericUnitParser} for imperial distances, including
 * inches, feet, yards and miles
 *
 */
public class ImperialDistanceParser extends GenericUnitParser {
    
    public ImperialDistanceParser() {
        super(UnitsBuilder.baseUnit(     "in", "inch", "inche", "\"")
                .addUnit(12            , "ft", "foot", "feet", "'")
                .addUnit(12 * 3        , "yd", "yard")
                .addUnit(1760 * 12 * 3 , "mi", "mile")
            .build()
        );
    }
}

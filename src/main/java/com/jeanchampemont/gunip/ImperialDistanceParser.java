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

import java.util.ArrayList;
import java.util.List;

/**
 * A ImperialDistanceParser is a {@link GenericUnitParser} for imperial distances, including
 * inches, feet, yards and miles
 *
 */
public class ImperialDistanceParser extends GenericUnitParser {

    private static final List<Unit> units = new ArrayList<>();

    static {
        units.add(new Unit(new String[] { "in", "inch", "inche", "\"" }, 1));
        units.add(new Unit(new String[] { "ft", "foot", "feet", "'" }, 12));
        units.add(new Unit(new String[] { "yd", "yard"}, 12 * 3));
        units.add(new Unit(new String[] { "mi", "mile"}, 1760 * 12 * 3));
    }

    public ImperialDistanceParser() {
        super(units);
    }
}

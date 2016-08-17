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
 * A MetricDistanceParser is a {@link GenericUnitParser} for metric distances, from millimeters
 * to kilometers.
 *
 */
public class MetricDistanceParser extends GenericUnitParser {

    private static final List<Unit> units = new ArrayList<>();

    static {
        units.add(new Unit(new String[] { "mm", "millimetre", "millimeter" }, 1));
        units.add(new Unit(new String[] { "cm", "centimetre", "centimeter" }, 10));
        units.add(new Unit(new String[] { "dm", "decimetre", "decimetre" }, 100));
        units.add(new Unit(new String[] { "m", "metre", "meter" }, 1000));
        units.add(new Unit(new String[] { "dam", "decametre", "decameter" }, 10000));
        units.add(new Unit(new String[] { "hm", "hectometre", "hectometer"}, 100000));
        units.add(new Unit(new String[] { "km", "kilometre", "kilometer" }, 1000000));
    }

    public MetricDistanceParser() {
        super(units);
    }
}

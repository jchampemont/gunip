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
 * A DurationParser is a {@link GenericUnitParser} for durations, from seconds
 * to years.
 *
 */
public class DurationParser extends GenericUnitParser {

    private static final List<Unit> units = new ArrayList<>();

    static {
        units.add(new Unit(new String[] { "s", "sec", "second" }, 1));
        units.add(new Unit(new String[] { "m(?!s)", "min", "minute" }, 60));
        units.add(new Unit(new String[] { "h", "hr", "hour" }, 60 * 60));
        units.add(new Unit(new String[] { "d", "dy", "day" }, 60 * 60 * 24));
        units.add(new Unit(new String[] { "w", "wk", "week" }, 60 * 60 * 24 * 7));
        units.add(new Unit(new String[] { "mth", "mo", "mon", "month" }, 2628000));
        units.add(new Unit(new String[] { "y", "yr", "year" }, 31536000));
    }

    public DurationParser() {
        super(units);
    }
}

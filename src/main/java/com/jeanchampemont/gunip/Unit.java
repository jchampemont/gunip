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

import java.util.Arrays;
import java.util.List;

/**
 * A Unit is a list of patterns for that unit and its value in the base
 * unit.
 * 
 * For example, if seconds is the base unit, a unit for minutes may have
 * those patterns: <pre>m(?!s)</pre>, <pre>min</pre>, <pre>minute</pre>.
 * 
 * And as the base value is seconds and a minute is 60 seconds, the value
 * in our example would be 60.
 */
public class Unit {
    final List<String> patterns;

    final double value;

    /**
     * Build a new unit with the specified unit symbols patterns and the value
     * in the base unit.
     * 
     * @param symbolsPatterns
     *            an array of unit symbols patterns matching possible unit's symbols
     * @param valueInBaseUnit
     *            the value of this unit in the base unit
     */
    public Unit(String[] symbolsPatterns, double valueInBaseUnit) {
        this.patterns = Arrays.asList(symbolsPatterns);
        this.value = valueInBaseUnit;
    }

    /**
     * @param patterns
     * @param valueInSec
     * 
     * @deprecated Prefer using {@link #Unit(String[], double)}
     */
    @Deprecated
    public Unit(String[] patterns, long valueInSec) {
        this.patterns = Arrays.asList(patterns);
        this.value = valueInSec;
    }

    String makeKey(String pattern) {
        return value + pattern;
    }
}
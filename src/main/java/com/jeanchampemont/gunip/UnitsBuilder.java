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
 * Helper class to build a units table for a {@link GenericUnitParser}
 */
public class UnitsBuilder {
    
    private List<Unit> units;
    
    /**
     * Static helper for API fluency
     * 
     * @see #UnitsBuilder(String...)
     */
    public static UnitsBuilder baseUnit(String... baseUnitSymbolsPatterns) {
        return new UnitsBuilder(baseUnitSymbolsPatterns);
    }
    
    /**
     * Create a new units table with a base unit.
     * 
     * @param baseUnitSymbolsPatterns patterns matching the symbols of the base unit
     */
    public UnitsBuilder(String... baseUnitSymbolsPatterns) {
        units = new ArrayList<>();
        units.add(new Unit(baseUnitSymbolsPatterns, 1.0));
    }
    
    /**
     * Add a new unit to the units table
     * @param valueInBaseUnit the value of this unit in the base unit
     * @param unitSymbolsPatterns patterns matching the symbols of this unit
     * @return the builder
     */
    public UnitsBuilder addUnit(double valueInBaseUnit, String... unitSymbolsPatterns) {
        units.add(new Unit(unitSymbolsPatterns, valueInBaseUnit));
        return this;
    }
    
    /**
     * Build the units table
     * @return the units table
     */
    public List<Unit> build() {
        return units;
    }
}

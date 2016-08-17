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
 * An exception indicating that something went wrong during the parsing of a
 * string.
 *
 * Usually this is because a Regexp you provided for a Unit is incorrect.
 */
public class GenericUnitParserException extends RuntimeException {
    private static final long serialVersionUID = -5273704710466372339L;

    public GenericUnitParserException(String msg, Throwable t) {
        super(msg, t);
    }
}

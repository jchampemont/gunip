# Generic UNIt Parser (GUNIP)
[![Build status](https://travis-ci.org/jchampemont/gunip.svg?branch=master)](https://travis-ci.org/jchampemont/gunip)
[![Coverage Status](https://coveralls.io/repos/jchampemont/gunip/badge.svg?branch=master&service=github)](https://coveralls.io/github/jchampemont/gunip?branch=master)
[![GitHub issues](https://img.shields.io/github/issues/jchampemont/gunip.svg?maxAge=2592000)](https://github.com/jchampemont/gunip/issues)
[![GitHub release](https://img.shields.io/github/release/jchampemont/gunip.svg?maxAge=2592000)](https://github.com/jchampemont/gunip/releases)
[![Jitpack .jar](https://jitpack.io/v/jchampemont/gunip.svg)](https://jitpack.io/#jchampemont/gunip)

[Javadoc](https://jchampemont.github.io/gunip/javadoc-master/)

## Presentation

Gunip is a small Java tool with no external dependencies to parse natural language text such as

    2 hours, 1 mn and 22sec
    
and get the value in the base unit (seconds here). For our example, the value is:

    2 * 60 * 60 + 1 * 60 + 22 = 7282 seconds
    
It is generic as it allows you to parse any set of units provided you give a conversion table.

You can use it for distances:

    22kilometers, 12 m and 78 cm (220 012 780 millimeters)
    1km, 42 meters 1278 centimeters (10 432 780 millimeters)
    
or with the imperial system:

	12 miles 22yd 1ft and 2inches (761 126 inches)
	
Inspired by [Juration](https://github.com/domchristie/juration)
	
Gunip does not strictly enforce user input so such a string:

    100 sausages and 20min
    
will be parsed as 1200seconds. (I don't know what a sausage is worth in seconds)
	
Some default parsers are provided for common units, but you can configure your own parser
for unsupported units.

Provided parsers are:

- DurationParser, for seconds up to years (see [DurationParser](src/main/java/com/jeanchampemont/gunip/DurationParser.java))
- MetricDistanceParser, for millimeters up to kilometers (see [MetricDistanceParser](src/main/java/com/jeanchampemont/gunip/MetricDistanceParser.java))
- ImperialDistanceParser, for inches, feet, yard and miles (see [ImperialDistanceParser](src/main/java/com/jeanchampemont/gunip/ImperialDistanceParser.java))

## Using GUNIP

GUNIP is not (yet?) available on Maven central. To use GUNIP, please build it from source or download 
the latest release jar from [here](https://github.com/jchampemont/gunip/releases).

To use GUNIP, just instantiate an instance of GenericUnitParser. To see an example of usage, please look at the source code of [DurationParser](src/main/java/com/jeanchampemont/gunip/DurationParser.java).

#### Using Jitpack
A version of Gunip is available using the Jitpack maven repository. Please check details here: [Gunip on Jitpack](https://jitpack.io/#jchampemont/gunip/)

## Contributing
I am happy to accept any pull request as long as it respects the following guidelines :

- Meets some basic code quality requirements
- Please do some basic unit testing on your code
- Don't introduce any new dependency without discussing it in your pull request
- You accept your code to be licensed under the Apache License, Version 2.0

Feel free to add your name on the list of contributors below.

## Contributors
- Jean Champémont

## License
Copyright 2016 [Jean Champémont](http://www.jeanchampemont.com)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this application except in compliance with the License.
You may obtain a copy of the License at

[http://www.apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/) 
and this project adheres to [Semantic Versioning](http://semver.org/).

## [Unreleased]

## [1.1.0] - 2016-09-01
### Added
- Add a builder to facilitate the construction of units table
- Change the existing unit parsers implementations to use that builder

### Fixed
- Defensively copying the List parameter in [GenericUnitParser](src/main/java/com/jeanchampemont/gunip/GenericUnitParser.java).
- Unit constructor is now accepting a `double` as the value of the unit in base unit. Constructor using a `long` is now deprecated.


## [1.0.0] - 2016-08-19
First release of the project
### Added
- A generic unit parser
- Unit parser implementations for: metric distances, imperial distances and durations

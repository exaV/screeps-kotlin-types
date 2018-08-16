# screeps-kotlin-types

[ ![Kotlin](https://img.shields.io/badge/Kotlin-1.2.60-blue.svg)](http://kotlinlang.org) 
[![Build Status](https://travis-ci.org/exaV/screeps-kotlin-types.svg?branch=master)](https://travis-ci.org/exaV/screeps-kotlin-types)
[ ![Download](https://api.bintray.com/packages/exav/screeps-kotlin/screeps-kotlin-types/images/download.svg) ](https://bintray.com/exav/screeps-kotlin/screeps-kotlin-types/_latestVersion)
> The repository for *Screep's* Kotlin type definitions. https://screeps.com/

### Gradle

``` Groovy
repositories {
    jcenter()
}
dependencies {
    compile "ch.delconte.screeps-kotlin:screeps-kotlin-types:<version>"
}

```
          
### Extensions

Besides the types, 
the package *types.extensions.** holds some useful functions for playing screeps with Kotlin.
Some highlights are:

Lazy properties adapted for Screeps:

    val expensiveToCompute: Int by lazyPerTick { <code executed at most once per tick> }
     
Typed extensions for `creep.memory

    var CreepMemory.someValue: Int by memoryOrDefault(0)`
    // access later with creep.memory.someValue
     


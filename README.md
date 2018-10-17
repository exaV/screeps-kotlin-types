# screeps-kotlin-types

[ ![Kotlin](https://img.shields.io/badge/Kotlin-1.2.71-blue.svg)](http://kotlinlang.org) 
[![Build Status](https://travis-ci.org/exaV/screeps-kotlin-types.svg?branch=master)](https://travis-ci.org/exaV/screeps-kotlin-types)
[ ![Download](https://api.bintray.com/packages/exav/screeps-kotlin/screeps-kotlin-types/images/download.svg) ](https://bintray.com/exav/screeps-kotlin/screeps-kotlin-types/_latestVersion)
> The repository for *Screep's* Kotlin type definitions. https://screeps.com/

Start here: https://github.com/exaV/screeps-kotlin-starter

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
the package *screeps.utils.** holds some useful functions for playing screeps with Kotlin.
Some notable utilities are documented below:

Lazy properties adapted for Screeps:

    val expensiveToCompute: Int by lazyPerTick { <code executed at most once per tick> }
        

Memory delegates:  
The function `memory()` creates a delegated property that is saved to memory. 
Such properties can only be created on objects that have access to memory such as `Creep.memory` or `Flag.memory`.
By convention all types that have access to memory inherit from the `MemoryMarker` interface.

    var CreepMemory.priority: Int by memory { 0 }
    // access later with creep.memory.priority
     

Optional arguments to api functions:

     PathFinder.search(origin,goal, options {
            flee = true
        })

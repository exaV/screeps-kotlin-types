# screeps-kotlin-types

[ ![Kotlin](https://img.shields.io/badge/Kotlin-1.6.10-blue.svg)](http://kotlinlang.org) 
[![Build Status](https://github.com/exav/screeps-kotlin-types/actions/workflows/build.yml/badge.svg)](https://github.com/exav/screeps-kotlin-types/actions)
[ ![Download](https://img.shields.io/maven-central/v/io.github.exav/screeps-kotlin-types) ](https://search.maven.org/artifact/io.github.exav/screeps-kotlin-types)
> The repository for *Screep's* Kotlin type definitions. https://screeps.com/

Start here: https://github.com/exaV/screeps-kotlin-starter

### Gradle

``` Kotlin
repositories {
    mavenCentral()
}
dependencies {
    implementation("io.github.exav:screeps-kotlin-types:<version>")
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

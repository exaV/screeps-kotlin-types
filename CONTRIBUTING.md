# Thank you for contributing to `screeps-kotlin-types`!

This document contains guides on getting started with developing `screeps-kotlin-types`, as well as the guidelines for contributing to this repository.

This library will stay up to date only with the help of you! If active players don't update it, it'll get lost.

## The Five Golden Rules

The simple steps of contributing to any GitHub project are as follows:

1. [Fork the repository](https://github.com/exaV/screeps-kotlin-types/fork)
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push -u origin my-new-feature`
5. Create a [Pull Request](https://github.com/exaV/screeps-kotlin-types/pulls)!

To keep your fork of in sync with this repository, [follow this guide](https://help.github.com/articles/syncing-a-fork/).

## Getting Started

To get started, just clone this repository, and install the required dependencies.

```bash
./gradlew build
```

## Testing Locally 

Install the library locally

* Run `./gradlew publishKotlinPublicationToMavenLocal` to install the library locally on your machine
* Add `mavenLocal()` to the repositories section of your bots build.gradle.kts
* Change the dependency in your bot to `ch.delconte.screeps-kotlin:screeps-kotlin-types:SNAPSHOT`

OR

Using https://jitpack.io/

* Add `maven( url="https://jitpack.io")` to the repositories section of your bots build.gradle
* Add the branch or last commit of your PR as a dependency to your bot implementation eg `com.github.<github_user>:screeps-kotlin-types:<branch_name>-SNAPSHOT")`


## Filing Issues

Please feel free to submit issues for bugs and feature requests, I promise to get back to you ASAP!
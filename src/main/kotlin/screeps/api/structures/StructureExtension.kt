package screeps.api.structures

import screeps.api.Owned
import screeps.api.SpawnEnergyProvider

abstract external class StructureExtension : Structure, Owned, SpawnEnergyProvider

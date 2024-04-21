package screeps.api.structures

import screeps.api.Decaying
import screeps.api.StoreOwner

abstract external class StructureContainer : Structure, Decaying, StoreOwner

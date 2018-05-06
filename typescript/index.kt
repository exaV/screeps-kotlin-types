@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "EXTERNAL_DELEGATION",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE"
)

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external var OK: Number /* 0 */ = definedExternally
external var ERR_NOT_OWNER: Number /* -1 */ = definedExternally
external var ERR_NO_PATH: Number /* -2 */ = definedExternally
external var ERR_NAME_EXISTS: Number /* -3 */ = definedExternally
external var ERR_BUSY: Number /* -4 */ = definedExternally
external var ERR_NOT_FOUND: Number /* -5 */ = definedExternally
external var ERR_NOT_ENOUGH_RESOURCES: Number /* -6 */ = definedExternally
external var ERR_NOT_ENOUGH_ENERGY: Number /* -6 */ = definedExternally
external var ERR_INVALID_TARGET: Number /* -7 */ = definedExternally
external var ERR_FULL: Number /* -8 */ = definedExternally
external var ERR_NOT_IN_RANGE: Number /* -9 */ = definedExternally
external var ERR_INVALID_ARGS: Number /* -10 */ = definedExternally
external var ERR_TIRED: Number /* -11 */ = definedExternally
external var ERR_NO_BODYPART: Number /* -12 */ = definedExternally
external var ERR_NOT_ENOUGH_EXTENSIONS: Number /* -6 */ = definedExternally
external var ERR_RCL_NOT_ENOUGH: Number /* -14 */ = definedExternally
external var ERR_GCL_NOT_ENOUGH: Number /* -15 */ = definedExternally
external var FIND_EXIT_TOP: Number /* 1 */ = definedExternally
external var FIND_EXIT_RIGHT: Number /* 3 */ = definedExternally
external var FIND_EXIT_BOTTOM: Number /* 5 */ = definedExternally
external var FIND_EXIT_LEFT: Number /* 7 */ = definedExternally
external var FIND_EXIT: Number /* 10 */ = definedExternally
external var FIND_CREEPS: Number /* 101 */ = definedExternally
external var FIND_MY_CREEPS: Number /* 102 */ = definedExternally
external var FIND_HOSTILE_CREEPS: Number /* 103 */ = definedExternally
external var FIND_SOURCES_ACTIVE: Number /* 104 */ = definedExternally
external var FIND_SOURCES: Number /* 105 */ = definedExternally
external var FIND_DROPPED_ENERGY: Number /* -106 */ = definedExternally
external var FIND_DROPPED_RESOURCES: Number /* 106 */ = definedExternally
external var FIND_STRUCTURES: Number /* 107 */ = definedExternally
external var FIND_MY_STRUCTURES: Number /* 108 */ = definedExternally
external var FIND_HOSTILE_STRUCTURES: Number /* 109 */ = definedExternally
external var FIND_FLAGS: Number /* 110 */ = definedExternally
external var FIND_CONSTRUCTION_SITES: Number /* 111 */ = definedExternally
external var FIND_MY_SPAWNS: Number /* 112 */ = definedExternally
external var FIND_HOSTILE_SPAWNS: Number /* 113 */ = definedExternally
external var FIND_MY_CONSTRUCTION_SITES: Number /* 114 */ = definedExternally
external var FIND_HOSTILE_CONSTRUCTION_SITES: Number /* 115 */ = definedExternally
external var FIND_MINERALS: Number /* 116 */ = definedExternally
external var FIND_NUKES: Number /* 117 */ = definedExternally
external var TOP: Number /* 1 */ = definedExternally
external var TOP_RIGHT: Number /* 2 */ = definedExternally
external var RIGHT: Number /* 3 */ = definedExternally
external var BOTTOM_RIGHT: Number /* 4 */ = definedExternally
external var BOTTOM: Number /* 5 */ = definedExternally
external var BOTTOM_LEFT: Number /* 6 */ = definedExternally
external var LEFT: Number /* 7 */ = definedExternally
external var TOP_LEFT: Number /* 8 */ = definedExternally
external var COLOR_RED: Number /* 1 */ = definedExternally
external var COLOR_PURPLE: Number /* 2 */ = definedExternally
external var COLOR_BLUE: Number /* 3 */ = definedExternally
external var COLOR_CYAN: Number /* 4 */ = definedExternally
external var COLOR_GREEN: Number /* 5 */ = definedExternally
external var COLOR_YELLOW: Number /* 6 */ = definedExternally
external var COLOR_ORANGE: Number /* 7 */ = definedExternally
external var COLOR_BROWN: Number /* 8 */ = definedExternally
external var COLOR_GREY: Number /* 9 */ = definedExternally
external var COLOR_WHITE: Number /* 10 */ = definedExternally
external var COLORS_ALL: Array<dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ */> =
    definedExternally
external var CREEP_SPAWN_TIME: Number /* 3 */ = definedExternally
external var CREEP_LIFE_TIME: Number /* 1500 */ = definedExternally
external var CREEP_CLAIM_LIFE_TIME: Number /* 500 */ = definedExternally
external var CREEP_CORPSE_RATE: Number /* 0.2 */ = definedExternally
external var OBSTACLE_OBJECT_TYPES: dynamic /* JsTuple<String /* "spawn" */, String /* "creep" */, String /* "wall" */, String /* "source" */, String /* "constructedWall" */, String /* "extension" */, String /* "link" */, String /* "storage" */, String /* "tower" */, String /* "observer" */, String /* "powerSpawn" */, String /* "powerBank" */, String /* "lab" */, String /* "terminal" */, String /* "nuker" */> */ =
    definedExternally
external var ENERGY_REGEN_TIME: Number /* 300 */ = definedExternally
external var ENERGY_DECAY: Number /* 1000 */ = definedExternally
external var REPAIR_COST: Number /* 0.01 */ = definedExternally
external var RAMPART_DECAY_AMOUNT: Number /* 300 */ = definedExternally
external var RAMPART_DECAY_TIME: Number /* 100 */ = definedExternally
external var RAMPART_HITS: Number /* 1 */ = definedExternally

external object RAMPART_HITS_MAX {
    @nativeGetter
    operator fun get(rcl: Number): Number?

    @nativeSetter
    operator fun set(rcl: Number, value: Number)

    var `2`: Number /* 300000 */ = definedExternally
    var `3`: Number /* 1000000 */ = definedExternally
    var `4`: Number /* 3000000 */ = definedExternally
    var `5`: Number /* 10000000 */ = definedExternally
    var `6`: Number /* 30000000 */ = definedExternally
    var `7`: Number /* 100000000 */ = definedExternally
    var `8`: Number /* 300000000 */ = definedExternally
}

external var SPAWN_HITS: Number /* 5000 */ = definedExternally
external var SPAWN_ENERGY_START: Number /* 300 */ = definedExternally
external var SPAWN_ENERGY_CAPACITY: Number /* 300 */ = definedExternally
external var SOURCE_ENERGY_CAPACITY: Number /* 3000 */ = definedExternally
external var SOURCE_ENERGY_NEUTRAL_CAPACITY: Number /* 1500 */ = definedExternally
external var SOURCE_ENERGY_KEEPER_CAPACITY: Number /* 4000 */ = definedExternally
external var WALL_HITS: Number /* 1 */ = definedExternally
external var WALL_HITS_MAX: Number /* 300000000 */ = definedExternally
external var EXTENSION_HITS: Number /* 1000 */ = definedExternally

external object EXTENSION_ENERGY_CAPACITY {
    @nativeGetter
    operator fun get(rcl: Number): Number?

    @nativeSetter
    operator fun set(rcl: Number, value: Number)

    var `0`: Number /* 50 */ = definedExternally
    var `1`: Number /* 50 */ = definedExternally
    var `2`: Number /* 50 */ = definedExternally
    var `3`: Number /* 50 */ = definedExternally
    var `4`: Number /* 50 */ = definedExternally
    var `5`: Number /* 50 */ = definedExternally
    var `6`: Number /* 50 */ = definedExternally
    var `7`: Number /* 100 */ = definedExternally
    var `8`: Number /* 200 */ = definedExternally
}

external var ROAD_HITS: Number /* 5000 */ = definedExternally
external var ROAD_WEAROUT: Number /* 1 */ = definedExternally
external var ROAD_DECAY_AMOUNT: Number /* 100 */ = definedExternally
external var ROAD_DECAY_TIME: Number /* 1000 */ = definedExternally
external var LINK_HITS: Number /* 1000 */ = definedExternally
external var LINK_HITS_MAX: Number /* 1000 */ = definedExternally
external var LINK_CAPACITY: Number /* 800 */ = definedExternally
external var LINK_COOLDOWN: Number /* 1 */ = definedExternally
external var LINK_LOSS_RATIO: Number /* 0.03 */ = definedExternally
external var STORAGE_CAPACITY: Number /* 1000000 */ = definedExternally
external var STORAGE_HITS: Number /* 10000 */ = definedExternally
external var BODYPART_COST: Any? = definedExternally
external var BODYPARTS_ALL: Array<dynamic /* String /* "move" */ | String /* "work" */ | String /* "carry" */ | String /* "attack" */ | String /* "ranged_attack" */ | String /* "tough" */ | String /* "heal" */ | String /* "claim" */ */> =
    definedExternally
external var CARRY_CAPACITY: Number /* 50 */ = definedExternally
external var HARVEST_POWER: Number /* 2 */ = definedExternally
external var HARVEST_MINERAL_POWER: Number /* 1 */ = definedExternally
external var REPAIR_POWER: Number /* 100 */ = definedExternally
external var DISMANTLE_POWER: Number /* 50 */ = definedExternally
external var BUILD_POWER: Number /* 5 */ = definedExternally
external var ATTACK_POWER: Number /* 30 */ = definedExternally
external var UPGRADE_CONTROLLER_POWER: Number /* 1 */ = definedExternally
external var RANGED_ATTACK_POWER: Number /* 10 */ = definedExternally
external var HEAL_POWER: Number /* 12 */ = definedExternally
external var RANGED_HEAL_POWER: Number /* 4 */ = definedExternally
external var DISMANTLE_COST: Number /* 0.005 */ = definedExternally
external var MOVE: String /* "move" */ = definedExternally
external var WORK: String /* "work" */ = definedExternally
external var CARRY: String /* "carry" */ = definedExternally
external var ATTACK: String /* "attack" */ = definedExternally
external var RANGED_ATTACK: String /* "ranged_attack" */ = definedExternally
external var TOUGH: String /* "tough" */ = definedExternally
external var HEAL: String /* "heal" */ = definedExternally
external var CLAIM: String /* "claim" */ = definedExternally
external var CONSTRUCTION_COST: Any? = definedExternally
external var CONSTRUCTION_COST_ROAD_SWAMP_RATIO: Number /* 5 */ = definedExternally
external var STRUCTURE_EXTENSION: String /* "extension" */ = definedExternally
external var STRUCTURE_RAMPART: String /* "rampart" */ = definedExternally
external var STRUCTURE_ROAD: String /* "road" */ = definedExternally
external var STRUCTURE_SPAWN: String /* "spawn" */ = definedExternally
external var STRUCTURE_LINK: String /* "link" */ = definedExternally
external var STRUCTURE_WALL: String /* "constructedWall" */ = definedExternally
external var STRUCTURE_KEEPER_LAIR: String /* "keeperLair" */ = definedExternally
external var STRUCTURE_CONTROLLER: String /* "controller" */ = definedExternally
external var STRUCTURE_STORAGE: String /* "storage" */ = definedExternally
external var STRUCTURE_TOWER: String /* "tower" */ = definedExternally
external var STRUCTURE_OBSERVER: String /* "observer" */ = definedExternally
external var STRUCTURE_POWER_BANK: String /* "powerBank" */ = definedExternally
external var STRUCTURE_POWER_SPAWN: String /* "powerSpawn" */ = definedExternally
external var STRUCTURE_EXTRACTOR: String /* "extractor" */ = definedExternally
external var STRUCTURE_LAB: String /* "lab" */ = definedExternally
external var STRUCTURE_TERMINAL: String /* "terminal" */ = definedExternally
external var STRUCTURE_CONTAINER: String /* "container" */ = definedExternally
external var STRUCTURE_NUKER: String /* "nuker" */ = definedExternally
external var STRUCTURE_PORTAL: String /* "portal" */ = definedExternally
external var RESOURCE_ENERGY: String /* "energy" */ = definedExternally
external var RESOURCE_POWER: String /* "power" */ = definedExternally
external var RESOURCE_UTRIUM: String /* "U" */ = definedExternally
external var RESOURCE_LEMERGIUM: String /* "L" */ = definedExternally
external var RESOURCE_KEANIUM: String /* "K" */ = definedExternally
external var RESOURCE_GHODIUM: String /* "G" */ = definedExternally
external var RESOURCE_ZYNTHIUM: String /* "Z" */ = definedExternally
external var RESOURCE_OXYGEN: String /* "O" */ = definedExternally
external var RESOURCE_HYDROGEN: String /* "H" */ = definedExternally
external var RESOURCE_CATALYST: String /* "X" */ = definedExternally
external var RESOURCE_HYDROXIDE: String /* "OH" */ = definedExternally
external var RESOURCE_ZYNTHIUM_KEANITE: String /* "ZK" */ = definedExternally
external var RESOURCE_UTRIUM_LEMERGITE: String /* "UL" */ = definedExternally
external var RESOURCE_UTRIUM_HYDRIDE: String /* "UH" */ = definedExternally
external var RESOURCE_UTRIUM_OXIDE: String /* "UO" */ = definedExternally
external var RESOURCE_KEANIUM_HYDRIDE: String /* "KH" */ = definedExternally
external var RESOURCE_KEANIUM_OXIDE: String /* "KO" */ = definedExternally
external var RESOURCE_LEMERGIUM_HYDRIDE: String /* "LH" */ = definedExternally
external var RESOURCE_LEMERGIUM_OXIDE: String /* "LO" */ = definedExternally
external var RESOURCE_ZYNTHIUM_HYDRIDE: String /* "ZH" */ = definedExternally
external var RESOURCE_ZYNTHIUM_OXIDE: String /* "ZO" */ = definedExternally
external var RESOURCE_GHODIUM_HYDRIDE: String /* "GH" */ = definedExternally
external var RESOURCE_GHODIUM_OXIDE: String /* "GO" */ = definedExternally
external var RESOURCE_UTRIUM_ACID: String /* "UH2O" */ = definedExternally
external var RESOURCE_UTRIUM_ALKALIDE: String /* "UHO2" */ = definedExternally
external var RESOURCE_KEANIUM_ACID: String /* "KH2O" */ = definedExternally
external var RESOURCE_KEANIUM_ALKALIDE: String /* "KHO2" */ = definedExternally
external var RESOURCE_LEMERGIUM_ACID: String /* "LH2O" */ = definedExternally
external var RESOURCE_LEMERGIUM_ALKALIDE: String /* "LHO2" */ = definedExternally
external var RESOURCE_ZYNTHIUM_ACID: String /* "ZH2O" */ = definedExternally
external var RESOURCE_ZYNTHIUM_ALKALIDE: String /* "ZHO2" */ = definedExternally
external var RESOURCE_GHODIUM_ACID: String /* "GH2O" */ = definedExternally
external var RESOURCE_GHODIUM_ALKALIDE: String /* "GHO2" */ = definedExternally
external var RESOURCE_CATALYZED_UTRIUM_ACID: String /* "XUH2O" */ = definedExternally
external var RESOURCE_CATALYZED_UTRIUM_ALKALIDE: String /* "XUHO2" */ = definedExternally
external var RESOURCE_CATALYZED_KEANIUM_ACID: String /* "XKH2O" */ = definedExternally
external var RESOURCE_CATALYZED_KEANIUM_ALKALIDE: String /* "XKHO2" */ = definedExternally
external var RESOURCE_CATALYZED_LEMERGIUM_ACID: String /* "XLH2O" */ = definedExternally
external var RESOURCE_CATALYZED_LEMERGIUM_ALKALIDE: String /* "XLHO2" */ = definedExternally
external var RESOURCE_CATALYZED_ZYNTHIUM_ACID: String /* "XZH2O" */ = definedExternally
external var RESOURCE_CATALYZED_ZYNTHIUM_ALKALIDE: String /* "ZXHO2" */ = definedExternally
external var RESOURCE_CATALYZED_GHODIUM_ACID: String /* "XGH2O" */ = definedExternally
external var RESOURCE_CATALYZED_GHODIUM_ALKALIDE: String /* "XGHO2" */ = definedExternally
external var RESOURCES_ALL: Array<dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */> =
    definedExternally
external var SUBSCRIPTION_TOKEN: String = definedExternally

external object CONTROLLER_LEVELS {
    @nativeGetter
    operator fun get(level: Number): Number?

    @nativeSetter
    operator fun set(level: Number, value: Number)
}

external var CONTROLLER_STRUCTURES: Any? = definedExternally

external object CONTROLLER_DOWNGRADE {
    @nativeGetter
    operator fun get(level: Number): Number?

    @nativeSetter
    operator fun set(level: Number, value: Number)
}

external var CONTROLLER_CLAIM_DOWNGRADE: Number = definedExternally
external var CONTROLLER_RESERVE: Number = definedExternally
external var CONTROLLER_RESERVE_MAX: Number = definedExternally
external var CONTROLLER_MAX_UPGRADE_PER_TICK: Number = definedExternally
external var CONTROLLER_ATTACK_BLOCKED_UPGRADE: Number = definedExternally
external var TOWER_HITS: Number = definedExternally
external var TOWER_CAPACITY: Number = definedExternally
external var TOWER_ENERGY_COST: Number = definedExternally
external var TOWER_POWER_ATTACK: Number = definedExternally
external var TOWER_POWER_HEAL: Number = definedExternally
external var TOWER_POWER_REPAIR: Number = definedExternally
external var TOWER_OPTIMAL_RANGE: Number = definedExternally
external var TOWER_FALLOFF_RANGE: Number = definedExternally
external var TOWER_FALLOFF: Number = definedExternally
external var OBSERVER_HITS: Number = definedExternally
external var OBSERVER_RANGE: Number = definedExternally
external var POWER_BANK_HITS: Number = definedExternally
external var POWER_BANK_CAPACITY_MAX: Number = definedExternally
external var POWER_BANK_CAPACITY_MIN: Number = definedExternally
external var POWER_BANK_CAPACITY_CRIT: Number = definedExternally
external var POWER_BANK_DECAY: Number = definedExternally
external var POWER_BANK_HIT_BACK: Number = definedExternally
external var POWER_SPAWN_HITS: Number = definedExternally
external var POWER_SPAWN_ENERGY_CAPACITY: Number = definedExternally
external var POWER_SPAWN_POWER_CAPACITY: Number = definedExternally
external var POWER_SPAWN_ENERGY_RATIO: Number = definedExternally
external var EXTRACTOR_HITS: Number = definedExternally
external var EXTRACTOR_COOLDOWN: Number = definedExternally
external var LAB_HITS: Number = definedExternally
external var LAB_MINERAL_CAPACITY: Number = definedExternally
external var LAB_ENERGY_CAPACITY: Number = definedExternally
external var LAB_BOOST_ENERGY: Number = definedExternally
external var LAB_BOOST_MINERAL: Number = definedExternally
external var LAB_COOLDOWN: Number = definedExternally
external var LAB_REACTION_AMOUNT: Number = definedExternally
external var GCL_POW: Number = definedExternally
external var GCL_MULTIPLY: Number = definedExternally
external var GCL_NOVICE: Number = definedExternally
external var MODE_SIMULATION: String = definedExternally
external var MODE_SURVIVAL: String = definedExternally
external var MODE_WORLD: String = definedExternally
external var MODE_ARENA: String = definedExternally
external var TERRAIN_MASK_WALL: Number = definedExternally
external var TERRAIN_MASK_SWAMP: Number = definedExternally
external var TERRAIN_MASK_LAVA: Number = definedExternally
external var MAX_CONSTRUCTION_SITES: Number = definedExternally
external var MAX_CREEP_SIZE: Number = definedExternally
external var MINERAL_REGEN_TIME: Number = definedExternally
external var MINERAL_MIN_AMOUNT: Any? = definedExternally
external var MINERAL_RANDOM_FACTOR: Number = definedExternally

external object MINERAL_DENSITY {
    @nativeGetter
    operator fun get(level: Number): Number?

    @nativeSetter
    operator fun set(level: Number, value: Number)

    var `1`: Number = definedExternally
    var `2`: Number = definedExternally
    var `3`: Number = definedExternally
    var `4`: Number = definedExternally
}

external object MINERAL_DENSITY_PROBABILITY {
    @nativeGetter
    operator fun get(level: Number): Number?

    @nativeSetter
    operator fun set(level: Number, value: Number)

    var `1`: Number = definedExternally
    var `2`: Number = definedExternally
    var `3`: Number = definedExternally
    var `4`: Number = definedExternally
}

external var MINERAL_DENSITY_CHANGE: Number = definedExternally
external var DENSITY_LOW: Number = definedExternally
external var DENSITY_MODERATE: Number = definedExternally
external var DENSITY_HIGH: Number = definedExternally
external var DENSITY_ULTRA: Number = definedExternally
external var TERMINAL_CAPACITY: Number = definedExternally
external var TERMINAL_HITS: Number = definedExternally
external var TERMINAL_SEND_COST: Number = definedExternally
external var TERMINAL_MIN_SEND: Number = definedExternally
external var CONTAINER_HITS: Number = definedExternally
external var CONTAINER_CAPACITY: Number = definedExternally
external var CONTAINER_DECAY: Number = definedExternally
external var CONTAINER_DECAY_TIME: Number = definedExternally
external var CONTAINER_DECAY_TIME_OWNED: Number = definedExternally
external var NUKER_HITS: Number = definedExternally
external var NUKER_COOLDOWN: Number = definedExternally
external var NUKER_ENERGY_CAPACITY: Number = definedExternally
external var NUKER_GHODIUM_CAPACITY: Number = definedExternally
external var NUKE_LAND_TIME: Number = definedExternally
external var NUKE_RANGE: Number = definedExternally

external object NUKE_DAMAGE {
    @nativeGetter
    operator fun get(range: Number): Number?

    @nativeSetter
    operator fun set(range: Number, value: Number)

    var `0`: Number = definedExternally
    var `1`: Number = definedExternally
    var `4`: Number = definedExternally
}

external interface `T$0` {
    @nativeGetter
    operator fun get(resource: String): String?

    @nativeSetter
    operator fun set(resource: String, value: String)
}

external interface `T$1` {
    var O: String /* "OH" */
    var L: String /* "LH" */
    var K: String /* "KH" */
    var U: String /* "UH" */
    var Z: String /* "ZH" */
    var G: String /* "GH" */
}

external interface `T$2` {
    var H: String /* "OH" */
    var L: String /* "LO" */
    var K: String /* "KO" */
    var U: String /* "UO" */
    var Z: String /* "ZO" */
    var G: String /* "GO" */
}

external interface `T$3` {
    var K: String /* "ZK" */
    var H: String /* "ZH" */
    var O: String /* "ZO" */
}

external interface `T$4` {
    var U: String /* "UL" */
    var H: String /* "LH" */
    var O: String /* "LO" */
}

external interface `T$5` {
    var Z: String /* "ZK" */
    var H: String /* "KH" */
    var O: String /* "KO" */
}

external interface `T$6` {
    var H: String /* "GH" */
    var O: String /* "GO" */
}

external interface `T$7` {
    var L: String /* "UL" */
    var H: String /* "UH" */
    var O: String /* "UO" */
}

external interface `T$8` {
    var UH: String /* "UH2O" */
    var UO: String /* "UHO2" */
    var ZH: String /* "ZH2O" */
    var ZO: String /* "ZHO2" */
    var KH: String /* "KH2O" */
    var KO: String /* "KHO2" */
    var LH: String /* "LH2O" */
    var LO: String /* "LHO2" */
    var GH: String /* "GH2O" */
    var GO: String /* "GHO2" */
}

external interface `T$9` {
    var UH2O: String /* "XUH2O" */
    var UHO2: String /* "XUHO2" */
    var LH2O: String /* "XLH2O" */
    var LHO2: String /* "XLHO2" */
    var KH2O: String /* "XKH2O" */
    var KHO2: String /* "XKHO2" */
    var ZH2O: String /* "XZH2O" */
    var ZHO2: String /* "XZHO2" */
    var GH2O: String /* "XGH2O" */
    var GHO2: String /* "XGHO2" */
}

external interface `T$10` {
    var UL: String /* "G" */
}

external interface `T$11` {
    var ZK: String /* "G" */
}

external interface `T$12` {
    var OH: String /* "LH2O" */
}

external interface `T$13` {
    var OH: String /* "ZH2O" */
}

external interface `T$14` {
    var OH: String /* "GH2O" */
}

external interface `T$15` {
    var OH: String /* "KH2O" */
}

external interface `T$16` {
    var OH: String /* "UH2O" */
}

external interface `T$17` {
    var OH: String /* "LHO2" */
}

external interface `T$18` {
    var OH: String /* "ZHO2" */
}

external interface `T$19` {
    var OH: String /* "KHO2" */
}

external interface `T$20` {
    var OH: String /* "UHO2" */
}

external interface `T$21` {
    var OH: String /* "GHO2" */
}

external interface `T$22` {
    var X: String /* "XLH2O" */
}

external interface `T$23` {
    var X: String /* "XKH2O" */
}

external interface `T$24` {
    var X: String /* "XZH2O" */
}

external interface `T$25` {
    var X: String /* "XUH2O" */
}

external interface `T$26` {
    var X: String /* "XGH2O" */
}

external interface `T$27` {
    var X: String /* "XLHO2" */
}

external interface `T$28` {
    var X: String /* "XUHO2" */
}

external interface `T$29` {
    var X: String /* "XKHO2" */
}

external interface `T$30` {
    var X: String /* "XZHO2" */
}

external interface `T$31` {
    var X: String /* "XGHO2" */
}

external object REACTIONS {
    @nativeGetter
    operator fun get(resource: String): `T$0`?

    @nativeSetter
    operator fun set(resource: String, value: `T$0`)

    var H: `T$1` = definedExternally
    var O: `T$2` = definedExternally
    var Z: `T$3` = definedExternally
    var L: `T$4` = definedExternally
    var K: `T$5` = definedExternally
    var G: `T$6` = definedExternally
    var U: `T$7` = definedExternally
    var OH: `T$8` = definedExternally
    var X: `T$9` = definedExternally
    var ZK: `T$10` = definedExternally
    var UL: `T$11` = definedExternally
    var LH: `T$12` = definedExternally
    var ZH: `T$13` = definedExternally
    var GH: `T$14` = definedExternally
    var KH: `T$15` = definedExternally
    var UH: `T$16` = definedExternally
    var LO: `T$17` = definedExternally
    var ZO: `T$18` = definedExternally
    var KO: `T$19` = definedExternally
    var UO: `T$20` = definedExternally
    var GO: `T$21` = definedExternally
    var LH2O: `T$22` = definedExternally
    var KH2O: `T$23` = definedExternally
    var ZH2O: `T$24` = definedExternally
    var UH2O: `T$25` = definedExternally
    var GH2O: `T$26` = definedExternally
    var LHO2: `T$27` = definedExternally
    var UHO2: `T$28` = definedExternally
    var KHO2: `T$29` = definedExternally
    var ZHO2: `T$30` = definedExternally
    var GHO2: `T$31` = definedExternally
}

external interface `T$32` {
    @nativeGetter
    operator fun get(action: String): Number?

    @nativeSetter
    operator fun set(action: String, value: Number)
}

external interface `T$33` {
    @nativeGetter
    operator fun get(boost: String): `T$32`?

    @nativeSetter
    operator fun set(boost: String, value: `T$32`)
}

external interface `T$34` {
    var harvest: Number /* 3 */
}

external interface `T$35` {
    var harvest: Number /* 5 */
}

external interface `T$36` {
    var harvest: Number /* 7 */
}

external interface `T$37` {
    var build: Number /* 1.5 */
    var repair: Number /* 1.5 */
}

external interface `T$38` {
    var build: Number /* 1.8 */
    var repair: Number /* 1.8 */
}

external interface `T$39` {
    var build: Number /* 2 */
    var repair: Number /* 2 */
}

external interface `T$40` {
    var dismantle: Number /* 2 */
}

external interface `T$41` {
    var dismantle: Number /* 3 */
}

external interface `T$42` {
    var dismantle: Number /* 4 */
}

external interface `T$43` {
    var upgradeController: Number /* 1.5 */
}

external interface `T$44` {
    var upgradeController: Number /* 1.8 */
}

external interface `T$45` {
    var upgradeController: Number /* 2 */
}

external interface `T$46` {
    var UO: `T$34`
    var UHO2: `T$35`
    var XUHO2: `T$36`
    var LH: `T$37`
    var LH2O: `T$38`
    var XLH2O: `T$39`
    var ZH: `T$40`
    var ZH2O: `T$41`
    var XZH2O: `T$42`
    var GH: `T$43`
    var GH2O: `T$44`
    var XGH2O: `T$45`
}

external interface `T$47` {
    var attack: Number /* 2 */
}

external interface `T$48` {
    var attack: Number /* 3 */
}

external interface `T$49` {
    var attack: Number /* 4 */
}

external interface `T$50` {
    var UH: `T$47`
    var UH2O: `T$48`
    var XUH2O: `T$49`
}

external interface `T$51` {
    var rangedAttack: Number /* 2 */
    var rangedMassAttack: Number /* 2 */
}

external interface `T$52` {
    var rangedAttack: Number /* 3 */
    var rangedMassAttack: Number /* 3 */
}

external interface `T$53` {
    var rangedAttack: Number /* 4 */
    var rangedMassAttack: Number /* 4 */
}

external interface `T$54` {
    var KO: `T$51`
    var KHO2: `T$52`
    var XKHO2: `T$53`
}

external interface `T$55` {
    var heal: Number /* 2 */
    var rangedHeal: Number /* 2 */
}

external interface `T$56` {
    var heal: Number /* 3 */
    var rangedHeal: Number /* 3 */
}

external interface `T$57` {
    var heal: Number /* 4 */
    var rangedHeal: Number /* 4 */
}

external interface `T$58` {
    var LO: `T$55`
    var LHO2: `T$56`
    var XLHO2: `T$57`
}

external interface `T$59` {
    var capacity: Number /* 2 */
}

external interface `T$60` {
    var capacity: Number /* 3 */
}

external interface `T$61` {
    var capacity: Number /* 4 */
}

external interface `T$62` {
    var KH: `T$59`
    var KH2O: `T$60`
    var XKH2O: `T$61`
}

external interface `T$63` {
    var fatigue: Number /* 2 */
}

external interface `T$64` {
    var fatigue: Number /* 3 */
}

external interface `T$65` {
    var fatigue: Number /* 4 */
}

external interface `T$66` {
    var ZO: `T$63`
    var ZHO2: `T$64`
    var XZHO2: `T$65`
}

external interface `T$67` {
    var damage: Number /* 0.7 */
}

external interface `T$68` {
    var damage: Number /* 0.5 */
}

external interface `T$69` {
    var damage: Number /* 0.3 */
}

external interface `T$70` {
    var GO: `T$67`
    var GHO2: `T$68`
    var XGHO2: `T$69`
}

external object BOOSTS {
    @nativeGetter
    operator fun get(part: String): `T$33`?

    @nativeSetter
    operator fun set(part: String, value: `T$33`)

    var work: `T$46` = definedExternally
    var attack: `T$50` = definedExternally
    var ranged_attack: `T$54` = definedExternally
    var heal: `T$58` = definedExternally
    var carry: `T$62` = definedExternally
    var move: `T$66` = definedExternally
    var tough: `T$70` = definedExternally
}

external var LOOK_CREEPS: String /* "creep" */ = definedExternally
external var LOOK_ENERGY: String /* "energy" */ = definedExternally
external var LOOK_RESOURCES: String /* "resource" */ = definedExternally
external var LOOK_SOURCES: String /* "source" */ = definedExternally
external var LOOK_MINERALS: String /* "mineral" */ = definedExternally
external var LOOK_STRUCTURES: String /* "structure" */ = definedExternally
external var LOOK_FLAGS: String /* "flag" */ = definedExternally
external var LOOK_CONSTRUCTION_SITES: String /* "constructionSite" */ = definedExternally
external var LOOK_NUKES: String /* "nuke" */ = definedExternally
external var LOOK_TERRAIN: String /* "terrain" */ = definedExternally
external var ORDER_SELL: String /* "sell" */ = definedExternally
external var ORDER_BUY: String /* "buy" */ = definedExternally
external var SYSTEM_USERNAME: String = definedExternally

external interface ConstructionSite<T : dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ */> :
    RoomObject {
    override var prototype: ConstructionSite<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ */>
    var id: String
    var my: Boolean
    var owner: Owner
    var progress: Number
    var progressTotal: Number
    var structureType: T
    fun remove(): Number

    companion object : ConstructionSiteConstructor by definedExternally {
    }
}

external interface ConstructionSiteConstructor :
    _Constructor<ConstructionSite<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ */>>,
    _ConstructorById<ConstructionSite<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ */>>

external interface `T$71` {
    var energy: Number
}

external interface `T$72` {
    var pos: RoomPosition
}

external interface Creep : RoomObject {
    override var prototype: Creep
    var body: Array<BodyPartDefinition>
    var carry: Any? /* Any? & `T$71` */
    var carryCapacity: Number
    var fatigue: Number
    var hits: Number
    var hitsMax: Number
    var id: String
    var memory: CreepMemory
    var my: Boolean
    var name: String
    var owner: Owner
    override var room: Room
    var spawning: Boolean
    var saying: String
    var ticksToLive: Number?
    fun attack(target: Creep): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -7 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ */
    fun attack(target: Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -7 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ */
    fun attackController(target: StructureController): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -7 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ */
    fun build(target: ConstructionSite<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ */>): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -7 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ */
    fun cancelOrder(methodName: String): dynamic /* Number /* 0 */ | Number /* -5 */ */
    fun claimController(target: StructureController): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ */
    fun dismantle(target: Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -7 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ */
    fun drop(
        resourceType: dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */,
        amount: Number? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -6 */ */

    fun generateSafeMode(target: StructureController): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -7 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ */
    fun getActiveBodyparts(type: String /* "move" */): Number
    fun getActiveBodyparts(type: String /* "work" */): Number
    fun getActiveBodyparts(type: String /* "carry" */): Number
    fun getActiveBodyparts(type: String /* "attack" */): Number
    fun getActiveBodyparts(type: String /* "ranged_attack" */): Number
    fun getActiveBodyparts(type: String /* "tough" */): Number
    fun getActiveBodyparts(type: String /* "heal" */): Number
    fun getActiveBodyparts(type: String /* "claim" */): Number
    fun harvest(target: Source): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ */
    fun harvest(target: Mineral<dynamic /* String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ */>): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ */
    fun heal(target: Creep): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -7 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ */
    fun move(direction: Number /* 1 */): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -11 */ | Number /* -12 */ */
    fun move(direction: Number /* 2 */): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -11 */ | Number /* -12 */ */
    fun move(direction: Number /* 3 */): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -11 */ | Number /* -12 */ */
    fun move(direction: Number /* 4 */): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -11 */ | Number /* -12 */ */
    fun move(direction: Number /* 5 */): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -11 */ | Number /* -12 */ */
    fun move(direction: Number /* 6 */): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -11 */ | Number /* -12 */ */
    fun move(direction: Number /* 7 */): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -11 */ | Number /* -12 */ */
    fun move(direction: Number /* 8 */): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -11 */ | Number /* -12 */ */
    fun moveByPath(path: String): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -5 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ */
    fun moveByPath(path: Array<PathStep>): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -5 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ */
    fun moveByPath(path: Array<RoomPosition>): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -5 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ */
    fun moveTo(
        x: Number,
        y: Number,
        opts: MoveToOpts? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -4 */ | Number /* -7 */ | Number /* -11 */ | Number /* -12 */ */

    fun moveTo(
        target: RoomPosition,
        opts: MoveToOpts? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -4 */ | Number /* -5 */ | Number /* -7 */ | Number /* -11 */ | Number /* -12 */ */

    fun moveTo(
        target: `T$72`,
        opts: MoveToOpts? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -4 */ | Number /* -5 */ | Number /* -7 */ | Number /* -11 */ | Number /* -12 */ */

    fun notifyWhenAttacked(enabled: Boolean): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -10 */ */
    fun pickup(target: Resource<dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */>): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ */
    fun rangedAttack(target: Creep): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -7 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ */
    fun rangedAttack(target: Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -7 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ */
    fun rangedHeal(target: Creep): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -7 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ */
    fun rangedMassAttack(): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -12 */ */
    fun repair(target: Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -6 */ | Number /* -7 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ */
    fun reserveController(target: StructureController): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ | Number /* -7 */ | Number /* -9 */ | Number /* -11 */ | Number /* -12 */ */
    fun say(
        message: String,
        toPublic: Boolean? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ */

    fun signController(
        target: StructureController,
        text: String
    ): dynamic /* Number /* 0 */ | Number /* -4 */ | Number /* -7 */ | Number /* -9 */ */

    fun suicide(): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -4 */ */
    fun transfer(
        target: Creep,
        resourceType: dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */,
        amount: Number? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun transfer(
        target: Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>,
        resourceType: dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */,
        amount: Number? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun upgradeController(target: StructureController): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */
    fun withdraw(
        target: Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>,
        resourceType: dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */,
        amount: Number? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    companion object : CreepConstructor by definedExternally {
    }
}

external interface CreepConstructor : _Constructor<Creep>, _ConstructorById<Creep>
external interface Flag : RoomObject {
    override var prototype: Flag
    var color: dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ */
    var memory: FlagMemory
    var name: String
    var secondaryColor: dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ */
    fun remove(): Number /* 0 */
    fun setColor(
        color: Number /* 1 */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -10 */ */

    fun setColor(
        color: Number /* 2 */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -10 */ */

    fun setColor(
        color: Number /* 3 */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -10 */ */

    fun setColor(
        color: Number /* 4 */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -10 */ */

    fun setColor(
        color: Number /* 5 */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -10 */ */

    fun setColor(
        color: Number /* 6 */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -10 */ */

    fun setColor(
        color: Number /* 7 */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -10 */ */

    fun setColor(
        color: Number /* 8 */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -10 */ */

    fun setColor(
        color: Number /* 9 */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -10 */ */

    fun setColor(
        color: Number /* 10 */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -10 */ */

    fun setPosition(x: Number, y: Number): dynamic /* Number /* 0 */ | Number /* -10 */ */
    fun setPosition(pos: RoomPosition): dynamic /* Number /* 0 */ | Number /* -10 */ */
    fun setPosition(pos: `T$72`): dynamic /* Number /* 0 */ | Number /* -10 */ */

    companion object : FlagConstructor by definedExternally {
    }
}

external interface FlagConstructor : _Constructor<Flag> {
    @nativeInvoke
    operator fun invoke(
        name: String,
        color: Number /* 1 */,
        secondaryColor: dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ */,
        roomName: String,
        x: Number,
        y: Number
    ): Flag

    @nativeInvoke
    operator fun invoke(
        name: String,
        color: Number /* 2 */,
        secondaryColor: dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ */,
        roomName: String,
        x: Number,
        y: Number
    ): Flag

    @nativeInvoke
    operator fun invoke(
        name: String,
        color: Number /* 3 */,
        secondaryColor: dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ */,
        roomName: String,
        x: Number,
        y: Number
    ): Flag

    @nativeInvoke
    operator fun invoke(
        name: String,
        color: Number /* 4 */,
        secondaryColor: dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ */,
        roomName: String,
        x: Number,
        y: Number
    ): Flag

    @nativeInvoke
    operator fun invoke(
        name: String,
        color: Number /* 5 */,
        secondaryColor: dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ */,
        roomName: String,
        x: Number,
        y: Number
    ): Flag

    @nativeInvoke
    operator fun invoke(
        name: String,
        color: Number /* 6 */,
        secondaryColor: dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ */,
        roomName: String,
        x: Number,
        y: Number
    ): Flag

    @nativeInvoke
    operator fun invoke(
        name: String,
        color: Number /* 7 */,
        secondaryColor: dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ */,
        roomName: String,
        x: Number,
        y: Number
    ): Flag

    @nativeInvoke
    operator fun invoke(
        name: String,
        color: Number /* 8 */,
        secondaryColor: dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ */,
        roomName: String,
        x: Number,
        y: Number
    ): Flag

    @nativeInvoke
    operator fun invoke(
        name: String,
        color: Number /* 9 */,
        secondaryColor: dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ */,
        roomName: String,
        x: Number,
        y: Number
    ): Flag

    @nativeInvoke
    operator fun invoke(
        name: String,
        color: Number /* 10 */,
        secondaryColor: dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ | Number /* 9 */ | Number /* 10 */ */,
        roomName: String,
        x: Number,
        y: Number
    ): Flag
}

external interface `T$73` {
    @nativeGetter
    operator fun get(creepName: String): Creep?

    @nativeSetter
    operator fun set(creepName: String, value: Creep)
}

external interface `T$74` {
    @nativeGetter
    operator fun get(flagName: String): Flag?

    @nativeSetter
    operator fun set(flagName: String, value: Flag)
}

external interface `T$75` {
    @nativeGetter
    operator fun get(roomName: String): Room?

    @nativeSetter
    operator fun set(roomName: String, value: Room)
}

external interface `T$76` {
    @nativeGetter
    operator fun get(spawnName: String): StructureSpawn?

    @nativeSetter
    operator fun set(spawnName: String, value: StructureSpawn)
}

external interface `T$77` {
    @nativeGetter
    operator fun get(structureId: String): Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>?

    @nativeSetter
    operator fun set(
        structureId: String,
        value: Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>
    )
}

external interface `T$78` {
    @nativeGetter
    operator fun get(constructionSiteId: String): ConstructionSite<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ */>?

    @nativeSetter
    operator fun set(
        constructionSiteId: String,
        value: ConstructionSite<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ */>
    )
}

external interface Game {
    var cpu: CPU
    var creeps: `T$73`
    var flags: `T$74`
    var gcl: GlobalControlLevel
    var map: GameMap
    var market: Market
    var resources: Json
    var rooms: `T$75`
    var spawns: `T$76`
    var structures: `T$77`
    var constructionSites: `T$78`
    var shard: Shard
    var time: Number
    fun <T> getObjectById(id: String?): T?
    fun notify(message: String, groupInterval: Number? = definedExternally /* null */): Nothing?

    companion object : Game by definedExternally {
    }
}

external interface _HasRoomPosition {
    var pos: RoomPosition
}

external interface GlobalControlLevel {
    var level: Number
    var progress: Number
    var progressTotal: Number
}

external interface Shard {
    var name: String
    var type: String /* "normal" */
    var ptr: Boolean
}

external interface CPU {
    var limit: Number
    var tickLimit: Number
    var bucket: Number
    var shardLimits: CPUShardLimits
    fun getUsed(): Number
    fun setShardLimits(limits: CPUShardLimits): dynamic /* Number /* 0 */ | Number /* -4 */ | Number /* -10 */ */
}

external interface BodyPartDefinition {
    var boost: dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */ get() = definedExternally; set(value) = definedExternally
    var type: dynamic /* String /* "move" */ | String /* "work" */ | String /* "carry" */ | String /* "attack" */ | String /* "ranged_attack" */ | String /* "tough" */ | String /* "heal" */ | String /* "claim" */ */
    var hits: Number
}

external interface Owner {
    var username: String
}

external interface ReservationDefinition {
    var username: String
    var ticksToEnd: Number
}

external interface SignDefinition {
    var username: String
    var text: String
    var time: Number
    var datetime: Date
}

external interface CPUShardLimits {
    @nativeGetter
    operator fun get(shard: String): Number?

    @nativeSetter
    operator fun set(shard: String, value: Number)
}

external interface AllLookAtTypes {
    var constructionSite: ConstructionSite<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ */>
    var creep: Creep
    var energy: Resource<String /* "energy" */>
    var exit: Any
    var flag: Flag
    var mineral: Mineral<dynamic /* String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ */>
    var nuke: Nuke
    var resource: Resource<dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */>
    var source: Source
    var structure: Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>
    var terrain: dynamic /* String /* "wall" */ | String /* "plain" */ | String /* "swamp" */ */
}

external interface `T$79` {
    var type: K
}

external interface LookAtResultMatrix<K : dynamic /* String /* "creep" */ | String /* "source" */ | String /* "energy" */ | String /* "resource" */ | String /* "mineral" */ | String /* "structure" */ | String /* "flag" */ | String /* "constructionSite" */ | String /* "nuke" */ | String /* "terrain" */ */> {
    @nativeGetter
    operator fun get(coord: Number): dynamic /* LookAtResultMatrix<K> | Array<Any? /* Any? & `T$79` */> */

    @nativeSetter
    operator fun set(coord: Number, value: LookAtResultMatrix<K>)

    @nativeSetter
    operator fun set(coord: Number, value: Array<Any? /* Any? & `T$79` */>)
}

external interface `T$80` {
    @nativeGetter
    operator fun get(y: Number): Array<`T$79` /* `T$79` & Any? */>?

    @nativeSetter
    operator fun set(y: Number, value: Array<`T$79` /* `T$79` & Any? */>)
}

external interface LookForAtAreaResultMatrix<T, K : dynamic /* String /* "creep" */ | String /* "source" */ | String /* "energy" */ | String /* "resource" */ | String /* "mineral" */ | String /* "structure" */ | String /* "flag" */ | String /* "constructionSite" */ | String /* "nuke" */ | String /* "terrain" */ | String /* "exit" */ */> {
    @nativeGetter
    operator fun get(x: Number): `T$80`?

    @nativeSetter
    operator fun set(x: Number, value: `T$80`)
}

external interface FindTypes {
    @nativeGetter
    operator fun get(key: Number): dynamic /* ConstructionSite<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ */> | Creep | Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */> | Source | Mineral<dynamic /* String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ */> | RoomPosition | Resource<dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */> | Flag | Nuke */

    @nativeSetter
    operator fun set(
        key: Number,
        value: ConstructionSite<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ */>
    )

    @nativeSetter
    operator fun set(key: Number, value: Creep)

    @nativeSetter
    operator fun set(
        key: Number,
        value: Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>
    )

    @nativeSetter
    operator fun set(key: Number, value: Source)

    @nativeSetter
    operator fun set(
        key: Number,
        value: Mineral<dynamic /* String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ */>
    )

    @nativeSetter
    operator fun set(key: Number, value: RoomPosition)

    @nativeSetter
    operator fun set(
        key: Number,
        value: Resource<dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */>
    )

    @nativeSetter
    operator fun set(key: Number, value: Flag)

    @nativeSetter
    operator fun set(key: Number, value: Nuke)

    var `1`: RoomPosition
    var `3`: RoomPosition
    var `5`: RoomPosition
    var `7`: RoomPosition
    var `10`: RoomPosition
    var `101`: Creep
    var `102`: Creep
    var `103`: Creep
    var `104`: Source
    var `105`: Source
    var `106`: Resource<dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */>
    var `107`: dynamic /* StructureController | StructureSpawn | StructureExtension | StructureExtractor | StructureKeeperLair | StructureLab | StructureLink | StructureNuker | StructureObserver | StructurePowerBank | StructurePowerSpawn | StructureRampart | StructureStorage | StructureTerminal | StructureTower | StructureContainer | StructurePortal | StructureRoad | StructureWall */
    var `108`: dynamic /* StructureController | StructureSpawn | StructureExtension | StructureExtractor | StructureKeeperLair | StructureLab | StructureLink | StructureNuker | StructureObserver | StructurePowerBank | StructurePowerSpawn | StructureRampart | StructureStorage | StructureTerminal | StructureTower */
    var `109`: dynamic /* StructureController | StructureSpawn | StructureExtension | StructureExtractor | StructureKeeperLair | StructureLab | StructureLink | StructureNuker | StructureObserver | StructurePowerBank | StructurePowerSpawn | StructureRampart | StructureStorage | StructureTerminal | StructureTower */
    var `110`: Flag
    var `111`: ConstructionSite<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ */>
    var `112`: StructureSpawn
    var `113`: StructureSpawn
    var `114`: ConstructionSite<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ */>
    var `115`: ConstructionSite<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ */>
    var `116`: Mineral<dynamic /* String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ */>
    var `117`: Nuke
}

external interface FindPathOpts {
    var ignoreCreeps: Boolean? get() = definedExternally; set(value) = definedExternally
    var ignoreDestructibleStructures: Boolean? get() = definedExternally; set(value) = definedExternally
    var ignoreRoads: Boolean? get() = definedExternally; set(value) = definedExternally
    val costCallback: ((roomName: String, costMatrix: CostMatrix) -> dynamic /* Boolean | CostMatrix */)? get() = definedExternally
    var ignore: dynamic /* Array<Any> | Array<RoomPosition> */ get() = definedExternally; set(value) = definedExternally
    var avoid: dynamic /* Array<Any> | Array<RoomPosition> */ get() = definedExternally; set(value) = definedExternally
    var maxOps: Number? get() = definedExternally; set(value) = definedExternally
    var heuristicWeight: Number? get() = definedExternally; set(value) = definedExternally
    var serialize: Boolean? get() = definedExternally; set(value) = definedExternally
    var maxRooms: Number? get() = definedExternally; set(value) = definedExternally
    var range: Number? get() = definedExternally; set(value) = definedExternally
}

external interface MoveToOpts : FindPathOpts {
    var reusePath: Number? get() = definedExternally; set(value) = definedExternally
    var serializeMemory: Boolean? get() = definedExternally; set(value) = definedExternally
    var noPathFinding: Boolean? get() = definedExternally; set(value) = definedExternally
    var visualizePathStyle: PolyStyle? get() = definedExternally; set(value) = definedExternally
}

external interface PathStep {
    var x: Number
    var dx: Number
    var y: Number
    var dy: Number
    var direction: dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ */
}

external interface SurvivalGameInfo {
    var score: Number
    var timeToWave: Number
    var wave: Number
}

external interface _Constructor<T> {
    var prototype: T
}

external interface _ConstructorById<T> : _Constructor<T> {
    @nativeInvoke
    operator fun invoke(id: String): T
}

external interface RouteOptions {
    var routeCallback: (roomName: String, fromRoomName: String) -> Any
}

external interface `T$81` {
    var exit: dynamic /* Number /* 1 */ | Number /* 3 */ | Number /* 5 */ | Number /* 7 */ */
    var room: String
}

external interface GameMap {
    fun describeExits(roomName: String): Any
    fun findExit(
        fromRoom: String,
        toRoom: String,
        opts: RouteOptions? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun findExit(
        fromRoom: String,
        toRoom: Room,
        opts: RouteOptions? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun findExit(
        fromRoom: Room,
        toRoom: String,
        opts: RouteOptions? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun findExit(
        fromRoom: Room,
        toRoom: Room,
        opts: RouteOptions? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun findRoute(
        fromRoom: String,
        toRoom: String,
        opts: RouteOptions? = definedExternally /* null */
    ): dynamic /* Number /* -2 */ | Array<`T$81`> */

    fun findRoute(
        fromRoom: String,
        toRoom: Room,
        opts: RouteOptions? = definedExternally /* null */
    ): dynamic /* Number /* -2 */ | Array<`T$81`> */

    fun findRoute(
        fromRoom: Room,
        toRoom: String,
        opts: RouteOptions? = definedExternally /* null */
    ): dynamic /* Number /* -2 */ | Array<`T$81`> */

    fun findRoute(
        fromRoom: Room,
        toRoom: Room,
        opts: RouteOptions? = definedExternally /* null */
    ): dynamic /* Number /* -2 */ | Array<`T$81`> */

    fun getRoomLinearDistance(
        roomName1: String,
        roomName2: String,
        continuous: Boolean? = definedExternally /* null */
    ): Number

    fun getTerrainAt(
        x: Number,
        y: Number,
        roomName: String
    ): dynamic /* String /* "wall" */ | String /* "plain" */ | String /* "swamp" */ */

    fun getTerrainAt(pos: RoomPosition): dynamic /* String /* "wall" */ | String /* "plain" */ | String /* "swamp" */ */
    fun getWorldSize(): Number
    fun isRoomAvailable(roomName: String): Boolean
}

external interface `T$82` {
    @nativeGetter
    operator fun get(key: String): Order?

    @nativeSetter
    operator fun set(key: String, value: Order)
}

external interface Market {
    var credits: Number
    var incomingTransactions: Array<Transaction>
    var orders: `T$82`
    var outgoingTransactions: Array<Transaction>
    fun calcTransactionCost(amount: Number, roomName1: String, roomName2: String): Number
    fun cancelOrder(orderId: String): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */
    fun changeOrderPrice(
        orderId: String,
        newPrice: Number
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createOrder(
        type: String,
        resourceType: dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */,
        price: Number,
        totalAmount: Number,
        roomName: String? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun deal(
        orderId: String,
        amount: Number,
        targetRoomName: String? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun extendOrder(
        orderId: String,
        addAmount: Number
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun getAllOrders(filter: OrderFilter? = definedExternally /* null */): Array<Order>
    fun getAllOrders(filter: ((o: Order) -> Boolean)? = definedExternally /* null */): Array<Order>
    fun getOrderById(id: String): Order?
    fun getAllOrders(): Array<Order>
}

external interface `T$83` {
    var username: String
}

external interface Transaction {
    var transactionId: String
    var time: Number
    var sender: `T$83`? get() = definedExternally; set(value) = definedExternally
    var recipient: `T$83`? get() = definedExternally; set(value) = definedExternally
    var resourceType: dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */
    var amount: Number
    var from: String
    var to: String
    var description: String
    var order: TransactionOrder? get() = definedExternally; set(value) = definedExternally
}

external interface Order {
    var id: String
    var created: Number
    var active: Boolean? get() = definedExternally; set(value) = definedExternally
    var type: String
    var resourceType: dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */
    var roomName: String? get() = definedExternally; set(value) = definedExternally
    var amount: Number
    var remainingAmount: Number
    var totalAmount: Number? get() = definedExternally; set(value) = definedExternally
    var price: Number
}

external interface TransactionOrder {
    var id: String
    var type: String
    var price: Number
}

external interface OrderFilter {
    var id: String? get() = definedExternally; set(value) = definedExternally
    var created: Number? get() = definedExternally; set(value) = definedExternally
    var type: String? get() = definedExternally; set(value) = definedExternally
    var resourceType: dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */ get() = definedExternally; set(value) = definedExternally
    var roomName: String? get() = definedExternally; set(value) = definedExternally
    var amount: Number? get() = definedExternally; set(value) = definedExternally
    var remainingAmount: Number? get() = definedExternally; set(value) = definedExternally
    var price: Number? get() = definedExternally; set(value) = definedExternally
}

external interface `T$84` {
    @nativeGetter
    operator fun get(name: String): CreepMemory?

    @nativeSetter
    operator fun set(name: String, value: CreepMemory)
}

external interface `T$85` {
    @nativeGetter
    operator fun get(name: String): FlagMemory?

    @nativeSetter
    operator fun set(name: String, value: FlagMemory)
}

external interface `T$86` {
    @nativeGetter
    operator fun get(name: String): RoomMemory?

    @nativeSetter
    operator fun set(name: String, value: RoomMemory)
}

external interface `T$87` {
    @nativeGetter
    operator fun get(name: String): SpawnMemory?

    @nativeSetter
    operator fun set(name: String, value: SpawnMemory)
}

external interface Memory {
    @nativeGetter
    operator fun get(name: String): Any?

    @nativeSetter
    operator fun set(name: String, value: Any)

    var creeps: `T$84`
    var flags: `T$85`
    var rooms: `T$86`
    var spawns: `T$87`

    companion object : Memory by definedExternally {
    }
}

external interface CreepMemory
external interface FlagMemory
external interface RoomMemory
external interface SpawnMemory
external interface Mineral<T : dynamic /* String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ */> :
    RoomObject {
    override var prototype: Mineral<dynamic /* String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ */>
    var density: Number
    var mineralAmount: Number
    var mineralType: T
    var id: String
    var ticksToRegeneration: Number

    companion object : MineralConstructor by definedExternally {
    }
}

external interface MineralConstructor :
    _Constructor<Mineral<dynamic /* String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ */>>,
    _ConstructorById<Mineral<dynamic /* String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ */>>

external interface Nuke : RoomObject {
    override var prototype: Nuke
    var id: String
    var launchRoomName: String
    var timeToLand: Number

    companion object : NukeConstructor by definedExternally {
    }
}

external interface NukeConstructor
external interface `T$88` {
    var pos: RoomPosition
    var range: Number
}

external interface PathFinder {
    var CostMatrix: CostMatrix
    fun search(
        origin: RoomPosition,
        goal: RoomPosition,
        opts: PathFinderOpts? = definedExternally /* null */
    ): PathFinderPath

    fun search(origin: RoomPosition, goal: `T$88`, opts: PathFinderOpts? = definedExternally /* null */): PathFinderPath
    fun search(
        origin: RoomPosition,
        goal: Array<dynamic /* RoomPosition | `T$88` */>,
        opts: PathFinderOpts? = definedExternally /* null */
    ): PathFinderPath

    fun use(isEnabled: Boolean): Nothing?

    companion object : PathFinder by definedExternally {
    }
}

external interface PathFinderPath {
    var path: Array<RoomPosition>
    var ops: Number
    var cost: Number
    var incomplete: Boolean
}

external interface PathFinderOpts {
    var plainCost: Number? get() = definedExternally; set(value) = definedExternally
    var swampCost: Number? get() = definedExternally; set(value) = definedExternally
    var flee: Boolean? get() = definedExternally; set(value) = definedExternally
    var maxOps: Number? get() = definedExternally; set(value) = definedExternally
    var maxRooms: Number? get() = definedExternally; set(value) = definedExternally
    var maxCost: Number? get() = definedExternally; set(value) = definedExternally
    var heuristicWeight: Number? get() = definedExternally; set(value) = definedExternally
    val roomCallback: ((roomName: String) -> dynamic /* Boolean | CostMatrix */)? get() = definedExternally
}

external interface CostMatrix {
    fun set(x: Number, y: Number, cost: Number): Nothing?
    fun get(x: Number, y: Number): Number
    fun clone(): CostMatrix
    fun serialize(): Array<Number>
    fun deserialize(`val`: Array<Number>): CostMatrix
}

external interface `T$89` {
    var username: String
    var id: Number
    var data: String
}

external interface RawMemory {
    var segments: Array<String>
    var foreignSegment: `T$89`
    var interShardSegment: String
    fun get(): String
    fun set(value: String): Nothing?
    fun setActiveSegments(ids: Array<Number>): Nothing?
    fun setActiveForeignSegment(username: String?, id: Number? = definedExternally /* null */): Nothing?
    fun setDefaultPublicSegment(id: Number?): Nothing?
    fun setPublicSegments(ids: Array<Number>): Nothing?

    companion object : RawMemory by definedExternally {
    }
}

external interface Resource<T : dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */> :
    RoomObject {
    override var prototype: Resource<dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */>
    var amount: Number
    var id: String
    var resourceType: T

    companion object : ResourceConstructor by definedExternally {
    }
}

external interface ResourceConstructor
external interface RoomObject {
    var prototype: RoomObject
    var pos: RoomPosition
    var room: Room?

    companion object : RoomObjectConstructor by definedExternally {
    }
}

external interface RoomObjectConstructor : _Constructor<RoomObject> {
    @nativeInvoke
    operator fun invoke(x: Number, y: Number, roomName: String): RoomObject
}

external interface `T$90` {
    var filter: ((`object`: Any?) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var algorithm: String? get() = definedExternally; set(value) = definedExternally
}

external interface `T$91` {
    var filter: dynamic /* Any | String */ get() = definedExternally; set(value) = definedExternally
    var algorithm: String? get() = definedExternally; set(value) = definedExternally
}

external interface `T$92` {
    var filter: (`object`: Any?) -> Boolean
}

external interface `T$93` {
    var filter: dynamic /* Any | String */
}

external interface `T$94` {
    var filter: dynamic /* Any | String */ get() = definedExternally; set(value) = definedExternally
}

external interface RoomPosition {
    var prototype: RoomPosition
    var roomName: String
    var x: Number
    var y: Number
    fun createConstructionSite(structureType: dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ */): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */
    fun createFlag(
        name: String? = definedExternally /* null */,
        color: Number? /* 1 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        name: String? = definedExternally /* null */,
        color: Number? /* 2 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        name: String? = definedExternally /* null */,
        color: Number? /* 3 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        name: String? = definedExternally /* null */,
        color: Number? /* 4 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        name: String? = definedExternally /* null */,
        color: Number? /* 5 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        name: String? = definedExternally /* null */,
        color: Number? /* 6 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        name: String? = definedExternally /* null */,
        color: Number? /* 7 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        name: String? = definedExternally /* null */,
        color: Number? /* 8 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        name: String? = definedExternally /* null */,
        color: Number? /* 9 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        name: String? = definedExternally /* null */,
        color: Number? /* 10 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun <K : dynamic /* Number /* 1 */ | Number /* 3 */ | Number /* 5 */ | Number /* 7 */ | Number /* 10 */ | Number /* 101 */ | Number /* 102 */ | Number /* 103 */ | Number /* 104 */ | Number /* 105 */ | Number /* 106 */ | Number /* 107 */ | Number /* 108 */ | Number /* 109 */ | Number /* 110 */ | Number /* 111 */ | Number /* 112 */ | Number /* 113 */ | Number /* 114 */ | Number /* 115 */ | Number /* 116 */ | Number /* 117 */ */> findClosestByPath(
        type: K,
        opts: FindPathOpts? /* FindPathOpts & `T$90` */ = definedExternally /* null */
    ): Any?

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> findClosestByPath(
        type: Number /* 107 */,
        opts: FindPathOpts? /* FindPathOpts & `T$90` */ = definedExternally /* null */
    ): T

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> findClosestByPath(
        type: Number /* 108 */,
        opts: FindPathOpts? /* FindPathOpts & `T$90` */ = definedExternally /* null */
    ): T

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> findClosestByPath(
        type: Number /* 109 */,
        opts: FindPathOpts? /* FindPathOpts & `T$90` */ = definedExternally /* null */
    ): T

    fun <T : dynamic /* RoomPosition | _HasRoomPosition */> findClosestByPath(
        objects: Array<T>,
        opts: FindPathOpts? /* FindPathOpts & `T$91` */ = definedExternally /* null */
    ): T

    fun <K : dynamic /* Number /* 1 */ | Number /* 3 */ | Number /* 5 */ | Number /* 7 */ | Number /* 10 */ | Number /* 101 */ | Number /* 102 */ | Number /* 103 */ | Number /* 104 */ | Number /* 105 */ | Number /* 106 */ | Number /* 107 */ | Number /* 108 */ | Number /* 109 */ | Number /* 110 */ | Number /* 111 */ | Number /* 112 */ | Number /* 113 */ | Number /* 114 */ | Number /* 115 */ | Number /* 116 */ | Number /* 117 */ */> findClosestByRange(
        type: K,
        opts: `T$92`? = definedExternally /* null */
    ): Any?

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> findClosestByRange(
        type: Number /* 107 */,
        opts: `T$92`? = definedExternally /* null */
    ): T

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> findClosestByRange(
        type: Number /* 108 */,
        opts: `T$92`? = definedExternally /* null */
    ): T

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> findClosestByRange(
        type: Number /* 109 */,
        opts: `T$92`? = definedExternally /* null */
    ): T

    fun <T : dynamic /* RoomPosition | _HasRoomPosition */> findClosestByRange(
        objects: Array<T>,
        opts: `T$93`? = definedExternally /* null */
    ): T

    fun <K : dynamic /* Number /* 1 */ | Number /* 3 */ | Number /* 5 */ | Number /* 7 */ | Number /* 10 */ | Number /* 101 */ | Number /* 102 */ | Number /* 103 */ | Number /* 104 */ | Number /* 105 */ | Number /* 106 */ | Number /* 107 */ | Number /* 108 */ | Number /* 109 */ | Number /* 110 */ | Number /* 111 */ | Number /* 112 */ | Number /* 113 */ | Number /* 114 */ | Number /* 115 */ | Number /* 116 */ | Number /* 117 */ */> findInRange(
        type: K,
        range: Number,
        opts: `T$93`? = definedExternally /* null */
    ): Array<Any?>

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> findInRange(
        type: Number /* 107 */,
        range: Number,
        opts: `T$92`? = definedExternally /* null */
    ): Array<T>

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> findInRange(
        type: Number /* 108 */,
        range: Number,
        opts: `T$92`? = definedExternally /* null */
    ): Array<T>

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> findInRange(
        type: Number /* 109 */,
        range: Number,
        opts: `T$92`? = definedExternally /* null */
    ): Array<T>

    fun <T : dynamic /* RoomPosition | _HasRoomPosition */> findInRange(
        objects: Array<T>,
        range: Number,
        opts: `T$94`? = definedExternally /* null */
    ): Array<T>

    fun findPathTo(x: Number, y: Number, opts: FindPathOpts? = definedExternally /* null */): Array<PathStep>
    fun findPathTo(target: RoomPosition, opts: FindPathOpts? = definedExternally /* null */): Array<PathStep>
    fun findPathTo(target: _HasRoomPosition, opts: FindPathOpts? = definedExternally /* null */): Array<PathStep>
    fun getDirectionTo(
        x: Number,
        y: Number
    ): dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ */

    fun getDirectionTo(target: RoomPosition): dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ */
    fun getDirectionTo(target: _HasRoomPosition): dynamic /* Number /* 1 */ | Number /* 2 */ | Number /* 3 */ | Number /* 4 */ | Number /* 5 */ | Number /* 6 */ | Number /* 7 */ | Number /* 8 */ */
    fun getRangeTo(x: Number, y: Number): Number
    fun getRangeTo(target: RoomPosition): Number
    fun getRangeTo(target: `T$72`): Number
    fun inRangeTo(x: Number, y: Number, range: Number): Boolean
    fun inRangeTo(target: RoomPosition, range: Number): Boolean
    fun inRangeTo(target: `T$72`, range: Number): Boolean
    fun isEqualTo(x: Number, y: Number): Boolean
    fun isEqualTo(target: RoomPosition): Boolean
    fun isEqualTo(target: `T$72`): Boolean
    fun isNearTo(x: Number, y: Number): Boolean
    fun isNearTo(target: RoomPosition): Boolean
    fun isNearTo(target: `T$72`): Boolean
    fun look(): Array<Any? /* Any? & `T$79` */>
    fun <T : dynamic /* String /* "creep" */ | String /* "source" */ | String /* "energy" */ | String /* "resource" */ | String /* "mineral" */ | String /* "structure" */ | String /* "flag" */ | String /* "constructionSite" */ | String /* "nuke" */ | String /* "terrain" */ | String /* "exit" */ */> lookFor(
        type: T
    ): Array<Any?>

    companion object : RoomPositionConstructor by definedExternally {
    }

    fun createFlag(): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */
}

external interface RoomPositionConstructor : _Constructor<RoomPosition> {
    @nativeInvoke
    operator fun invoke(x: Number, y: Number, roomName: String): RoomPosition
}

external open class RoomVisual(roomName: String? = definedExternally /* null */) {
    open var roomName: String = definedExternally
    open fun line(
        x1: Number,
        y1: Number,
        x2: Number,
        y2: Number,
        style: LineStyle? = definedExternally /* null */
    ): RoomVisual = definedExternally

    open fun line(
        pos1: RoomPosition,
        pos2: RoomPosition,
        style: LineStyle? = definedExternally /* null */
    ): RoomVisual = definedExternally

    open fun circle(x: Number, y: Number, style: CircleStyle? = definedExternally /* null */): RoomVisual =
        definedExternally

    open fun circle(pos: RoomPosition, style: CircleStyle? = definedExternally /* null */): RoomVisual =
        definedExternally

    open fun rect(
        x: Number,
        y: Number,
        w: Number,
        h: Number,
        style: PolyStyle? = definedExternally /* null */
    ): RoomVisual = definedExternally

    open fun rect(
        topLeftPos: RoomPosition,
        width: Number,
        height: Number,
        style: PolyStyle? = definedExternally /* null */
    ): RoomVisual = definedExternally

    open fun poly(
        points: Array<dynamic /* RoomPosition | dynamic /* JsTuple<Number, Number> */ */>,
        style: PolyStyle? = definedExternally /* null */
    ): RoomVisual = definedExternally

    open fun text(text: String, x: Number, y: Number, style: TextStyle? = definedExternally /* null */): RoomVisual =
        definedExternally

    open fun text(text: String, pos: RoomPosition, style: TextStyle? = definedExternally /* null */): RoomVisual =
        definedExternally

    open fun clear(): RoomVisual = definedExternally
    open fun getSize(): Number = definedExternally
}

external interface LineStyle {
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var color: String? get() = definedExternally; set(value) = definedExternally
    var opacity: Number? get() = definedExternally; set(value) = definedExternally
    var lineStyle: dynamic /* String /* "dashed" */ | String /* "dotted" */ */ get() = definedExternally; set(value) = definedExternally
}

external interface PolyStyle {
    var fill: String? get() = definedExternally; set(value) = definedExternally
    var opacity: Number? get() = definedExternally; set(value) = definedExternally
    var stroke: String? get() = definedExternally; set(value) = definedExternally
    var strokeWidth: Number? get() = definedExternally; set(value) = definedExternally
    var lineStyle: dynamic /* String /* "dashed" */ | String /* "dotted" */ */ get() = definedExternally; set(value) = definedExternally
}

external interface CircleStyle : PolyStyle {
    var radius: Number? get() = definedExternally; set(value) = definedExternally
}

external interface TextStyle {
    var color: String? get() = definedExternally; set(value) = definedExternally
    var font: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var stroke: String? get() = definedExternally; set(value) = definedExternally
    var strokeWidth: Number? get() = definedExternally; set(value) = definedExternally
    var backgroundColor: String? get() = definedExternally; set(value) = definedExternally
    var backgroundPadding: Number? get() = definedExternally; set(value) = definedExternally
    var align: dynamic /* String /* "center" */ | String /* "left" */ | String /* "right" */ */ get() = definedExternally; set(value) = definedExternally
    var opacity: Number? get() = definedExternally; set(value) = definedExternally
}

external interface `T$95` {
    var x: Number
    var y: Number
}

external interface Room {
    var prototype: Room
    var controller: StructureController? get() = definedExternally; set(value) = definedExternally
    var energyAvailable: Number
    var energyCapacityAvailable: Number
    var memory: RoomMemory
    var mode: String
    var name: String
    var storage: StructureStorage? get() = definedExternally; set(value) = definedExternally
    var terminal: StructureTerminal? get() = definedExternally; set(value) = definedExternally
    var visual: RoomVisual
    fun createConstructionSite(
        x: Number,
        y: Number,
        structureType: dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createConstructionSite(
        pos: RoomPosition,
        structureType: dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createConstructionSite(
        pos: _HasRoomPosition,
        structureType: dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        x: Number,
        y: Number,
        name: String? = definedExternally /* null */,
        color: Number? /* 1 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        x: Number,
        y: Number,
        name: String? = definedExternally /* null */,
        color: Number? /* 2 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        x: Number,
        y: Number,
        name: String? = definedExternally /* null */,
        color: Number? /* 3 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        x: Number,
        y: Number,
        name: String? = definedExternally /* null */,
        color: Number? /* 4 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        x: Number,
        y: Number,
        name: String? = definedExternally /* null */,
        color: Number? /* 5 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        x: Number,
        y: Number,
        name: String? = definedExternally /* null */,
        color: Number? /* 6 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        x: Number,
        y: Number,
        name: String? = definedExternally /* null */,
        color: Number? /* 7 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        x: Number,
        y: Number,
        name: String? = definedExternally /* null */,
        color: Number? /* 8 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        x: Number,
        y: Number,
        name: String? = definedExternally /* null */,
        color: Number? /* 9 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        x: Number,
        y: Number,
        name: String? = definedExternally /* null */,
        color: Number? /* 10 */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        pos: RoomPosition,
        name: String? = definedExternally /* null */,
        color: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createFlag(
        pos: `T$72`,
        name: String? = definedExternally /* null */,
        color: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */,
        secondaryColor: dynamic /* Number? /* 1 */ | Number? /* 2 */ | Number? /* 3 */ | Number? /* 4 */ | Number? /* 5 */ | Number? /* 6 */ | Number? /* 7 */ | Number? /* 8 */ | Number? /* 9 */ | Number? /* 10 */ */ = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun <K : dynamic /* Number /* 1 */ | Number /* 3 */ | Number /* 5 */ | Number /* 7 */ | Number /* 10 */ | Number /* 101 */ | Number /* 102 */ | Number /* 103 */ | Number /* 104 */ | Number /* 105 */ | Number /* 106 */ | Number /* 107 */ | Number /* 108 */ | Number /* 109 */ | Number /* 110 */ | Number /* 111 */ | Number /* 112 */ | Number /* 113 */ | Number /* 114 */ | Number /* 115 */ | Number /* 116 */ | Number /* 117 */ */> find(
        type: K,
        opts: String? = definedExternally /* null */
    ): Array<Any?>

    fun <K : dynamic /* Number /* 1 */ | Number /* 3 */ | Number /* 5 */ | Number /* 7 */ | Number /* 10 */ | Number /* 101 */ | Number /* 102 */ | Number /* 103 */ | Number /* 104 */ | Number /* 105 */ | Number /* 106 */ | Number /* 107 */ | Number /* 108 */ | Number /* 109 */ | Number /* 110 */ | Number /* 111 */ | Number /* 112 */ | Number /* 113 */ | Number /* 114 */ | Number /* 115 */ | Number /* 116 */ | Number /* 117 */ */> find(
        type: K,
        opts: ((`object`: Any?) -> Boolean)? = definedExternally /* null */
    ): Array<Any?>

    fun <K : dynamic /* Number /* 1 */ | Number /* 3 */ | Number /* 5 */ | Number /* 7 */ | Number /* 10 */ | Number /* 101 */ | Number /* 102 */ | Number /* 103 */ | Number /* 104 */ | Number /* 105 */ | Number /* 106 */ | Number /* 107 */ | Number /* 108 */ | Number /* 109 */ | Number /* 110 */ | Number /* 111 */ | Number /* 112 */ | Number /* 113 */ | Number /* 114 */ | Number /* 115 */ | Number /* 116 */ | Number /* 117 */ */> find(
        type: K,
        opts: `T$92`? = definedExternally /* null */
    ): Array<Any?>

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> find(
        type: Number /* 107 */,
        opts: String? = definedExternally /* null */
    ): Array<T>

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> find(
        type: Number /* 107 */,
        opts: ((`object`: Any?) -> Boolean)? = definedExternally /* null */
    ): Array<T>

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> find(
        type: Number /* 107 */,
        opts: `T$92`? = definedExternally /* null */
    ): Array<T>

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> find(
        type: Number /* 108 */,
        opts: String? = definedExternally /* null */
    ): Array<T>

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> find(
        type: Number /* 108 */,
        opts: ((`object`: Any?) -> Boolean)? = definedExternally /* null */
    ): Array<T>

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> find(
        type: Number /* 108 */,
        opts: `T$92`? = definedExternally /* null */
    ): Array<T>

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> find(
        type: Number /* 109 */,
        opts: String? = definedExternally /* null */
    ): Array<T>

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> find(
        type: Number /* 109 */,
        opts: ((`object`: Any?) -> Boolean)? = definedExternally /* null */
    ): Array<T>

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> find(
        type: Number /* 109 */,
        opts: `T$92`? = definedExternally /* null */
    ): Array<T>

    fun findExitTo(room: String): dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* -1 */ | Number /* -2 */ | Number /* 3 */ | Number /* -3 */ | Number /* -4 */ | Number /* 5 */ | Number /* -5 */ | Number /* -6 */ | Number /* 7 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */
    fun findExitTo(room: Room): dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* -1 */ | Number /* -2 */ | Number /* 3 */ | Number /* -3 */ | Number /* -4 */ | Number /* 5 */ | Number /* -5 */ | Number /* -6 */ | Number /* 7 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */
    fun findPath(
        fromPos: RoomPosition,
        toPos: RoomPosition,
        opts: FindPathOpts? = definedExternally /* null */
    ): Array<PathStep>

    fun getPositionAt(x: Number, y: Number): RoomPosition?
    fun lookAt(x: Number, y: Number): Array<Any? /* Any? & `T$79` */>
    fun lookAt(target: RoomPosition): Array<Any? /* Any? & `T$79` */>
    fun lookAt(target: `T$72`): Array<Any? /* Any? & `T$79` */>
    fun lookAtArea(
        top: Number,
        left: Number,
        bottom: Number,
        right: Number,
        asArray: Boolean? = definedExternally /* null */
    ): dynamic /* LookAtResultMatrix<dynamic /* String /* "creep" */ | String /* "source" */ | String /* "energy" */ | String /* "resource" */ | String /* "mineral" */ | String /* "structure" */ | String /* "flag" */ | String /* "constructionSite" */ | String /* "nuke" */ | String /* "terrain" */ */> | Array<Any? /* Any? & `T$79` & `T$95` */> */

    fun <T : dynamic /* String /* "creep" */ | String /* "source" */ | String /* "energy" */ | String /* "resource" */ | String /* "mineral" */ | String /* "structure" */ | String /* "flag" */ | String /* "constructionSite" */ | String /* "nuke" */ | String /* "terrain" */ | String /* "exit" */ */> lookForAt(
        type: T,
        x: Number,
        y: Number
    ): Array<Any?>

    fun <T : dynamic /* String /* "creep" */ | String /* "source" */ | String /* "energy" */ | String /* "resource" */ | String /* "mineral" */ | String /* "structure" */ | String /* "flag" */ | String /* "constructionSite" */ | String /* "nuke" */ | String /* "terrain" */ | String /* "exit" */ */> lookForAt(
        type: T,
        target: RoomPosition
    ): Array<Any?>

    fun <T : dynamic /* String /* "creep" */ | String /* "source" */ | String /* "energy" */ | String /* "resource" */ | String /* "mineral" */ | String /* "structure" */ | String /* "flag" */ | String /* "constructionSite" */ | String /* "nuke" */ | String /* "terrain" */ | String /* "exit" */ */> lookForAt(
        type: T,
        target: _HasRoomPosition
    ): Array<Any?>

    fun <T : dynamic /* String /* "creep" */ | String /* "source" */ | String /* "energy" */ | String /* "resource" */ | String /* "mineral" */ | String /* "structure" */ | String /* "flag" */ | String /* "constructionSite" */ | String /* "nuke" */ | String /* "terrain" */ | String /* "exit" */ */> lookForAtArea(
        type: T,
        top: Number,
        left: Number,
        bottom: Number,
        right: Number,
        asArray: Boolean? = definedExternally /* null */
    ): LookForAtAreaResultMatrix<Any?, T>

    fun <T : dynamic /* String /* "creep" */ | String /* "source" */ | String /* "energy" */ | String /* "resource" */ | String /* "mineral" */ | String /* "structure" */ | String /* "flag" */ | String /* "constructionSite" */ | String /* "nuke" */ | String /* "terrain" */ | String /* "exit" */ */> lookForAtArea(
        type: T,
        top: Number,
        left: Number,
        bottom: Number,
        right: Number,
        asArray: Boolean
    ): Array<`T$79` /* `T$79` & Any? & `T$95` */>

    companion object : RoomConstructor by definedExternally {
    }

    fun createFlag(
        x: Number,
        y: Number
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun <K : dynamic /* Number /* 1 */ | Number /* 3 */ | Number /* 5 */ | Number /* 7 */ | Number /* 10 */ | Number /* 101 */ | Number /* 102 */ | Number /* 103 */ | Number /* 104 */ | Number /* 105 */ | Number /* 106 */ | Number /* 107 */ | Number /* 108 */ | Number /* 109 */ | Number /* 110 */ | Number /* 111 */ | Number /* 112 */ | Number /* 113 */ | Number /* 114 */ | Number /* 115 */ | Number /* 116 */ | Number /* 117 */ */> find(
        type: K
    ): Array<Any?>

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> find(
        type: Number /* 107 */
    ): Array<T>

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> find(
        type: Number /* 108 */
    ): Array<T>

    fun <T : Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>> find(
        type: Number /* 109 */
    ): Array<T>
}

external interface RoomConstructor {
    fun serializePath(path: Array<PathStep>): String
    fun deserializePath(path: String): Array<PathStep>
}

external interface Source : RoomObject {
    override var prototype: Source
    var energy: Number
    var energyCapacity: Number
    var id: String
    override var room: Room
    var ticksToRegeneration: Number

    companion object : SourceConstructor by definedExternally {
    }
}

external interface SourceConstructor : _Constructor<Source>, _ConstructorById<Source>
external interface `T$96` {
    var name: String
    var needTime: Number
    var remainingTime: Number
}

external interface `T$97` {
    var memory: CreepMemory? get() = definedExternally; set(value) = definedExternally
    var energyStructures: Array<dynamic /* StructureSpawn | StructureExtension */>? get() = definedExternally; set(value) = definedExternally
    var dryRun: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface StructureSpawn : OwnedStructure<String /* "spawn" */> {
    override var prototype: StructureSpawn
    var energy: Number
    var energyCapacity: Number
    var memory: SpawnMemory
    var name: String
    var spawning: `T$96`
    fun canCreateCreep(
        body: Array<dynamic /* String /* "move" */ | String /* "work" */ | String /* "carry" */ | String /* "attack" */ | String /* "ranged_attack" */ | String /* "tough" */ | String /* "heal" */ | String /* "claim" */ */>,
        name: String? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun createCreep(
        body: Array<dynamic /* String /* "move" */ | String /* "work" */ | String /* "carry" */ | String /* "attack" */ | String /* "ranged_attack" */ | String /* "tough" */ | String /* "heal" */ | String /* "claim" */ */>,
        name: String? = definedExternally /* null */,
        memory: CreepMemory? = definedExternally /* null */
    ): dynamic /* String | Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun spawnCreep(
        body: Array<dynamic /* String /* "move" */ | String /* "work" */ | String /* "carry" */ | String /* "attack" */ | String /* "ranged_attack" */ | String /* "tough" */ | String /* "heal" */ | String /* "claim" */ */>,
        name: String,
        opts: `T$97`? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    override fun destroy(): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */
    override fun isActive(): Boolean
    override fun notifyWhenAttacked(enabled: Boolean): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */
    fun renewCreep(target: Creep): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */
    fun recycleCreep(target: Creep): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    companion object : StructureSpawnConstructor by definedExternally {
    }
}

external interface StructureSpawnConstructor : _Constructor<StructureSpawn>, _ConstructorById<StructureSpawn>

external var Spawn: StructureSpawnConstructor = definedExternally

external interface Structure<T : dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */> :
    RoomObject {
    override var prototype: Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>
    var hits: Number
    var hitsMax: Number
    var id: String
    override var room: Room
    var structureType: T
    fun destroy(): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */
    fun isActive(): Boolean
    fun notifyWhenAttacked(enabled: Boolean): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    companion object : StructureConstructor by definedExternally {
    }
}

external interface StructureConstructor :
    _Constructor<Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>>,
    _ConstructorById<Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>>

external interface OwnedStructure<T : dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */> :
    Structure<T> {
    override var prototype: OwnedStructure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>
    var my: Boolean
    var owner: Owner
    override var room: Room

    companion object : OwnedStructureConstructor by definedExternally {
    }
}

external interface OwnedStructureConstructor :
    _Constructor<OwnedStructure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>>,
    _ConstructorById<OwnedStructure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>>

external interface StructureController : OwnedStructure<String /* "controller" */> {
    override var prototype: StructureController
    var level: Number
    var progress: Number
    var progressTotal: Number
    var reservation: ReservationDefinition?
    var safeMode: Number? get() = definedExternally; set(value) = definedExternally
    var safeModeAvailable: Number
    var safeModeCooldown: Number? get() = definedExternally; set(value) = definedExternally
    var sign: SignDefinition?
    var ticksToDowngrade: Number
    var upgradeBlocked: Number
    fun activateSafeMode(): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */
    fun unclaim(): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    companion object : StructureControllerConstructor by definedExternally {
    }
}

external interface StructureControllerConstructor : _Constructor<StructureController>,
    _ConstructorById<StructureController>

external interface StructureExtension : OwnedStructure<String /* "extension" */> {
    override var prototype: StructureExtension
    var energy: Number
    var energyCapacity: Number

    companion object : StructureExtensionConstructor by definedExternally {
    }
}

external interface StructureExtensionConstructor : _Constructor<StructureExtension>,
    _ConstructorById<StructureExtension>

external interface StructureLink : OwnedStructure<String /* "link" */> {
    override var prototype: StructureLink
    var cooldown: Number
    var energy: Number
    var energyCapacity: Number
    fun transferEnergy(
        target: Creep,
        amount: Number? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun transferEnergy(
        target: StructureLink,
        amount: Number? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    companion object : StructureLinkConstructor by definedExternally {
    }
}

external interface StructureLinkConstructor : _Constructor<StructureLink>, _ConstructorById<StructureLink>
external interface StructureKeeperLair : OwnedStructure<String /* "keeperLair" */> {
    override var prototype: StructureKeeperLair
    var ticksToSpawn: Number? get() = definedExternally; set(value) = definedExternally

    companion object : StructureKeeperLairConstructor by definedExternally {
    }
}

external interface StructureKeeperLairConstructor : _Constructor<StructureKeeperLair>,
    _ConstructorById<StructureKeeperLair>

external interface StructureObserver : OwnedStructure<String /* "observer" */> {
    override var prototype: StructureObserver
    fun observeRoom(roomName: String): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    companion object : StructureObserverConstructor by definedExternally {
    }
}

external interface StructureObserverConstructor : _Constructor<StructureObserver>, _ConstructorById<StructureObserver>
external interface StructurePowerBank : OwnedStructure<String /* "powerBank" */> {
    override var prototype: StructurePowerBank
    var power: Number
    var ticksToDecay: Number

    companion object : StructurePowerBankConstructor by definedExternally {
    }
}

external interface StructurePowerBankConstructor : _Constructor<StructurePowerBank>,
    _ConstructorById<StructurePowerBank>

external interface StructurePowerSpawn : OwnedStructure<String /* "powerSpawn" */> {
    override var prototype: StructurePowerSpawn
    var energy: Number
    var energyCapacity: Number
    var power: Number
    var powerCapacity: Number
    fun createPowerCreep(name: String): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */
    fun processPower(): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    companion object : StructurePowerSpawnConstructor by definedExternally {
    }
}

external interface StructurePowerSpawnConstructor : _Constructor<StructurePowerSpawn>,
    _ConstructorById<StructurePowerSpawn>

external interface StructureRampart : OwnedStructure<String /* "rampart" */> {
    override var prototype: StructureRampart
    var ticksToDecay: Number
    var isPublic: Boolean
    fun setPublic(isPublic: Boolean): Nothing?

    companion object : StructureRampartConstructor by definedExternally {
    }
}

external interface StructureRampartConstructor : _Constructor<StructureRampart>, _ConstructorById<StructureRampart>
external interface StructureRoad : Structure<String /* "road" */> {
    override var prototype: StructureRoad
    var ticksToDecay: Number

    companion object : StructureRoadConstructor by definedExternally {
    }
}

external interface StructureRoadConstructor : _Constructor<StructureRoad>, _ConstructorById<StructureRoad>
external interface StructureStorage : OwnedStructure<String /* "storage" */> {
    override var prototype: StructureStorage
    var store: Any? /* Any? & `T$71` */
    var storeCapacity: Number

    companion object : StructureStorageConstructor by definedExternally {
    }
}

external interface StructureStorageConstructor : _Constructor<StructureStorage>, _ConstructorById<StructureStorage>
external interface StructureTower : OwnedStructure<String /* "tower" */> {
    override var prototype: StructureTower
    var energy: Number
    var energyCapacity: Number
    fun attack(target: Creep): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */
    fun heal(target: Creep): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */
    fun repair(target: Structure<dynamic /* String /* "spawn" */ | String /* "constructedWall" */ | String /* "extension" */ | String /* "link" */ | String /* "storage" */ | String /* "tower" */ | String /* "observer" */ | String /* "powerSpawn" */ | String /* "powerBank" */ | String /* "lab" */ | String /* "terminal" */ | String /* "nuker" */ | String /* "rampart" */ | String /* "road" */ | String /* "extractor" */ | String /* "container" */ | String /* "keeperLair" */ | String /* "controller" */ | String /* "portal" */ */>): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    companion object : StructureTowerConstructor by definedExternally {
    }
}

external interface StructureTowerConstructor : _Constructor<StructureTower>, _ConstructorById<StructureTower>
external interface StructureWall : Structure<String /* "constructedWall" */> {
    override var prototype: StructureWall
    var ticksToLive: Number

    companion object : StructureWallConstructor by definedExternally {
    }
}

external interface StructureWallConstructor : _Constructor<StructureWall>, _ConstructorById<StructureWall>
external interface StructureExtractor : OwnedStructure<String /* "extractor" */> {
    override var prototype: StructureExtractor
    var cooldown: Number

    companion object : StructureExtractorConstructor by definedExternally {
    }
}

external interface StructureExtractorConstructor : _Constructor<StructureExtractor>,
    _ConstructorById<StructureExtractor>

external interface StructureLab : OwnedStructure<String /* "lab" */> {
    override var prototype: StructureLab
    var cooldown: Number
    var energy: Number
    var energyCapacity: Number
    var mineralAmount: Number
    var mineralType: dynamic /* String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ */
    var mineralCapacity: Number
    fun boostCreep(
        creep: Creep,
        bodyPartsCount: Number? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    fun runReaction(
        lab1: StructureLab,
        lab2: StructureLab
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    companion object : StructureLabConstructor by definedExternally {
    }
}

external interface StructureLabConstructor : _Constructor<StructureLab>, _ConstructorById<StructureLab>
external interface StructureTerminal : OwnedStructure<String /* "terminal" */> {
    override var prototype: StructureTerminal
    var cooldown: Number
    var store: Any? /* Any? & `T$71` */
    var storeCapacity: Number
    fun send(
        resourceType: dynamic /* String /* "energy" */ | String /* "power" */ | String /* "U" */ | String /* "L" */ | String /* "K" */ | String /* "G" */ | String /* "Z" */ | String /* "O" */ | String /* "H" */ | String /* "X" */ | String /* "OH" */ | String /* "ZK" */ | String /* "UL" */ | String /* "UH" */ | String /* "UO" */ | String /* "KH" */ | String /* "KO" */ | String /* "LH" */ | String /* "LO" */ | String /* "ZH" */ | String /* "ZO" */ | String /* "GH" */ | String /* "GO" */ | String /* "UH2O" */ | String /* "UHO2" */ | String /* "KH2O" */ | String /* "KHO2" */ | String /* "LH2O" */ | String /* "LHO2" */ | String /* "ZH2O" */ | String /* "ZHO2" */ | String /* "GH2O" */ | String /* "GHO2" */ | String /* "XUH2O" */ | String /* "XUHO2" */ | String /* "XKH2O" */ | String /* "XKHO2" */ | String /* "XLH2O" */ | String /* "XLHO2" */ | String /* "XZH2O" */ | String /* "ZXHO2" */ | String /* "XGH2O" */ | String /* "XGHO2" */ */,
        amount: Number,
        destination: String,
        description: String? = definedExternally /* null */
    ): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    companion object : StructureTerminalConstructor by definedExternally {
    }
}

external interface StructureTerminalConstructor : _Constructor<StructureTerminal>, _ConstructorById<StructureTerminal>
external interface StructureContainer : Structure<String /* "container" */> {
    override var prototype: StructureContainer
    var store: Any? /* Any? & `T$71` */
    var storeCapacity: Number
    var ticksToDecay: Number

    companion object : StructureContainerConstructor by definedExternally {
    }
}

external interface StructureContainerConstructor : _Constructor<StructureContainer>,
    _ConstructorById<StructureContainer>

external interface StructureNuker : OwnedStructure<String /* "nuker" */> {
    override var prototype: StructureNuker
    var energy: Number
    var energyCapacity: Number
    var ghodium: Number
    var ghodiumCapacity: Number
    var cooldown: Number
    fun launchNuke(pos: RoomPosition): dynamic /* Number /* 0 */ | Number /* -1 */ | Number /* -2 */ | Number /* -3 */ | Number /* -4 */ | Number /* -5 */ | Number /* -6 */ | Number /* -7 */ | Number /* -8 */ | Number /* -9 */ | Number /* -10 */ | Number /* -11 */ | Number /* -12 */ | Number /* -14 */ | Number /* -15 */ */

    companion object : StructureNukerConstructor by definedExternally {
    }
}

external interface StructureNukerConstructor : _Constructor<StructureNuker>, _ConstructorById<StructureNuker>
external interface StructurePortal : Structure<String /* "portal" */> {
    override var prototype: StructurePortal
    var destination: RoomPosition
    var ticksToDecay: Number

    companion object : StructurePortalConstructor by definedExternally {
    }
}

external interface StructurePortalConstructor : _Constructor<StructurePortal>, _ConstructorById<StructurePortal>

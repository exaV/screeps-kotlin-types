@file:Suppress("unused")

package types.base.global

import types.base.JsDict
import types.base.StringDict

external interface StringConstant
external interface IntegerConstant

@Suppress("NOTHING_TO_INLINE")
inline fun StringConstant.stringValue(): String = this.asDynamic() as String

@Suppress("NOTHING_TO_INLINE")
inline fun IntegerConstant.stringValue(): String = this.toString()

@Suppress("NOTHING_TO_INLINE")
inline fun IntegerConstant.intValue(): Int = this.asDynamic() as Int

@Suppress("NOTHING_TO_INLINE")
inline fun IntegerConstant.numberValue(): Number = this.asDynamic() as Number

external interface FindConstant : IntegerConstant
external interface ScreepsReturnCode : IntegerConstant
external interface BodyPartConstant : StringConstant
external interface AcitveBodyPartConstant : BodyPartConstant
external interface StructureConstant : StringConstant
external interface BuildableStructureConstant : StructureConstant
external interface LookConstant : StringConstant
external interface DirectionConstant : IntegerConstant
external interface ResourceConstant : StringConstant
external interface MineralConstant : ResourceConstant
external interface ColorConstant : IntegerConstant
external interface DensityConstant : IntegerConstant
external interface Terrain

external val OK: ScreepsReturnCode /* 0 */ = definedExternally
external val ERR_NOT_OWNER: ScreepsReturnCode /* -1 */ = definedExternally
external val ERR_NO_PATH: ScreepsReturnCode /* -2 */ = definedExternally
external val ERR_NAME_EXISTS: ScreepsReturnCode /* -3 */ = definedExternally
external val ERR_BUSY: ScreepsReturnCode /* -4 */ = definedExternally
external val ERR_NOT_FOUND: ScreepsReturnCode /* -5 */ = definedExternally
external val ERR_NOT_ENOUGH_RESOURCES: ScreepsReturnCode /* -6 */ = definedExternally
external val ERR_NOT_ENOUGH_ENERGY: ScreepsReturnCode /* -6 */ = definedExternally
external val ERR_INVALID_TARGET: ScreepsReturnCode /* -7 */ = definedExternally
external val ERR_FULL: ScreepsReturnCode /* -8 */ = definedExternally
external val ERR_NOT_IN_RANGE: ScreepsReturnCode /* -9 */ = definedExternally
external val ERR_INVALID_ARGS: ScreepsReturnCode /* -10 */ = definedExternally
external val ERR_TIRED: ScreepsReturnCode /* -11 */ = definedExternally
external val ERR_NO_BODYPART: ScreepsReturnCode /* -12 */ = definedExternally
external val ERR_NOT_ENOUGH_EXTENSIONS: ScreepsReturnCode /* -6 */ = definedExternally
external val ERR_RCL_NOT_ENOUGH: ScreepsReturnCode /* -14 */ = definedExternally
external val ERR_GCL_NOT_ENOUGH: ScreepsReturnCode /* -15 */ = definedExternally

external val FIND_EXIT_TOP: FindConstant /* 1 */ = definedExternally
external val FIND_EXIT_RIGHT: FindConstant /* 3 */ = definedExternally
external val FIND_EXIT_BOTTOM: FindConstant /* 5 */ = definedExternally
external val FIND_EXIT_LEFT: FindConstant /* 7 */ = definedExternally
external val FIND_EXIT: FindConstant /* 10 */ = definedExternally
external val FIND_CREEPS: FindConstant /* 101 */ = definedExternally
external val FIND_MY_CREEPS: FindConstant /* 102 */ = definedExternally
external val FIND_HOSTILE_CREEPS: FindConstant /* 103 */ = definedExternally
external val FIND_SOURCES_ACTIVE: FindConstant /* 104 */ = definedExternally
external val FIND_SOURCES: FindConstant /* 105 */ = definedExternally
external val FIND_DROPPED_ENERGY: FindConstant /* -106 */ = definedExternally
external val FIND_DROPPED_RESOURCES: FindConstant /* 106 */ = definedExternally
external val FIND_STRUCTURES: FindConstant /* 107 */ = definedExternally
external val FIND_MY_STRUCTURES: FindConstant /* 108 */ = definedExternally
external val FIND_HOSTILE_STRUCTURES: FindConstant /* 109 */ = definedExternally
external val FIND_FLAGS: FindConstant /* 110 */ = definedExternally
external val FIND_CONSTRUCTION_SITES: FindConstant /* 111 */ = definedExternally
external val FIND_MY_SPAWNS: FindConstant /* 112 */ = definedExternally
external val FIND_HOSTILE_SPAWNS: FindConstant /* 113 */ = definedExternally
external val FIND_MY_CONSTRUCTION_SITES: FindConstant /* 114 */ = definedExternally
external val FIND_HOSTILE_CONSTRUCTION_SITES: FindConstant /* 115 */ = definedExternally
external val FIND_MINERALS: FindConstant /* 116 */ = definedExternally
external val FIND_NUKES: FindConstant /* 117 */ = definedExternally

external val TOP: DirectionConstant /* 1 */ = definedExternally
external val TOP_RIGHT: DirectionConstant /* 2 */ = definedExternally
external val RIGHT: DirectionConstant /* 3 */ = definedExternally
external val BOTTOM_RIGHT: DirectionConstant /* 4 */ = definedExternally
external val BOTTOM: DirectionConstant /* 5 */ = definedExternally
external val BOTTOM_LEFT: DirectionConstant /* 6 */ = definedExternally
external val LEFT: DirectionConstant /* 7 */ = definedExternally
external val TOP_LEFT: DirectionConstant /* 8 */ = definedExternally

external val COLOR_RED: ColorConstant /* 1 */ = definedExternally
external val COLOR_PURPLE: ColorConstant /* 2 */ = definedExternally
external val COLOR_BLUE: ColorConstant /* 3 */ = definedExternally
external val COLOR_CYAN: ColorConstant /* 4 */ = definedExternally
external val COLOR_GREEN: ColorConstant /* 5 */ = definedExternally
external val COLOR_YELLOW: ColorConstant /* 6 */ = definedExternally
external val COLOR_ORANGE: ColorConstant /* 7 */ = definedExternally
external val COLOR_BROWN: ColorConstant /* 8 */ = definedExternally
external val COLOR_GREY: ColorConstant /* 9 */ = definedExternally
external val COLOR_WHITE: ColorConstant /* 10 */ = definedExternally
external val COLORS_ALL: Array<ColorConstant> = definedExternally

external val STRUCTURE_EXTENSION: BuildableStructureConstant /* "extension" */ = definedExternally
external val STRUCTURE_RAMPART: BuildableStructureConstant /* "rampart" */ = definedExternally
external val STRUCTURE_ROAD: BuildableStructureConstant /* "road" */ = definedExternally
external val STRUCTURE_SPAWN: BuildableStructureConstant /* "spawn" */ = definedExternally
external val STRUCTURE_LINK: BuildableStructureConstant /* "link" */ = definedExternally
external val STRUCTURE_WALL: BuildableStructureConstant /* "constructedWall" */ = definedExternally
external val STRUCTURE_KEEPER_LAIR: StructureConstant /* "keeperLair" */ = definedExternally
external val STRUCTURE_CONTROLLER: BuildableStructureConstant /* "controller" */ = definedExternally
external val STRUCTURE_STORAGE: BuildableStructureConstant /* "carry" */ = definedExternally
external val STRUCTURE_TOWER: BuildableStructureConstant /* "tower" */ = definedExternally
external val STRUCTURE_OBSERVER: BuildableStructureConstant /* "observer" */ = definedExternally
external val STRUCTURE_POWER_BANK: StructureConstant /* "powerBank" */ = definedExternally
external val STRUCTURE_POWER_SPAWN: BuildableStructureConstant /* "powerSpawn" */ = definedExternally
external val STRUCTURE_EXTRACTOR: BuildableStructureConstant /* "extractor" */ = definedExternally
external val STRUCTURE_LAB: BuildableStructureConstant /* "lab" */ = definedExternally
external val STRUCTURE_TERMINAL: BuildableStructureConstant /* "terminal" */ = definedExternally
external val STRUCTURE_CONTAINER: BuildableStructureConstant /* "container" */ = definedExternally
external val STRUCTURE_NUKER: BuildableStructureConstant /* "nuker" */ = definedExternally
external val STRUCTURE_PORTAL: StructureConstant /* "portal" */ = definedExternally
external val CONSTRUCTION_COST: StringDict<Int> = definedExternally
external val CONSTRUCTION_COST_ROAD_SWAMP_RATIO: Number /* 5 */ = definedExternally

external val RESOURCE_ENERGY: ResourceConstant /* "energy" */ = definedExternally
external val RESOURCE_POWER: ResourceConstant /* "power" */ = definedExternally
external val RESOURCE_UTRIUM: MineralConstant /* "U" */ = definedExternally
external val RESOURCE_LEMERGIUM: MineralConstant /* "L" */ = definedExternally
external val RESOURCE_KEANIUM: MineralConstant /* "K" */ = definedExternally
external val RESOURCE_GHODIUM: MineralConstant /* "G" */ = definedExternally
external val RESOURCE_ZYNTHIUM: MineralConstant /* "Z" */ = definedExternally
external val RESOURCE_OXYGEN: MineralConstant /* "O" */ = definedExternally
external val RESOURCE_HYDROGEN: MineralConstant /* "H" */ = definedExternally
external val RESOURCE_CATALYST: MineralConstant /* "X" */ = definedExternally

external val RESOURCE_HYDROXIDE: ResourceConstant /* "OH" */ = definedExternally
external val RESOURCE_ZYNTHIUM_KEANITE: ResourceConstant /* "ZK" */ = definedExternally
external val RESOURCE_UTRIUM_LEMERGITE: ResourceConstant /* "UL" */ = definedExternally
external val RESOURCE_UTRIUM_HYDRIDE: ResourceConstant /* "UH" */ = definedExternally
external val RESOURCE_UTRIUM_OXIDE: ResourceConstant /* "UO" */ = definedExternally
external val RESOURCE_KEANIUM_HYDRIDE: ResourceConstant /* "KH" */ = definedExternally
external val RESOURCE_KEANIUM_OXIDE: ResourceConstant /* "KO" */ = definedExternally
external val RESOURCE_LEMERGIUM_HYDRIDE: ResourceConstant /* "LH" */ = definedExternally
external val RESOURCE_LEMERGIUM_OXIDE: ResourceConstant /* "LO" */ = definedExternally
external val RESOURCE_ZYNTHIUM_HYDRIDE: ResourceConstant /* "ZH" */ = definedExternally
external val RESOURCE_ZYNTHIUM_OXIDE: ResourceConstant /* "ZO" */ = definedExternally
external val RESOURCE_GHODIUM_HYDRIDE: ResourceConstant /* "GH" */ = definedExternally
external val RESOURCE_GHODIUM_OXIDE: ResourceConstant /* "GO" */ = definedExternally
external val RESOURCE_UTRIUM_ACID: ResourceConstant /* "UH2O" */ = definedExternally
external val RESOURCE_UTRIUM_ALKALIDE: ResourceConstant /* "UHO2" */ = definedExternally
external val RESOURCE_KEANIUM_ACID: ResourceConstant /* "KH2O" */ = definedExternally
external val RESOURCE_KEANIUM_ALKALIDE: ResourceConstant /* "KHO2" */ = definedExternally
external val RESOURCE_LEMERGIUM_ACID: ResourceConstant /* "LH2O" */ = definedExternally
external val RESOURCE_LEMERGIUM_ALKALIDE: ResourceConstant /* "LHO2" */ = definedExternally
external val RESOURCE_ZYNTHIUM_ACID: ResourceConstant /* "ZH2O" */ = definedExternally
external val RESOURCE_ZYNTHIUM_ALKALIDE: ResourceConstant /* "ZHO2" */ = definedExternally
external val RESOURCE_GHODIUM_ACID: ResourceConstant /* "GH2O" */ = definedExternally
external val RESOURCE_GHODIUM_ALKALIDE: ResourceConstant /* "GHO2" */ = definedExternally
external val RESOURCE_CATALYZED_UTRIUM_ACID: ResourceConstant /* "XUH2O" */ = definedExternally
external val RESOURCE_CATALYZED_UTRIUM_ALKALIDE: ResourceConstant /* "XUHO2" */ = definedExternally
external val RESOURCE_CATALYZED_KEANIUM_ACID: ResourceConstant /* "XKH2O" */ = definedExternally
external val RESOURCE_CATALYZED_KEANIUM_ALKALIDE: ResourceConstant /* "XKHO2" */ = definedExternally
external val RESOURCE_CATALYZED_LEMERGIUM_ACID: ResourceConstant /* "XLH2O" */ = definedExternally
external val RESOURCE_CATALYZED_LEMERGIUM_ALKALIDE: ResourceConstant /* "XLHO2" */ = definedExternally
external val RESOURCE_CATALYZED_ZYNTHIUM_ACID: ResourceConstant /* "XZH2O" */ = definedExternally
external val RESOURCE_CATALYZED_ZYNTHIUM_ALKALIDE: ResourceConstant /* "ZXHO2" */ = definedExternally
external val RESOURCE_CATALYZED_GHODIUM_ACID: ResourceConstant /* "XGH2O" */ = definedExternally
external val RESOURCE_CATALYZED_GHODIUM_ALKALIDE: ResourceConstant /* "XGHO2" */ = definedExternally

external val LOOK_CREEPS: LookConstant = definedExternally
external val LOOK_ENERGY: LookConstant = definedExternally
external val LOOK_RESOURCES: LookConstant = definedExternally
external val LOOK_SOURCES: LookConstant = definedExternally
external val LOOK_MINERALS: LookConstant = definedExternally
external val LOOK_STRUCTURES: LookConstant = definedExternally
external val LOOK_FLAGS: LookConstant = definedExternally
external val LOOK_CONSTRUCTION_SITES: LookConstant = definedExternally
external val LOOK_NUKES: LookConstant = definedExternally
external val LOOK_TERRAIN: LookConstant = definedExternally
external val LOOK_TOMBSTONES: LookConstant = definedExternally

external val WORK: AcitveBodyPartConstant = definedExternally
external val CARRY: AcitveBodyPartConstant = definedExternally
external val MOVE: AcitveBodyPartConstant = definedExternally
external val ATTACK: AcitveBodyPartConstant = definedExternally
external val RANGED_ATTACK: AcitveBodyPartConstant = definedExternally
external val TOUGH: AcitveBodyPartConstant = definedExternally
external val HEAL: AcitveBodyPartConstant = definedExternally
external val CLAIM: BodyPartConstant = definedExternally
external val BODYPART_COST: StringDict<Int> = definedExternally


external var CREEP_SPAWN_TIME: Number /* 3 */ = definedExternally
external var CREEP_LIFE_TIME: Number /* 1500 */ = definedExternally
external var CREEP_CLAIM_LIFE_TIME: Number /* 500 */ = definedExternally
external var CREEP_CORPSE_RATE: Number /* 0.2 */ = definedExternally
external var OBSTACLE_OBJECT_TYPES: dynamic = definedExternally
external val ENERGY_REGEN_TIME: Number /* 300 */ = definedExternally
external val ENERGY_DECAY: Number /* 1000 */ = definedExternally
external val REPAIR_COST: Number /* 0.01 */ = definedExternally
external val RAMPART_DECAY_AMOUNT: Number /* 300 */ = definedExternally
external val RAMPART_DECAY_TIME: Number /* 100 */ = definedExternally
external val RAMPART_HITS: Number /* 1 */ = definedExternally
external val ROAD_HITS: Number /* 5000 */ = definedExternally
external val ROAD_WEAROUT: Number /* 1 */ = definedExternally
external val ROAD_DECAY_AMOUNT: Number /* 100 */ = definedExternally
external val ROAD_DECAY_TIME: Number /* 1000 */ = definedExternally
external val LINK_HITS: Number /* 1000 */ = definedExternally
external val LINK_HITS_MAX: Number /* 1000 */ = definedExternally
external val LINK_CAPACITY: Number /* 800 */ = definedExternally
external val LINK_COOLDOWN: Number /* 1 */ = definedExternally
external val LINK_LOSS_RATIO: Number /* 0.03 */ = definedExternally
external val STORAGE_CAPACITY: Number /* 1000000 */ = definedExternally
external val STORAGE_HITS: Number /* 10000 */ = definedExternally
external val BODYPARTS_ALL: Array<BodyPartConstant> = definedExternally
external val CARRY_CAPACITY: Number /* 50 */ = definedExternally
external val HARVEST_POWER: Number /* 2 */ = definedExternally
external val HARVEST_MINERAL_POWER: Number /* 1 */ = definedExternally
external val REPAIR_POWER: Number /* 100 */ = definedExternally
external val DISMANTLE_POWER: Number /* 50 */ = definedExternally
external val BUILD_POWER: Number /* 5 */ = definedExternally
external val ATTACK_POWER: Number /* 30 */ = definedExternally
external val UPGRADE_CONTROLLER_POWER: Number /* 1 */ = definedExternally
external val RANGED_ATTACK_POWER: Number /* 10 */ = definedExternally
external val HEAL_POWER: Number /* 12 */ = definedExternally
external val RANGED_HEAL_POWER: Number /* 4 */ = definedExternally
external val DISMANTLE_COST: Number /* 0.005 */ = definedExternally


external val SYSTEM_USERNAME: String = definedExternally
external val SIGN_NOVICE_AREA: String = definedExternally
external val SIGN_RESPAWN_AREA: String = definedExternally

external val SOURCE_ENERGY_CAPACITY: Int = definedExternally
external val SOURCE_ENERGY_NEUTRAL_CAPACITY: Int = definedExternally
external val SOURCE_ENERGY_KEEPER_CAPACITY: Int = definedExternally

external val MINERAL_REGEN_TIME: Int = definedExternally
external val MINERAL_DENSITY_CHANGE: Double = definedExternally
external val MINERAL_MIN_AMOUNT: JsDict<MineralConstant, Int>
external val MINERAL_RANDOM_FACTOR: Double = definedExternally
external val MINERAL_DENSITY: JsDict<DensityConstant, Int>
external val MINERAL_DENSITY_PROBABILITY: JsDict<DensityConstant, Double>
external val DENSITY_LOW: DensityConstant = definedExternally
external val DENSITY_MODERATE: DensityConstant = definedExternally
external val DENSITY_HIGH: DensityConstant = definedExternally
external val DENSITY_ULTRA: DensityConstant = definedExternally

external val NUKER_HITS: Int = definedExternally
external val NUKER_COOLDOWN: Int = definedExternally
external val NUKER_ENERGY_CAPACITY: Int = definedExternally
external val NUKER_GHODIUM_CAPACITY: Int = definedExternally
external val NUKE_LAND_TIME: Int = definedExternally
external val NUKE_RANGE: Int = definedExternally
external val NUKE_DAMAGE: JsDict<Int, Int> = definedExternally

external val CONTROLLER_DOWNGRADE: JsDict<Int, Int>
external val CONTROLLER_DOWNGRADE_RESTORE: Int = definedExternally
external val CONTROLLER_DOWNGRADE_SAFEMODE_THRESHOLD: Int = definedExternally
external val CONTROLLER_CLAIM_DOWNGRADE: Int = definedExternally
external val CONTROLLER_RESERVE: Int = definedExternally
external val CONTROLLER_RESERVE_MAX: Int = definedExternally
external val CONTROLLER_MAX_UPGRADE_PER_TICK: Int = definedExternally
external val CONTROLLER_ATTACK_BLOCKED_UPGRADE: Int = definedExternally
external val CONTROLLER_NUKE_BLOCKED_UPGRADE: Int = definedExternally

external val SAFE_MODE_DURATION: Int = definedExternally
external val SAFE_MODE_COOLDOWN: Int = definedExternally
external val SAFE_MODE_COST: Int = definedExternally
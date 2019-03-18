@file:Suppress("unused")

package screeps.api

import screeps.api.structures.Structure
import screeps.api.structures.StructureSpawn

external interface Constant<T>

inline val <T> Constant<T>.value: T get() = this.asDynamic().unsafeCast<T>()

typealias StringConstant = Constant<String>
typealias IntConstant = Constant<Int>

external interface FindConstant<T> : IntConstant
external interface ExitConstant : FindConstant<RoomPosition>
external interface ScreepsReturnCode : IntConstant
external interface BodyPartConstant : StringConstant
external interface ActiveBodyPartConstant : BodyPartConstant
external interface StructureConstant : StringConstant
external interface BuildableStructureConstant : StructureConstant
external interface LookConstant<T> : StringConstant
external interface DirectionConstant : IntConstant
external interface TradableConstant : StringConstant
external interface ResourceConstant : TradableConstant
external interface MineralConstant : ResourceConstant
external interface ColorConstant : IntConstant
external interface DensityConstant : IntConstant
external interface OrderConstant : StringConstant

external val OK: ScreepsReturnCode
external val ERR_NOT_OWNER: ScreepsReturnCode
external val ERR_NO_PATH: ScreepsReturnCode
external val ERR_NAME_EXISTS: ScreepsReturnCode
external val ERR_BUSY: ScreepsReturnCode
external val ERR_NOT_FOUND: ScreepsReturnCode
external val ERR_NOT_ENOUGH_RESOURCES: ScreepsReturnCode
external val ERR_NOT_ENOUGH_ENERGY: ScreepsReturnCode
external val ERR_INVALID_TARGET: ScreepsReturnCode
external val ERR_FULL: ScreepsReturnCode
external val ERR_NOT_IN_RANGE: ScreepsReturnCode
external val ERR_INVALID_ARGS: ScreepsReturnCode
external val ERR_TIRED: ScreepsReturnCode
external val ERR_NO_BODYPART: ScreepsReturnCode
external val ERR_NOT_ENOUGH_EXTENSIONS: ScreepsReturnCode
external val ERR_RCL_NOT_ENOUGH: ScreepsReturnCode
external val ERR_GCL_NOT_ENOUGH: ScreepsReturnCode

external val FIND_EXIT_TOP: ExitConstant
external val FIND_EXIT_RIGHT: ExitConstant
external val FIND_EXIT_BOTTOM: ExitConstant
external val FIND_EXIT_LEFT: ExitConstant
external val FIND_EXIT: FindConstant<RoomPosition>
external val FIND_CREEPS: FindConstant<Creep>
external val FIND_MY_CREEPS: FindConstant<Creep>
external val FIND_HOSTILE_CREEPS: FindConstant<Creep>
external val FIND_SOURCES_ACTIVE: FindConstant<Source>
external val FIND_SOURCES: FindConstant<Source>
external val FIND_DROPPED_ENERGY: FindConstant<Resource>
external val FIND_DROPPED_RESOURCES: FindConstant<Resource>
external val FIND_STRUCTURES: FindConstant<Structure>
external val FIND_MY_STRUCTURES: FindConstant<Structure>
external val FIND_HOSTILE_STRUCTURES: FindConstant<Structure>
external val FIND_FLAGS: FindConstant<Flag>
external val FIND_CONSTRUCTION_SITES: FindConstant<ConstructionSite>
external val FIND_MY_SPAWNS: FindConstant<StructureSpawn>
external val FIND_HOSTILE_SPAWNS: FindConstant<StructureSpawn>
external val FIND_MY_CONSTRUCTION_SITES: FindConstant<ConstructionSite>
external val FIND_HOSTILE_CONSTRUCTION_SITES: FindConstant<ConstructionSite>
external val FIND_MINERALS: FindConstant<Mineral>
external val FIND_NUKES: FindConstant<Nuke>
external val FIND_TOMBSTONES: FindConstant<Tombstone>

external val TOP: DirectionConstant
external val TOP_RIGHT: DirectionConstant
external val RIGHT: DirectionConstant
external val BOTTOM_RIGHT: DirectionConstant
external val BOTTOM: DirectionConstant
external val BOTTOM_LEFT: DirectionConstant
external val LEFT: DirectionConstant
external val TOP_LEFT: DirectionConstant

external val COLOR_RED: ColorConstant
external val COLOR_PURPLE: ColorConstant
external val COLOR_BLUE: ColorConstant
external val COLOR_CYAN: ColorConstant
external val COLOR_GREEN: ColorConstant
external val COLOR_YELLOW: ColorConstant
external val COLOR_ORANGE: ColorConstant
external val COLOR_BROWN: ColorConstant
external val COLOR_GREY: ColorConstant
external val COLOR_WHITE: ColorConstant
external val COLORS_ALL: Array<ColorConstant>

external val STRUCTURE_EXTENSION: BuildableStructureConstant
external val STRUCTURE_RAMPART: BuildableStructureConstant
external val STRUCTURE_ROAD: BuildableStructureConstant
external val STRUCTURE_SPAWN: BuildableStructureConstant
external val STRUCTURE_LINK: BuildableStructureConstant
external val STRUCTURE_WALL: BuildableStructureConstant
external val STRUCTURE_KEEPER_LAIR: StructureConstant
external val STRUCTURE_CONTROLLER: BuildableStructureConstant
external val STRUCTURE_STORAGE: BuildableStructureConstant
external val STRUCTURE_TOWER: BuildableStructureConstant
external val STRUCTURE_OBSERVER: BuildableStructureConstant
external val STRUCTURE_POWER_BANK: StructureConstant
external val STRUCTURE_POWER_SPAWN: BuildableStructureConstant
external val STRUCTURE_EXTRACTOR: BuildableStructureConstant
external val STRUCTURE_LAB: BuildableStructureConstant
external val STRUCTURE_TERMINAL: BuildableStructureConstant
external val STRUCTURE_CONTAINER: BuildableStructureConstant
external val STRUCTURE_NUKER: BuildableStructureConstant
external val STRUCTURE_PORTAL: StructureConstant
external val CONSTRUCTION_COST: Record<String, Int>
external val CONSTRUCTION_COST_ROAD_SWAMP_RATIO: Int

external val RESOURCE_ENERGY: ResourceConstant
external val RESOURCE_POWER: ResourceConstant
external val RESOURCE_UTRIUM: MineralConstant
external val RESOURCE_LEMERGIUM: MineralConstant
external val RESOURCE_KEANIUM: MineralConstant
external val RESOURCE_GHODIUM: MineralConstant
external val RESOURCE_ZYNTHIUM: MineralConstant
external val RESOURCE_OXYGEN: MineralConstant
external val RESOURCE_HYDROGEN: MineralConstant
external val RESOURCE_CATALYST: MineralConstant

external val RESOURCE_HYDROXIDE: ResourceConstant
external val RESOURCE_ZYNTHIUM_KEANITE: ResourceConstant
external val RESOURCE_UTRIUM_LEMERGITE: ResourceConstant
external val RESOURCE_UTRIUM_HYDRIDE: ResourceConstant
external val RESOURCE_UTRIUM_OXIDE: ResourceConstant
external val RESOURCE_KEANIUM_HYDRIDE: ResourceConstant
external val RESOURCE_KEANIUM_OXIDE: ResourceConstant
external val RESOURCE_LEMERGIUM_HYDRIDE: ResourceConstant
external val RESOURCE_LEMERGIUM_OXIDE: ResourceConstant
external val RESOURCE_ZYNTHIUM_HYDRIDE: ResourceConstant
external val RESOURCE_ZYNTHIUM_OXIDE: ResourceConstant
external val RESOURCE_GHODIUM_HYDRIDE: ResourceConstant
external val RESOURCE_GHODIUM_OXIDE: ResourceConstant
external val RESOURCE_UTRIUM_ACID: ResourceConstant
external val RESOURCE_UTRIUM_ALKALIDE: ResourceConstant
external val RESOURCE_KEANIUM_ACID: ResourceConstant
external val RESOURCE_KEANIUM_ALKALIDE: ResourceConstant
external val RESOURCE_LEMERGIUM_ACID: ResourceConstant
external val RESOURCE_LEMERGIUM_ALKALIDE: ResourceConstant
external val RESOURCE_ZYNTHIUM_ACID: ResourceConstant
external val RESOURCE_ZYNTHIUM_ALKALIDE: ResourceConstant
external val RESOURCE_GHODIUM_ACID: ResourceConstant
external val RESOURCE_GHODIUM_ALKALIDE: ResourceConstant
external val RESOURCE_CATALYZED_UTRIUM_ACID: ResourceConstant
external val RESOURCE_CATALYZED_UTRIUM_ALKALIDE: ResourceConstant
external val RESOURCE_CATALYZED_KEANIUM_ACID: ResourceConstant
external val RESOURCE_CATALYZED_KEANIUM_ALKALIDE: ResourceConstant
external val RESOURCE_CATALYZED_LEMERGIUM_ACID: ResourceConstant
external val RESOURCE_CATALYZED_LEMERGIUM_ALKALIDE: ResourceConstant
external val RESOURCE_CATALYZED_ZYNTHIUM_ACID: ResourceConstant
external val RESOURCE_CATALYZED_ZYNTHIUM_ALKALIDE: ResourceConstant
external val RESOURCE_CATALYZED_GHODIUM_ACID: ResourceConstant
external val RESOURCE_CATALYZED_GHODIUM_ALKALIDE: ResourceConstant

external val LOOK_CREEPS: LookConstant<Creep>
external val LOOK_ENERGY: LookConstant<Resource>
external val LOOK_RESOURCES: LookConstant<Resource>
external val LOOK_SOURCES: LookConstant<Source>
external val LOOK_MINERALS: LookConstant<Mineral>
external val LOOK_STRUCTURES: LookConstant<Structure>
external val LOOK_FLAGS: LookConstant<Flag>
external val LOOK_CONSTRUCTION_SITES: LookConstant<ConstructionSite>
external val LOOK_NUKES: LookConstant<Nuke>
external val LOOK_TERRAIN: LookConstant<TerrainConstant>
external val LOOK_TOMBSTONES: LookConstant<Tombstone>

external val WORK: ActiveBodyPartConstant
external val CARRY: ActiveBodyPartConstant
external val MOVE: ActiveBodyPartConstant
external val ATTACK: ActiveBodyPartConstant
external val RANGED_ATTACK: ActiveBodyPartConstant
external val TOUGH: ActiveBodyPartConstant
external val HEAL: ActiveBodyPartConstant
external val CLAIM: BodyPartConstant
external val BODYPART_COST: Record<BodyPartConstant, Int>


external val CREEP_SPAWN_TIME: Int
external val CREEP_LIFE_TIME: Int
external val CREEP_CLAIM_LIFE_TIME: Int
external val CREEP_CORPSE_RATE: Double
external val OBSTACLE_OBJECT_TYPES: Array<String>
external val ENERGY_REGEN_TIME: Int
external val ENERGY_DECAY: Int
external val REPAIR_COST: Int
external val RAMPART_DECAY_AMOUNT: Int
external val RAMPART_DECAY_TIME: Int
external val RAMPART_HITS: Int
external val ROAD_HITS: Int
external val ROAD_WEAROUT: Int
external val ROAD_DECAY_AMOUNT: Int
external val ROAD_DECAY_TIME: Int
external val LINK_HITS: Int
external val LINK_HITS_MAX: Int
external val LINK_CAPACITY: Int
external val LINK_COOLDOWN: Int
external val LINK_LOSS_RATIO: Double
external val STORAGE_CAPACITY: Int
external val STORAGE_HITS: Int
external val BODYPARTS_ALL: Array<BodyPartConstant>
external val CARRY_CAPACITY: Int
external val HARVEST_POWER: Int
external val HARVEST_MINERAL_POWER: Int
external val REPAIR_POWER: Int
external val DISMANTLE_POWER: Int
external val BUILD_POWER: Int
external val ATTACK_POWER: Int
external val UPGRADE_CONTROLLER_POWER: Int
external val RANGED_ATTACK_POWER: Int
external val HEAL_POWER: Int
external val RANGED_HEAL_POWER: Int
external val DISMANTLE_COST: Int


external val SYSTEM_USERNAME: String
external val SIGN_PLANNED_AREA: String

external val SOURCE_ENERGY_CAPACITY: Int
external val SOURCE_ENERGY_NEUTRAL_CAPACITY: Int
external val SOURCE_ENERGY_KEEPER_CAPACITY: Int

external val MINERAL_REGEN_TIME: Int
external val MINERAL_DENSITY_CHANGE: Double
external val MINERAL_MIN_AMOUNT: Record<MineralConstant, Int>
external val MINERAL_RANDOM_FACTOR: Double
external val MINERAL_DENSITY: Record<DensityConstant, Int>
external val MINERAL_DENSITY_PROBABILITY: Record<DensityConstant, Double>
external val DENSITY_LOW: DensityConstant
external val DENSITY_MODERATE: DensityConstant
external val DENSITY_HIGH: DensityConstant
external val DENSITY_ULTRA: DensityConstant

external val NUKER_HITS: Int
external val NUKER_COOLDOWN: Int
external val NUKER_ENERGY_CAPACITY: Int
external val NUKER_GHODIUM_CAPACITY: Int
external val NUKE_LAND_TIME: Int
external val NUKE_RANGE: Int
external val NUKE_DAMAGE: Record<Int, Int>

external val CONTROLLER_DOWNGRADE: Record<Int, Int>
external val CONTROLLER_DOWNGRADE_RESTORE: Int
external val CONTROLLER_DOWNGRADE_SAFEMODE_THRESHOLD: Int
external val CONTROLLER_CLAIM_DOWNGRADE: Int
external val CONTROLLER_RESERVE: Int
external val CONTROLLER_RESERVE_MAX: Int
external val CONTROLLER_MAX_UPGRADE_PER_TICK: Int
external val CONTROLLER_ATTACK_BLOCKED_UPGRADE: Int
external val CONTROLLER_NUKE_BLOCKED_UPGRADE: Int

external val SAFE_MODE_DURATION: Int
external val SAFE_MODE_COOLDOWN: Int
external val SAFE_MODE_COST: Int

// Add missing Tower and Observer constants here

external val POWER_BANK_HITS: Int
external val POWER_BANK_CAPACITY_MAX: Int
external val POWER_BANK_CAPACITY_MIN: Int
external val POWER_BANK_CAPACITY_CRIT: Float
external val POWER_BANK_DECAY: Int
external val POWER_BANK_HIT_BACK: Float

external val POWER_SPAWN_HITS: Int
external val POWER_SPAWN_ENERGY_CAPACITY: Int
external val POWER_SPAWN_POWER_CAPACITY: Int
external val POWER_SPAWN_ENERGY_RATIO: Int

// Add missing Extractor and Lab

external val ORDER_SELL: OrderConstant
external val ORDER_BUY: OrderConstant
external val SUBSCRIPTION_TOKEN: TradableConstant

// Kotlin specific constants - used to indicate a subset of a type
// E.g. "plain" | "swamp" | "wall" as specified by the API.

external interface TerrainConstant : StringConstant
external interface LineStyleConstant : StringConstant
external interface TextAlignConstant : StringConstant
external interface AlgorithmConstant : StringConstant
external interface TerrainMaskConstant : IntConstant

val TERRAIN_PLAIN: TerrainConstant = "plain".unsafeCast<TerrainConstant>()
val TERRAIN_SWAMP: TerrainConstant = "swamp".unsafeCast<TerrainConstant>()
val TERRAIN_WALL: TerrainConstant = "wall".unsafeCast<TerrainConstant>()

external val TERRAIN_MASK_WALL: TerrainMaskConstant
external val TERRAIN_MASK_SWAMP: TerrainMaskConstant
val TERRAIN_MASK_NONE: IntConstant = 0.unsafeCast<TerrainMaskConstant>()

val LINE_STYLE_DASHED: LineStyleConstant = "dashed".unsafeCast<LineStyleConstant>()
val LINE_STYLE_DOTTED: LineStyleConstant = "dotted".unsafeCast<LineStyleConstant>()
val LINE_STYLE_SOLID: LineStyleConstant = undefined.unsafeCast<LineStyleConstant>()

val TEXT_ALIGN_LEFT: TextAlignConstant = "left".unsafeCast<TextAlignConstant>()
val TEXT_ALIGN_CENTER: TextAlignConstant = "center".unsafeCast<TextAlignConstant>()
val TEXT_ALIGN_RIGHT: TextAlignConstant = "right".unsafeCast<TextAlignConstant>()
val ALGORITHM_ASTAR: AlgorithmConstant = "astar".unsafeCast<AlgorithmConstant>()
val ALGORITHM_DIJKSTRA: AlgorithmConstant = "dijkstra".unsafeCast<AlgorithmConstant>()


external interface PowerClassConstant : StringConstant
external interface PowerEffectConstant : IntConstant

enum class POWER_CLASS(val value: PowerClassConstant) {
    OPERATOR("operator".unsafeCast<PowerClassConstant>())
}

external val POWER_LEVEL_MULTIPLY: Int
external val POWER_LEVEL_POW: Int
external val POWER_CREEP_SPAWN_COOLDOWN: Int
external val POWER_CREEP_DELETE_COOLDOWN: Int
external val POWER_CREEP_MAX_LEVEL: Int
external val POWER_CREEP_LIFE_TIME: Int

external val PWR_GENERATE_OPS: PowerEffectConstant
external val PWR_OPERATE_SPAWN: PowerEffectConstant
external val PWR_OPERATE_TOWER: PowerEffectConstant
external val PWR_OPERATE_STORAGE: PowerEffectConstant
external val PWR_OPERATE_LAB: PowerEffectConstant
external val PWR_OPERATE_EXTENSION: PowerEffectConstant
external val PWR_OPERATE_OBSERVER: PowerEffectConstant
external val PWR_OPERATE_TERMINAL: PowerEffectConstant
external val PWR_DISRUPT_SPAWN: PowerEffectConstant
external val PWR_DISRUPT_TOWER: PowerEffectConstant
external val PWR_DISRUPT_SOURCE: PowerEffectConstant
external val PWR_SHIELD: PowerEffectConstant
external val PWR_REGEN_SOURCE: PowerEffectConstant
external val PWR_REGEN_MINERAL: PowerEffectConstant
external val PWR_DISRUPT_TERMINAL: PowerEffectConstant
external val PWR_OPERATE_POWER: PowerEffectConstant
external val PWR_FORTIFY: PowerEffectConstant
external val PWR_OPERATE_CONTROLLER: PowerEffectConstant
external val PWR_OPERATE_FACTORY: PowerEffectConstant
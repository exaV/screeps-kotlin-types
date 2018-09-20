@file:Suppress("unused")

package screeps.api

inline val <T> Constant<T>.value: T get() = this.asDynamic().unsafeCast<T>()

external interface Constant<T>

typealias StringConstant = Constant<String>
typealias IntegerConstant = Constant<Int>

external interface FindConstant : IntegerConstant
external interface ScreepsReturnCode : IntegerConstant
external interface BodyPartConstant : StringConstant
external interface ActiveBodyPartConstant : BodyPartConstant
external interface StructureConstant : StringConstant
external interface BuildableStructureConstant : StructureConstant
external interface LookConstant : StringConstant
external interface DirectionConstant : IntegerConstant
external interface TradableConstant : StringConstant
external interface ResourceConstant : TradableConstant
external interface MineralConstant : ResourceConstant
external interface ColorConstant : IntegerConstant
external interface DensityConstant : IntegerConstant
external interface OrderConstant : StringConstant
external interface Terrain

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

external val FIND_EXIT_TOP: FindConstant
external val FIND_EXIT_RIGHT: FindConstant
external val FIND_EXIT_BOTTOM: FindConstant
external val FIND_EXIT_LEFT: FindConstant
external val FIND_EXIT: FindConstant
external val FIND_CREEPS: FindConstant
external val FIND_MY_CREEPS: FindConstant
external val FIND_HOSTILE_CREEPS: FindConstant
external val FIND_SOURCES_ACTIVE: FindConstant
external val FIND_SOURCES: FindConstant
external val FIND_DROPPED_ENERGY: FindConstant
external val FIND_DROPPED_RESOURCES: FindConstant
external val FIND_STRUCTURES: FindConstant
external val FIND_MY_STRUCTURES: FindConstant
external val FIND_HOSTILE_STRUCTURES: FindConstant
external val FIND_FLAGS: FindConstant
external val FIND_CONSTRUCTION_SITES: FindConstant
external val FIND_MY_SPAWNS: FindConstant
external val FIND_HOSTILE_SPAWNS: FindConstant
external val FIND_MY_CONSTRUCTION_SITES: FindConstant
external val FIND_HOSTILE_CONSTRUCTION_SITES: FindConstant
external val FIND_MINERALS: FindConstant
external val FIND_NUKES: FindConstant
external val FIND_TOMBSTONES: FindConstant


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
external val CONSTRUCTION_COST: StringDict<Int>
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

external val LOOK_CREEPS: LookConstant
external val LOOK_ENERGY: LookConstant
external val LOOK_RESOURCES: LookConstant
external val LOOK_SOURCES: LookConstant
external val LOOK_MINERALS: LookConstant
external val LOOK_STRUCTURES: LookConstant
external val LOOK_FLAGS: LookConstant
external val LOOK_CONSTRUCTION_SITES: LookConstant
external val LOOK_NUKES: LookConstant
external val LOOK_TERRAIN: LookConstant
external val LOOK_TOMBSTONES: LookConstant

external val WORK: ActiveBodyPartConstant
external val CARRY: ActiveBodyPartConstant
external val MOVE: ActiveBodyPartConstant
external val ATTACK: ActiveBodyPartConstant
external val RANGED_ATTACK: ActiveBodyPartConstant
external val TOUGH: ActiveBodyPartConstant
external val HEAL: ActiveBodyPartConstant
external val CLAIM: BodyPartConstant
external val BODYPART_COST: StringDict<Int>


external var CREEP_SPAWN_TIME: Int
external var CREEP_LIFE_TIME: Int
external var CREEP_CLAIM_LIFE_TIME: Int
external var CREEP_CORPSE_RATE: Double
external var OBSTACLE_OBJECT_TYPES: Array<String>
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
external val SIGN_NOVICE_AREA: String
external val SIGN_RESPAWN_AREA: String

external val SOURCE_ENERGY_CAPACITY: Int
external val SOURCE_ENERGY_NEUTRAL_CAPACITY: Int
external val SOURCE_ENERGY_KEEPER_CAPACITY: Int

external val MINERAL_REGEN_TIME: Int
external val MINERAL_DENSITY_CHANGE: Double
external val MINERAL_MIN_AMOUNT: JsDict<MineralConstant, Int>
external val MINERAL_RANDOM_FACTOR: Double
external val MINERAL_DENSITY: JsDict<DensityConstant, Int>
external val MINERAL_DENSITY_PROBABILITY: JsDict<DensityConstant, Double>
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
external val NUKE_DAMAGE: JsDict<Int, Int>

external val CONTROLLER_DOWNGRADE: JsDict<Int, Int>
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

external val ORDER_SELL: OrderConstant
external val ORDER_BUY: OrderConstant
external val SUBSCRIPTION_TOKEN: TradableConstant
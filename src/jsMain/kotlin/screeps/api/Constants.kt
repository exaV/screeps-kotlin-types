@file:Suppress("unused")

package screeps.api

import screeps.api.structures.Structure
import screeps.api.structures.StructureSpawn

external interface Constant<T>

inline val <T> Constant<T>.value: T get() = this.asDynamic().unsafeCast<T>()

typealias StringConstant = Constant<String>
typealias IntConstant = Constant<Int>

external interface EffectConstant : IntConstant
external interface PowerEffectConstant : EffectConstant
external interface FindConstant<T> : IntConstant
external interface ExitConstant : FindConstant<RoomPosition>
external interface ScreepsReturnCode : IntConstant
external interface BodyPartConstant : StringConstant
external interface ActiveBodyPartConstant : BodyPartConstant
external interface StructureConstant : StringConstant
external interface BuildableStructureConstant : StructureConstant
external interface LookConstant<T> : StringConstant
external interface EventConstant<T> : IntConstant
external interface EventAttackTypeConstant : IntConstant
external interface EventHealTypeConstant : IntConstant
external interface DirectionConstant : IntConstant
external interface TradableConstant : StringConstant
external interface ResourceConstant : TradableConstant
external interface CompressedResourceConstant : ResourceConstant
external interface MineralConstant : ResourceConstant
external interface DepositResourceConstant : ResourceConstant
external interface ColorConstant : IntConstant
external interface DensityConstant : IntConstant
external interface OrderConstant : StringConstant

// Kotlin specific constants - used to indicate a subset of a type
// E.g. "plain" | "swamp" | "wall" as specified by the API.

external interface TerrainConstant : StringConstant
external interface LineStyleConstant : StringConstant
external interface TextAlignConstant : StringConstant
external interface AlgorithmConstant : StringConstant
external interface TerrainMaskConstant : IntConstant

external val OK: ScreepsReturnCode
external val ERR_NOT_OWNER: ScreepsReturnCode
external val ERR_NO_PATH: ScreepsReturnCode
external val ERR_NAME_EXISTS: ScreepsReturnCode
external val ERR_BUSY: ScreepsReturnCode
external val ERR_NOT_FOUND: ScreepsReturnCode
external val ERR_NOT_ENOUGH_ENERGY: ScreepsReturnCode
external val ERR_NOT_ENOUGH_RESOURCES: ScreepsReturnCode
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
external val FIND_POWER_CREEPS: FindConstant<PowerCreep>
external val FIND_MY_POWER_CREEPS: FindConstant<PowerCreep>
external val FIND_HOSTILE_POWER_CREEPS: FindConstant<PowerCreep>
external val FIND_DEPOSITS: FindConstant<Deposit>
external val FIND_RUINS: FindConstant<Ruin>

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

external val LOOK_CREEPS: LookConstant<Creep>
external val LOOK_ENERGY: LookConstant<Resource>
external val LOOK_RESOURCES: LookConstant<Resource>
external val LOOK_SOURCES: LookConstant<Source>
external val LOOK_MINERALS: LookConstant<Mineral>
external val LOOK_DEPOSITS: LookConstant<Deposit>
external val LOOK_STRUCTURES: LookConstant<Structure>
external val LOOK_FLAGS: LookConstant<Flag>
external val LOOK_CONSTRUCTION_SITES: LookConstant<ConstructionSite>
external val LOOK_NUKES: LookConstant<Nuke>
external val LOOK_TERRAIN: LookConstant<TerrainConstant>
external val LOOK_TOMBSTONES: LookConstant<Tombstone>
external val LOOK_POWER_CREEPS: LookConstant<PowerCreep>
external val LOOK_RUINS: LookConstant<Ruin>

// Don't know how to implement this right now, I guess these could have been mapped to some other constants
// OBSTACLE_OBJECT_TYPES: ["spawn", "creep", "powerCreep", "source", "mineral", "deposit", "controller", "constructedWall", "extension", "link", "storage", "tower", "observer", "powerSpawn", "powerBank", "lab", "terminal", "nuker", "factory", "invaderCore"],
external val OBSTACLE_OBJECT_TYPES: Array<String>

external val MOVE: ActiveBodyPartConstant
external val WORK: ActiveBodyPartConstant
external val CARRY: ActiveBodyPartConstant
external val ATTACK: ActiveBodyPartConstant
external val RANGED_ATTACK: ActiveBodyPartConstant
external val TOUGH: ActiveBodyPartConstant
external val HEAL: ActiveBodyPartConstant
external val CLAIM: BodyPartConstant

external val BODYPART_COST: Record<BodyPartConstant, Int>

external val CREEP_LIFE_TIME: Int
external val CREEP_CLAIM_LIFE_TIME: Int
external val CREEP_CORPSE_RATE: Double
external val CREEP_PART_MAX_ENERGY: Int

external val CARRY_CAPACITY: Int
external val HARVEST_POWER: Int
external val HARVEST_MINERAL_POWER: Int
external val HARVEST_DEPOSIT_POWER: Int
external val REPAIR_POWER: Int
external val DISMANTLE_POWER: Int
external val BUILD_POWER: Int
external val ATTACK_POWER: Int
external val UPGRADE_CONTROLLER_POWER: Int
external val RANGED_ATTACK_POWER: Int
external val HEAL_POWER: Int
external val RANGED_HEAL_POWER: Int
external val REPAIR_COST: Double
external val DISMANTLE_COST: Double

external val RAMPART_DECAY_AMOUNT: Int
external val RAMPART_DECAY_TIME: Int
external val RAMPART_HITS: Int
external val RAMPART_HITS_MAX: Record<Int, Int>

external val ENERGY_REGEN_TIME: Int
external val ENERGY_DECAY: Int

external val SPAWN_HITS: Int
external val SPAWN_ENERGY_START: Int
external val SPAWN_ENERGY_CAPACITY: Int
external val CREEP_SPAWN_TIME: Int
external val SPAWN_RENEW_RATIO: Double

external val SOURCE_ENERGY_CAPACITY: Int
external val SOURCE_ENERGY_NEUTRAL_CAPACITY: Int
external val SOURCE_ENERGY_KEEPER_CAPACITY: Int

external val WALL_HITS: Int
external val WALL_HITS_MAX: Int

external val EXTENSION_HITS: Int
external val EXTENSION_ENERGY_CAPACITY: Record<Int, Int>

external val ROAD_HITS: Int
external val ROAD_WEAROUT: Int
external val ROAD_WEAROUT_POWER_CREEP: Int
external val ROAD_DECAY_AMOUNT: Int
external val ROAD_DECAY_TIME: Int

external val LINK_HITS: Int
external val LINK_HITS_MAX: Int
external val LINK_CAPACITY: Int
external val LINK_COOLDOWN: Int
external val LINK_LOSS_RATIO: Double

external val STORAGE_CAPACITY: Int
external val STORAGE_HITS: Int

external val STRUCTURE_SPAWN: BuildableStructureConstant
external val STRUCTURE_EXTENSION: BuildableStructureConstant
external val STRUCTURE_ROAD: BuildableStructureConstant
external val STRUCTURE_WALL: BuildableStructureConstant
external val STRUCTURE_RAMPART: BuildableStructureConstant
external val STRUCTURE_KEEPER_LAIR: StructureConstant
external val STRUCTURE_PORTAL: StructureConstant
external val STRUCTURE_CONTROLLER: BuildableStructureConstant
external val STRUCTURE_LINK: BuildableStructureConstant
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
external val STRUCTURE_FACTORY: BuildableStructureConstant
external val STRUCTURE_INVADER_CORE: StructureConstant

external val CONSTRUCTION_COST: Record<String, Int>
external val CONSTRUCTION_COST_ROAD_SWAMP_RATIO: Int
external val CONSTRUCTION_COST_ROAD_WALL_RATIO: Int

external val CONTROLLER_LEVELS: Record<Int, Int>
external val CONTROLLER_STRUCTURES: Record<StructureConstant, Record<Int, Int>>
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

external val TOWER_HITS: Int
external val TOWER_CAPACITY: Int
external val TOWER_ENERGY_COST: Int
external val TOWER_POWER_ATTACK: Int
external val TOWER_POWER_HEAL: Int
external val TOWER_POWER_REPAIR: Int
external val TOWER_OPTIMAL_RANGE: Int
external val TOWER_FALLOFF_RANGE: Int
external val TOWER_FALLOFF: Double

external val OBSERVER_HITS: Int
external val OBSERVER_RANGE: Int

external val POWER_BANK_HITS: Int
external val POWER_BANK_CAPACITY_MAX: Int
external val POWER_BANK_CAPACITY_MIN: Int
external val POWER_BANK_CAPACITY_CRIT: Double
external val POWER_BANK_DECAY: Int
external val POWER_BANK_HIT_BACK: Double

external val POWER_SPAWN_HITS: Int
external val POWER_SPAWN_ENERGY_CAPACITY: Int
external val POWER_SPAWN_POWER_CAPACITY: Int
external val POWER_SPAWN_ENERGY_RATIO: Int

external val EXTRACTOR_HITS: Int
external val EXTRACTOR_COOLDOWN: Int

external val LAB_HITS: Int
external val LAB_MINERAL_CAPACITY: Int
external val LAB_ENERGY_CAPACITY: Int
external val LAB_BOOST_ENERGY: Int
external val LAB_BOOST_MINERAL: Int
external val LAB_COOLDOWN: Int
external val LAB_REACTION_AMOUNT: Int
external val LAB_UNBOOST_ENERGY: Int
external val LAB_UNBOOST_MINERAL: Int

external val GCL_POW: Double
external val GCL_MULTIPLY: Int
external val GCL_NOVICE: Int

// These are just defined as null in the official constants file,
// I just assume they are really booleans or meant to be checked as booleans
external val MODE_SIMULATION: Boolean?
external val MODE_WORLD: Boolean?

external val TERRAIN_MASK_WALL: TerrainMaskConstant
external val TERRAIN_MASK_SWAMP: TerrainMaskConstant
external val TERRAIN_MASK_LAVA: TerrainMaskConstant
val TERRAIN_MASK_NONE: IntConstant = 0.unsafeCast<TerrainMaskConstant>()

val TERRAIN_PLAIN: TerrainConstant = "plain".unsafeCast<TerrainConstant>()
val TERRAIN_SWAMP: TerrainConstant = "swamp".unsafeCast<TerrainConstant>()
val TERRAIN_WALL: TerrainConstant = "wall".unsafeCast<TerrainConstant>()

// Going out on a limb here
val TERRAIN_LAVA: TerrainConstant = "lava".unsafeCast<TerrainConstant>()

external val MAX_CONSTRUCTION_SITES: Int
external val MAX_CREEP_SIZE: Int

external val MINERAL_REGEN_TIME: Int
external val MINERAL_MIN_AMOUNT: Record<MineralConstant, Int>
external val MINERAL_RANDOM_FACTOR: Double
external val MINERAL_DENSITY: Record<DensityConstant, Int>
external val MINERAL_DENSITY_PROBABILITY: Record<DensityConstant, Double>
external val MINERAL_DENSITY_CHANGE: Double

external val DENSITY_LOW: DensityConstant
external val DENSITY_MODERATE: DensityConstant
external val DENSITY_HIGH: DensityConstant
external val DENSITY_ULTRA: DensityConstant

external val DEPOSIT_EXHAUST_MULTIPLY: Double
external val DEPOSIT_EXHAUST_POW: Double
external val DEPOSIT_DECAY_TIME: Int

external val TERMINAL_CAPACITY: Int
external val TERMINAL_HITS: Int
external val TERMINAL_SEND_COST: Double
external val TERMINAL_MIN_SEND: Int
external val TERMINAL_COOLDOWN: Int

external val CONTAINER_HITS: Int
external val CONTAINER_CAPACITY: Int
external val CONTAINER_DECAY: Int
external val CONTAINER_DECAY_TIME: Int
external val CONTAINER_DECAY_TIME_OWNED: Int

external val NUKER_HITS: Int
external val NUKER_COOLDOWN: Int
external val NUKER_ENERGY_CAPACITY: Int
external val NUKER_GHODIUM_CAPACITY: Int
external val NUKE_LAND_TIME: Int
external val NUKE_RANGE: Int
external val NUKE_DAMAGE: Record<Int, Int>

external val FACTORY_HITS: Int
external val FACTORY_CAPACITY: Int

external val TOMBSTONE_DECAY_PER_PART: Int
external val TOMBSTONE_DECAY_POWER_CREEP: Int

external val RUIN_DECAY: Int
external val RUIN_DECAY_STRUCTURES: Record<StructureConstant, Int>

external val PORTAL_DECAY: Int

external val ORDER_SELL: OrderConstant
external val ORDER_BUY: OrderConstant

external val MARKET_FEE: Number

external val MARKET_MAX_ORDERS: Int
external val MARKET_ORDER_LIFE_TIME: Int

external val FLAGS_LIMIT: Int

external val SUBSCRIPTION_TOKEN: TradableConstant

external val RESOURCE_ENERGY: ResourceConstant
external val RESOURCE_POWER: ResourceConstant

external val RESOURCE_HYDROGEN: MineralConstant
external val RESOURCE_OXYGEN: MineralConstant
external val RESOURCE_UTRIUM: MineralConstant
external val RESOURCE_LEMERGIUM: MineralConstant
external val RESOURCE_KEANIUM: MineralConstant
external val RESOURCE_ZYNTHIUM: MineralConstant
external val RESOURCE_CATALYST: MineralConstant
external val RESOURCE_GHODIUM: MineralConstant

external val RESOURCE_SILICON: DepositResourceConstant
external val RESOURCE_METAL: DepositResourceConstant
external val RESOURCE_BIOMASS: DepositResourceConstant
external val RESOURCE_MIST: DepositResourceConstant

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

external val RESOURCE_OPS: ResourceConstant

external val RESOURCE_UTRIUM_BAR: CompressedResourceConstant
external val RESOURCE_LEMERGIUM_BAR: CompressedResourceConstant
external val RESOURCE_ZYNTHIUM_BAR: CompressedResourceConstant
external val RESOURCE_KEANIUM_BAR: CompressedResourceConstant
external val RESOURCE_GHODIUM_MELT: CompressedResourceConstant
external val RESOURCE_OXIDANT: CompressedResourceConstant
external val RESOURCE_REDUCTANT: CompressedResourceConstant
external val RESOURCE_PURIFIER: CompressedResourceConstant
external val RESOURCE_BATTERY: CompressedResourceConstant

external val RESOURCE_COMPOSITE: ResourceConstant
external val RESOURCE_CRYSTAL: ResourceConstant
external val RESOURCE_LIQUID: ResourceConstant

external val RESOURCE_WIRE: ResourceConstant
external val RESOURCE_SWITCH: ResourceConstant
external val RESOURCE_TRANSISTOR: ResourceConstant
external val RESOURCE_MICROCHIP: ResourceConstant
external val RESOURCE_CIRCUIT: ResourceConstant
external val RESOURCE_DEVICE: ResourceConstant

external val RESOURCE_CELL: ResourceConstant
external val RESOURCE_PHLEGM: ResourceConstant
external val RESOURCE_TISSUE: ResourceConstant
external val RESOURCE_MUSCLE: ResourceConstant
external val RESOURCE_ORGANOID: ResourceConstant
external val RESOURCE_ORGANISM: ResourceConstant

external val RESOURCE_ALLOY: ResourceConstant
external val RESOURCE_TUBE: ResourceConstant
external val RESOURCE_FIXTURES: ResourceConstant
external val RESOURCE_FRAME: ResourceConstant
external val RESOURCE_HYDRAULICS: ResourceConstant
external val RESOURCE_MACHINE: ResourceConstant

external val RESOURCE_CONDENSATE: ResourceConstant
external val RESOURCE_CONCENTRATE: ResourceConstant
external val RESOURCE_EXTRACT: ResourceConstant
external val RESOURCE_SPIRIT: ResourceConstant
external val RESOURCE_EMANATION: ResourceConstant
external val RESOURCE_ESSENCE: ResourceConstant

external val REACTIONS: Record<ResourceConstant, Record<ResourceConstant, ResourceConstant>>

// We could replace the String with a constant at some stage
external val BOOSTS: Record<BodyPartConstant, Record<ResourceConstant, Record<String, Double>>>

external val REACTION_TIME: Record<ResourceConstant, Int>

external val PORTAL_UNSTABLE: Int
external val PORTAL_MIN_TIMEOUT: Int
external val PORTAL_MAX_TIMEOUT: Int

external val POWER_BANK_RESPAWN_TIME: Int

external val INVADERS_ENERGY_GOAL: Int

external val SYSTEM_USERNAME: String

external val SIGN_NOVICE_AREA: String
external val SIGN_RESPAWN_AREA: String
external val SIGN_PLANNED_AREA: String

external val EVENT_ATTACK: EventConstant<AttackEvent>
external val EVENT_OBJECT_DESTROYED: EventConstant<DestroyedEvent>
external val EVENT_ATTACK_CONTROLLER: EventConstant<AttackControllerEvent>
external val EVENT_BUILD: EventConstant<BuildEvent>
external val EVENT_HARVEST: EventConstant<HarvestEvent>
external val EVENT_HEAL: EventConstant<HealEvent>
external val EVENT_REPAIR: EventConstant<RepairEvent>
external val EVENT_RESERVE_CONTROLLER: EventConstant<ReserveControllerEvent>
external val EVENT_UPGRADE_CONTROLLER: EventConstant<UpgradeControllerEvent>
external val EVENT_EXIT: EventConstant<ExitEvent>
external val EVENT_POWER: EventConstant<PowerEvent>
external val EVENT_TRANSFER: EventConstant<TransferEvent>

external val EVENT_ATTACK_TYPE_MELEE: EventAttackTypeConstant
external val EVENT_ATTACK_TYPE_RANGED: EventAttackTypeConstant
external val EVENT_ATTACK_TYPE_RANGED_MASS: EventAttackTypeConstant
external val EVENT_ATTACK_TYPE_DISMANTLE: EventAttackTypeConstant
external val EVENT_ATTACK_TYPE_HIT_BACK: EventAttackTypeConstant
external val EVENT_ATTACK_TYPE_NUKE: EventAttackTypeConstant

external val EVENT_HEAL_TYPE_MELEE: EventHealTypeConstant
external val EVENT_HEAL_TYPE_RANGED: EventHealTypeConstant

external interface PowerClassConstant : StringConstant

external interface PowerClass {
    val OPERATOR: PowerClassConstant
}

external val POWER_LEVEL_MULTIPLY: Int
external val POWER_LEVEL_POW: Int
external val POWER_CREEP_SPAWN_COOLDOWN: Int
external val POWER_CREEP_DELETE_COOLDOWN: Int
external val POWER_CREEP_MAX_LEVEL: Int
external val POWER_CREEP_LIFE_TIME: Int

external val POWER_CLASS: PowerClass

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

external val EFFECT_INVULNERABILITY: EffectConstant
external val EFFECT_COLLAPSE_TIMER: EffectConstant

external val INVADER_CORE_HITS: Int
external val INVADER_CORE_CREEP_SPAWN_TIME: Record<Int, Int>
external val INVADER_CORE_EXPAND_TIME: Record<Int, Int>
external val INVADER_CORE_CONTROLLER_POWER: Int
external val INVADER_CORE_CONTROLLER_DOWNGRADE: Int
external val STRONGHOLD_RAMPART_HITS: Record<Int, Int>
external val STRONGHOLD_DECAY_TICKS: Int


external interface CommodityRecipe {
    val level: Int?
    val amount: Int
    val cooldown: Int
    val components: Record<ResourceConstant, Int>
}

// Add POWER_INFO

external val BODYPARTS_ALL: Array<BodyPartConstant>
external val RESOURCES_ALL: Array<ResourceConstant>
external val COLORS_ALL: Array<ColorConstant>
external val INTERSHARD_RESOURCES: Array<TradableConstant>
external val COMMODITIES: Record<ResourceConstant, CommodityRecipe>

// Some extras defined by us
val LINE_STYLE_DASHED: LineStyleConstant = "dashed".unsafeCast<LineStyleConstant>()
val LINE_STYLE_DOTTED: LineStyleConstant = "dotted".unsafeCast<LineStyleConstant>()
val LINE_STYLE_SOLID: LineStyleConstant = undefined.unsafeCast<LineStyleConstant>()

val TEXT_ALIGN_LEFT: TextAlignConstant = "left".unsafeCast<TextAlignConstant>()
val TEXT_ALIGN_CENTER: TextAlignConstant = "center".unsafeCast<TextAlignConstant>()
val TEXT_ALIGN_RIGHT: TextAlignConstant = "right".unsafeCast<TextAlignConstant>()
val ALGORITHM_ASTAR: AlgorithmConstant = "astar".unsafeCast<AlgorithmConstant>()
val ALGORITHM_DIJKSTRA: AlgorithmConstant = "dijkstra".unsafeCast<AlgorithmConstant>()

package website.skylorbeck.sentimentality3.sentimentality3;

import me.shedaniel.autoconfig.AutoConfig;

public class Ref {//hardcoded references for use in registration and otherwise
    public static final String MODID = "sentimentality3";
    public static final String display = "display";
    public static final String color = "color";
    public static ModConfig config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();

    public static boolean showItems = true;
    public static boolean repairCost = true;
    public static boolean pingIndicator = true;
    public static boolean infinityFix = true;
    public static boolean itemEntity = true;
    public static boolean altItemEntity = false;
    public static boolean beehiveTips = true;
    public static boolean durabilityWarn = true;
    public static int firstWarn = 10;
    public static int secondWarn = 5;
    public static boolean chunker = true;
    public static boolean slimer = true;
    public static boolean massArrow = true;
    public static boolean daylighter = true;
    public static boolean fleather = true;
    public static boolean charcoal = true;
    public static boolean coalChunks = true;
    public static boolean sticks = true;
    public static boolean featherBlock = true;
    public static boolean gliders = false;
    public static boolean furnaces = true;
    public static boolean blasts = true;
    public static boolean smokers = true;
    public static boolean woolArmor = true;
    public static boolean copperArmor = true;
    public static boolean allTools = true;
    public static boolean allCompressedBlocks = true;
    public static boolean cropSparkle = true;
    public static ModConfig.CropStuff.SparkleType sparkleType = ModConfig.CropStuff.SparkleType.INSTANT_EFFECT;
    public static int sparkleCount = 2;
    public static boolean showSleepCount = true;
    public static boolean doClock = true;
    public static int clockCorner = 1;
    public static boolean clockMilitary = false;
    public static boolean clockAmPm = true;
    public static boolean graniteTools = true;
    public static boolean dioriteTools = true;
    public static boolean andesiteTools = true;
    public static boolean quartzTools = true;
    public static boolean netherrackTools = true;
    public static boolean netherbrickTools = true;
    public static boolean redNetherbrickTools = true;
    public static boolean sandstoneTools = true;
    public static boolean redSandstoneTools = true;
    public static boolean lapisTools = true;
    public static boolean emeraldTools = true;
    public static boolean flintTools = true;
    public static boolean redstoneTools = true;
    public static boolean blackstoneTools = true;
    public static boolean basaltTools = true;
    public static boolean endstoneTools = true;
    public static boolean warpedTools = true;
    public static boolean crimsonTools = true;
    public static boolean amethystTools = true;
    public static boolean copperTools = true;
    public static boolean deepslateTools = true;
    public static boolean cobble = true;
    public static boolean dirt = true;
    public static boolean diorite = true;
    public static boolean andesite = true;
    public static boolean granite = true;
    public static boolean netherrack = true;
    public static boolean sand = true;
    public static boolean gravel = true;
    public static boolean deepslate = true;
    public static boolean tuff = true;
    public static boolean calcite = true;
    public static boolean shapeless = true;
    public static boolean shapeless_bread = true;
    public static boolean shapeless_arrow = true;
    public static boolean shapeless_paper = true;
    public static boolean shapeless_shulker = true;
    public static boolean convertStone = true;
    public static boolean convertStone_blackstone = true;
    public static boolean convertStone_diorite = true;
    public static boolean convertStone_granite = true;
    public static boolean convertStone_andesite = true;
    public static boolean convertStone_mossy_cobblestone = true;
    public static boolean convertStone_gilded_blackstone = true;
    public static boolean quartz = true;
    public static boolean unpack = true;
    public static boolean unpack_clay = true;
    public static boolean unpack_flint = true;
    public static boolean unpack_amethyst = true;
    public static boolean unpack_blazerod = true;
    public static boolean unpack_brown_mushroom = true;
    public static boolean unpack_red_mushroom = true;
    public static boolean unpack_wart = true;
    public static boolean unpack_glowstone = true;
    public static boolean unpack_string = true;
    public static boolean unpack_quartz = true;
    public static boolean chests = true;
    public static boolean horseArmor = true;
    public static boolean horseArmor_diamond = true;
    public static boolean horseArmor_gold = true;
    public static boolean horseArmor_iron = true;
    public static boolean massTorch = true;
    public static boolean overpowered = true;
    public static boolean overpowered_slime = true;
    public static boolean overpowered_trident = true;
    public static boolean overpowered_nametag = true;
    public static boolean overpowered_notchapple = true;
    public static boolean overpowered_saddle = true;
    public static boolean rawBlockSmelt = true;
    public static boolean rawBlockSmelt_copper = true;
    public static boolean rawBlockSmelt_iron = true;
    public static boolean rawBlockSmelt_gold = true;
    public static boolean reclaim = true;
    public static boolean reclaim_copper = true;
    public static boolean reclaim_iron = true;
    public static boolean reclaim_gold = true;
    public static boolean reclaim_diamond = true;
    public static boolean chainArmor = true;
    public static int maxSugarCaneHeight = 5;

    public static void getSettings() {
        chunker = config.toggles.chunker;
        slimer = config.toggles.slimer;
        daylighter = config.toggles.daylighter;
        fleather = config.toggles.fleather;
        charcoal = config.toggles.charcoal;
        coalChunks = config.toggles.coalChunks;
        sticks = config.toggles.sticks;
        featherBlock = config.toggles.featherBlock;
        furnaces = config.toggles.furnaces;
        blasts = config.toggles.blasts;
        smokers = config.toggles.smokers;
        woolArmor = config.toggles.woolArmor;
        copperArmor = config.toggles.copperArmor;
        allTools = config.toggles.allTools;
        allCompressedBlocks = config.toggles.allCompressedBlocks;
        graniteTools = config.toggles.toolToggles.graniteTools;
        dioriteTools = config.toggles.toolToggles.dioriteTools;
        andesiteTools = config.toggles.toolToggles.andesiteTools;
        quartzTools = config.toggles.toolToggles.quartzTools;
        netherrackTools = config.toggles.toolToggles.netherrackTools;
        netherbrickTools = config.toggles.toolToggles.netherbrickTools;
        redNetherbrickTools = config.toggles.toolToggles.redNetherbrickTools;
        sandstoneTools = config.toggles.toolToggles.sandstoneTools;
        redSandstoneTools = config.toggles.toolToggles.redSandstoneTools;
        lapisTools = config.toggles.toolToggles.lapisTools;
        emeraldTools = config.toggles.toolToggles.emeraldTools;
        flintTools = config.toggles.toolToggles.flintTools;
        redstoneTools = config.toggles.toolToggles.redstoneTools;
        blackstoneTools = config.toggles.toolToggles.blackstoneTools;
        basaltTools = config.toggles.toolToggles.basaltTools;
        endstoneTools = config.toggles.toolToggles.endstoneTools;
        warpedTools = config.toggles.toolToggles.warpedTools;
        crimsonTools = config.toggles.toolToggles.crimsonTools;
        amethystTools = config.toggles.toolToggles.amethystTools;
        copperTools = config.toggles.toolToggles.copperTools;
        deepslateTools = config.toggles.toolToggles.deepslateTools;
        cobble = config.toggles.compressedBlocks.cobble;
        dirt = config.toggles.compressedBlocks.dirt;
        diorite = config.toggles.compressedBlocks.diorite;
        andesite = config.toggles.compressedBlocks.andesite;
        granite = config.toggles.compressedBlocks.granite;
        netherrack = config.toggles.compressedBlocks.netherrack;
        sand = config.toggles.compressedBlocks.sand;
        gravel = config.toggles.compressedBlocks.gravel;
        deepslate = config.toggles.compressedBlocks.deepslate;
        tuff = config.toggles.compressedBlocks.tuff;
        calcite = config.toggles.compressedBlocks.calcite;
        chainArmor = config.toggles.chainArmor;
        chests = config.toggles.chests;
        massTorch = config.toggles.massTorch;
        shapeless = config.toggles.allShapeless;
        shapeless_bread = config.toggles.shapeless.bread;
        shapeless_arrow = config.toggles.shapeless.arrow;
        shapeless_paper = config.toggles.shapeless.paper;
        shapeless_shulker = config.toggles.shapeless.shulker;
        convertStone = config.toggles.allConvertStone;
        convertStone_granite = config.toggles.convertStone.granite;
        convertStone_diorite = config.toggles.convertStone.diorite;
        convertStone_andesite = config.toggles.convertStone.andesite;
        convertStone_blackstone = config.toggles.convertStone.blackstone;
        convertStone_gilded_blackstone = config.toggles.convertStone.gilded_blackstone;
        convertStone_mossy_cobblestone = config.toggles.convertStone.mossy_cobble;
        quartz = config.toggles.convertStone.quartz;
        unpack = config.toggles.allUnpack;
        unpack_clay = config.toggles.unpack.clay;
        unpack_flint = config.toggles.unpack.flint;
        unpack_amethyst = config.toggles.unpack.amethyst;
        unpack_blazerod = config.toggles.unpack.blazerod;
        unpack_brown_mushroom = config.toggles.unpack.brown_mushroom;
        unpack_red_mushroom = config.toggles.unpack.red_mushroom;
        unpack_wart = config.toggles.unpack.wart;
        unpack_glowstone = config.toggles.unpack.glowstone;
        unpack_string = config.toggles.unpack.string;
        unpack_quartz = config.toggles.unpack.quartz;
        horseArmor = config.toggles.allHorseArmor;
        horseArmor_iron = config.toggles.horseArmor.iron;
        horseArmor_gold = config.toggles.horseArmor.gold;
        horseArmor_diamond = config.toggles.horseArmor.diamond;
        overpowered = config.toggles.allOverPower;
        overpowered_slime = config.toggles.overPowered.slime;
        overpowered_trident = config.toggles.overPowered.trident;
        overpowered_nametag= config.toggles.overPowered.nametag;
        overpowered_notchapple= config.toggles.overPowered.notchapple;
        overpowered_saddle = config.toggles.overPowered.saddle;
        rawBlockSmelt = config.toggles.allRawSmelt;
        rawBlockSmelt_copper = config.toggles.rawSmelt.copper;
        rawBlockSmelt_iron = config.toggles.rawSmelt.iron;
        rawBlockSmelt_gold = config.toggles.rawSmelt.gold;
        reclaim = config.toggles.allReclaim;
        reclaim_copper = config.toggles.reclaim.copper;
        reclaim_iron = config.toggles.reclaim.iron;
        reclaim_gold = config.toggles.reclaim.gold;
        reclaim_diamond = config.toggles.reclaim.diamond;
        massArrow = config.toggles.massArrow;
        getSomeSettings();
    }

    public static void getSomeSettings() {
        showItems = config.showItems;
        repairCost = config.repairCost;
        pingIndicator = config.pingIndicator;
        infinityFix = config.infinityFix;
        itemEntity = config.itemEntity;
        beehiveTips = config.beehiveTips;
        durabilityWarn = config.durabilityStuff.durabilityWarn;
        firstWarn = config.durabilityStuff.firstWarn;
        secondWarn = config.durabilityStuff.secondWarn;
        cropSparkle = config.cropStuff.cropSparkle;
        sparkleType = config.cropStuff.sparkleType;
        sparkleCount = config.cropStuff.sparkleCount;
        showSleepCount = config.showSleepCount;
        doClock = config.clockStuff.doClock;
        clockCorner = config.clockStuff.clockCorner;
        clockMilitary = config.clockStuff.clockMilitary;
        clockAmPm = config.clockStuff.clockAmPm;
        maxSugarCaneHeight = config.cropStuff.sugarCaneHeight;
    }
}

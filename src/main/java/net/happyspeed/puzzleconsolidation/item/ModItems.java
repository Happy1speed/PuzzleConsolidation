package net.happyspeed.puzzleconsolidation.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.happyspeed.puzzleconsolidation.PuzzleConsolidation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BA = registerItem("ba", new Item(new FabricItemSettings()));
    public static final Item ER = registerItem("er", new Item(new FabricItemSettings()));
    public static final Item JIU = registerItem("jiu", new Item(new FabricItemSettings()));
    public static final Item LIU = registerItem("liu", new Item(new FabricItemSettings()));
    public static final Item QI = registerItem("qi", new Item(new FabricItemSettings()));
    public static final Item SAN = registerItem("san", new Item(new FabricItemSettings()));
    public static final Item SHI = registerItem("shi", new Item(new FabricItemSettings()));
    public static final Item WU = registerItem("wu", new Item(new FabricItemSettings()));
    public static final Item YI = registerItem("yi", new Item(new FabricItemSettings()));
    public static final Item AIS = registerItem("ais", new Item(new FabricItemSettings()));
    public static final Item AUXX = registerItem("auxx", new Item(new FabricItemSettings()));
    public static final Item AZH = registerItem("azh", new Item(new FabricItemSettings()));
    public static final Item EAU = registerItem("eau", new Item(new FabricItemSettings()));
    public static final Item EST = registerItem("est", new Item(new FabricItemSettings()));
    public static final Item JAU = registerItem("jau", new Item(new FabricItemSettings()));
    public static final Item OIS = registerItem("ois", new Item(new FabricItemSettings()));
    public static final Item PAS = registerItem("pas", new Item(new FabricItemSettings()));
    public static final Item UIS = registerItem("uis", new Item(new FabricItemSettings()));
    public static final Item BASAL = registerItem("basal", new Item(new FabricItemSettings()));
    public static final Item COROB = registerItem("corob", new Item(new FabricItemSettings()));
    public static final Item COUNT = registerItem("count", new Item(new FabricItemSettings()));
    public static final Item FRAME = registerItem("frame", new Item(new FabricItemSettings()));
    public static final Item LIBRA = registerItem("libra", new Item(new FabricItemSettings()));
    public static final Item MOTIV = registerItem("motiv", new Item(new FabricItemSettings()));
    public static final Item RADIX = registerItem("radix", new Item(new FabricItemSettings()));
    public static final Item REDUX = registerItem("redux", new Item(new FabricItemSettings()));
    public static final Item SEVEN = registerItem("seven", new Item(new FabricItemSettings()));
    public static final Item ALPHA = registerItem("alpha", new Item(new FabricItemSettings()));
    public static final Item BETA = registerItem("beta", new Item(new FabricItemSettings()));
    public static final Item DELTA = registerItem("delta", new Item(new FabricItemSettings()));
    public static final Item DIGAMMA = registerItem("digamma", new Item(new FabricItemSettings()));
    public static final Item EPSILON = registerItem("epsilon", new Item(new FabricItemSettings()));
    public static final Item ETA = registerItem("eta", new Item(new FabricItemSettings()));
    public static final Item GAMMA = registerItem("gamma", new Item(new FabricItemSettings()));
    public static final Item THETA = registerItem("theta", new Item(new FabricItemSettings()));
    public static final Item ZETA = registerItem("zeta", new Item(new FabricItemSettings()));
    public static final Item DEATH = registerItem("death", new Item(new FabricItemSettings()));
    public static final Item GRACE = registerItem("grace", new Item(new FabricItemSettings()));
    public static final Item INTERVENTION = registerItem("intervention", new Item(new FabricItemSettings()));
    public static final Item JUSTICE = registerItem("justice", new Item(new FabricItemSettings()));
    public static final Item LISTEN = registerItem("listen", new Item(new FabricItemSettings()));
    public static final Item MERCY = registerItem("mercy", new Item(new FabricItemSettings()));
    public static final Item SIN = registerItem("sin", new Item(new FabricItemSettings()));
    public static final Item SPEAK = registerItem("speak", new Item(new FabricItemSettings()));
    public static final Item WAGES = registerItem("wages", new Item(new FabricItemSettings()));
    public static final Item DOWNGRADE = registerItem("downgrade", new Item(new FabricItemSettings()));
    public static final Item RELENT = registerItem("relent", new Item(new FabricItemSettings()));
    public static final Item REVERSE = registerItem("reverse", new Item(new FabricItemSettings()));
    public static final Item REWARD = registerItem("reward", new Item(new FabricItemSettings()));
    public static final Item TRANSITION = registerItem("transition", new Item(new FabricItemSettings()));
    public static final Item TRANSPIRE = registerItem("transpire", new Item(new FabricItemSettings()));
    public static final Item TRANSPORT = registerItem("transport", new Item(new FabricItemSettings()));
    public static final Item UPKEEP = registerItem("upkeep", new Item(new FabricItemSettings()));
    public static final Item UPSHOT = registerItem("upshot", new Item(new FabricItemSettings()));
    public static final Item ALEV = registerItem("alev", new Item(new FabricItemSettings()));
    public static final Item CHEVIT = registerItem("chevit", new Item(new FabricItemSettings()));
    public static final Item DAVET = registerItem("davet", new Item(new FabricItemSettings()));
    public static final Item GIVEL = registerItem("givel", new Item(new FabricItemSettings()));
    public static final Item HEVAT = registerItem("hevat", new Item(new FabricItemSettings()));
    public static final Item LAVED = registerItem("laved", new Item(new FabricItemSettings()));
    public static final Item TEVIT = registerItem("tevit", new Item(new FabricItemSettings()));
    public static final Item VET = registerItem("vet", new Item(new FabricItemSettings()));
    public static final Item ZAVIN = registerItem("zavin", new Item(new FabricItemSettings()));
    public static final Item BUREAUCRAT = registerItem("bureaucrat", new Item(new FabricItemSettings()));
    public static final Item CHANCELLOR = registerItem("chancellor", new Item(new FabricItemSettings()));
    public static final Item COMMISSIONER = registerItem("commissioner", new Item(new FabricItemSettings()));
    public static final Item MAGISTRATE = registerItem("magistrate", new Item(new FabricItemSettings()));
    public static final Item ORATOR = registerItem("orator", new Item(new FabricItemSettings()));
    public static final Item OVERSEER = registerItem("overseer", new Item(new FabricItemSettings()));
    public static final Item PRACTITIONER = registerItem("practitioner", new Item(new FabricItemSettings()));
    public static final Item PRINCE = registerItem("prince", new Item(new FabricItemSettings()));
    public static final Item VORTEX = registerItem("vortex", new Item(new FabricItemSettings()));
    public static final Item ENTIRE = registerItem("entire", new Item(new FabricItemSettings()));
    public static final Item FIRE = registerItem("fire", new Item(new FabricItemSettings()));
    public static final Item ICE = registerItem("ice", new Item(new FabricItemSettings()));
    public static final Item INERT = registerItem("inert", new Item(new FabricItemSettings()));
    public static final Item IRATE = registerItem("irate", new Item(new FabricItemSettings()));
    public static final Item IRE = registerItem("ire", new Item(new FabricItemSettings()));
    public static final Item PRICE = registerItem("price", new Item(new FabricItemSettings()));
    public static final Item SPINE = registerItem("spine", new Item(new FabricItemSettings()));
    public static final Item SPIRE = registerItem("spire", new Item(new FabricItemSettings()));

    public static final Item CNEGVNY = registerItem("cnegvny", new Item(new FabricItemSettings()));
    public static final Item FCNGVNY = registerItem("fcngvny", new Item(new FabricItemSettings()));
    public static final Item GEVGVNY = registerItem("gevgvny", new Item(new FabricItemSettings()));
    public static final Item GREGVNY = registerItem("gregvny", new Item(new FabricItemSettings()));
    public static final Item NKVGVNY = registerItem("nkvgvny", new Item(new FabricItemSettings()));
    public static final Item PEVGVNY = registerItem("pevgvny", new Item(new FabricItemSettings()));
    public static final Item VAVGVNY = registerItem("vavgvny", new Item(new FabricItemSettings()));
    public static final Item ZNMGVNY = registerItem("znmgvny", new Item(new FabricItemSettings()));
    public static final Item ZRAGVNY = registerItem("zragvny", new Item(new FabricItemSettings()));
    public static final Item PUZZLE_ASPECT = registerItem("puzzle_aspect", new Item(new FabricItemSettings()));
    public static final Item COMBAT_ASPECT = registerItem("combat_aspect", new Item(new FabricItemSettings()));
    public static final Item BUILDING_ASPECT = registerItem("building_aspect", new Item(new FabricItemSettings()));
    public static final Item AUTOMATION_ASPECT = registerItem("automation_aspect", new Item(new FabricItemSettings()));
    public static final Item TOTAL_ASPECT = registerItem("total_aspect", new Item(new FabricItemSettings()));
    public static final Item CORIOLIS = registerItem("coriolis", new Item(new FabricItemSettings()));
    public static final Item CORIOLIS_NEXUS = registerItem("coriolis_nexus", new Item(new FabricItemSettings()));



    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(BA);
        entries.add(ER);
        entries.add(JIU);
        entries.add(LIU);
        entries.add(QI);
        entries.add(SAN);
        entries.add(SHI);
        entries.add(WU);
        entries.add(YI);
        entries.add(AIS);
        entries.add(AUXX);
        entries.add(AZH);
        entries.add(EAU);
        entries.add(EST);
        entries.add(JAU);
        entries.add(OIS);
        entries.add(PAS);
        entries.add(UIS);
        entries.add(BASAL);
        entries.add(COROB);
        entries.add(COUNT);
        entries.add(FRAME);
        entries.add(LIBRA);
        entries.add(MOTIV);
        entries.add(RADIX);
        entries.add(REDUX);
        entries.add(SEVEN);
        entries.add(ALPHA);
        entries.add(BETA);
        entries.add(DELTA);
        entries.add(DIGAMMA);
        entries.add(EPSILON);
        entries.add(ETA);
        entries.add(GAMMA);
        entries.add(THETA);
        entries.add(ZETA);
        entries.add(DEATH);
        entries.add(GRACE);
        entries.add(INTERVENTION);
        entries.add(JUSTICE);
        entries.add(LISTEN);
        entries.add(MERCY);
        entries.add(SIN);
        entries.add(SPEAK);
        entries.add(DOWNGRADE);
        entries.add(RELENT);
        entries.add(REVERSE);
        entries.add(REWARD);
        entries.add(TRANSITION);
        entries.add(TRANSPIRE);
        entries.add(TRANSPORT);
        entries.add(UPKEEP);
        entries.add(UPSHOT);
        entries.add(ALEV);
        entries.add(CHEVIT);
        entries.add(DAVET);
        entries.add(GIVEL);
        entries.add(HEVAT);
        entries.add(LAVED);
        entries.add(TEVIT);
        entries.add(VET);
        entries.add(ZAVIN);
        entries.add(BUREAUCRAT);
        entries.add(CHANCELLOR);
        entries.add(COMMISSIONER);
        entries.add(MAGISTRATE);
        entries.add(ORATOR);
        entries.add(OVERSEER);
        entries.add(PRACTITIONER);
        entries.add(PRINCE);
        entries.add(VORTEX);
        entries.add(ENTIRE);
        entries.add(FIRE);
        entries.add(ICE);
        entries.add(INERT);
        entries.add(IRATE);
        entries.add(IRE);
        entries.add(PRICE);
        entries.add(SPINE);
        entries.add(SPIRE);
        entries.add(CNEGVNY);
        entries.add(FCNGVNY);
        entries.add(GEVGVNY);
        entries.add(GREGVNY);
        entries.add(NKVGVNY);
        entries.add(PEVGVNY);
        entries.add(VAVGVNY);
        entries.add(ZNMGVNY);
        entries.add(ZRAGVNY);
        entries.add(PUZZLE_ASPECT);
        entries.add(TOTAL_ASPECT);
        entries.add(BUILDING_ASPECT);
        entries.add(COMBAT_ASPECT);
        entries.add(AUTOMATION_ASPECT);
        entries.add(CORIOLIS);
        entries.add(CORIOLIS_NEXUS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PuzzleConsolidation.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PuzzleConsolidation.LOGGER.info("Registering Mod Items for " + PuzzleConsolidation.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}

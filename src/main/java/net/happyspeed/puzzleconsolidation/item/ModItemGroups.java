package net.happyspeed.puzzleconsolidation.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.happyspeed.puzzleconsolidation.PuzzleConsolidation;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PUZZLE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PuzzleConsolidation.MOD_ID, "puzzle"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.puzzlegroup"))
                    .icon(() -> new ItemStack(ModItems.VET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BA);
                        entries.add(ModItems.ER);
                        entries.add(ModItems.JIU);
                        entries.add(ModItems.LIU);
                        entries.add(ModItems.QI);
                        entries.add(ModItems.SAN);
                        entries.add(ModItems.SHI);
                        entries.add(ModItems.WU);
                        entries.add(ModItems.YI);
                        entries.add(ModItems.AIS);
                        entries.add(ModItems.AUXX);
                        entries.add(ModItems.AZH);
                        entries.add(ModItems.EAU);
                        entries.add(ModItems.EST);
                        entries.add(ModItems.JAU);
                        entries.add(ModItems.OIS);
                        entries.add(ModItems.PAS);
                        entries.add(ModItems.UIS);
                        entries.add(ModItems.BASAL);
                        entries.add(ModItems.COROB);
                        entries.add(ModItems.COUNT);
                        entries.add(ModItems.FRAME);
                        entries.add(ModItems.LIBRA);
                        entries.add(ModItems.MOTIV);
                        entries.add(ModItems.RADIX);
                        entries.add(ModItems.REDUX);
                        entries.add(ModItems.SEVEN);
                        entries.add(ModItems.ALPHA);
                        entries.add(ModItems.BETA);
                        entries.add(ModItems.DELTA);
                        entries.add(ModItems.DIGAMMA);
                        entries.add(ModItems.EPSILON);
                        entries.add(ModItems.ETA);
                        entries.add(ModItems.GAMMA);
                        entries.add(ModItems.THETA);
                        entries.add(ModItems.ZETA);
                        entries.add(ModItems.DEATH);
                        entries.add(ModItems.GRACE);
                        entries.add(ModItems.INTERVENTION);
                        entries.add(ModItems.JUSTICE);
                        entries.add(ModItems.LISTEN);
                        entries.add(ModItems.MERCY);
                        entries.add(ModItems.SIN);
                        entries.add(ModItems.WAGES);
                        entries.add(ModItems.SPEAK);
                        entries.add(ModItems.DOWNGRADE);
                        entries.add(ModItems.RELENT);
                        entries.add(ModItems.REVERSE);
                        entries.add(ModItems.REWARD);
                        entries.add(ModItems.TRANSITION);
                        entries.add(ModItems.TRANSPIRE);
                        entries.add(ModItems.TRANSPORT);
                        entries.add(ModItems.UPKEEP);
                        entries.add(ModItems.UPSHOT);
                        entries.add(ModItems.ALEV);
                        entries.add(ModItems.CHEVIT);
                        entries.add(ModItems.DAVET);
                        entries.add(ModItems.GIVEL);
                        entries.add(ModItems.HEVAT);
                        entries.add(ModItems.LAVED);
                        entries.add(ModItems.TEVIT);
                        entries.add(ModItems.VET);
                        entries.add(ModItems.ZAVIN);
                        entries.add(ModItems.BUREAUCRAT);
                        entries.add(ModItems.CHANCELLOR);
                        entries.add(ModItems.COMMISSIONER);
                        entries.add(ModItems.MAGISTRATE);
                        entries.add(ModItems.ORATOR);
                        entries.add(ModItems.OVERSEER);
                        entries.add(ModItems.PRACTITIONER);
                        entries.add(ModItems.PRINCE);
                        entries.add(ModItems.VORTEX);
                        entries.add(ModItems.ENTIRE);
                        entries.add(ModItems.FIRE);
                        entries.add(ModItems.ICE);
                        entries.add(ModItems.INERT);
                        entries.add(ModItems.IRATE);
                        entries.add(ModItems.IRE);
                        entries.add(ModItems.PRICE);
                        entries.add(ModItems.SPINE);
                        entries.add(ModItems.SPIRE);
                        entries.add(ModItems.CNEGVNY);
                        entries.add(ModItems.FCNGVNY);
                        entries.add(ModItems.GEVGVNY);
                        entries.add(ModItems.GREGVNY);
                        entries.add(ModItems.NKVGVNY);
                        entries.add(ModItems.PEVGVNY);
                        entries.add(ModItems.VAVGVNY);
                        entries.add(ModItems.ZNMGVNY);
                        entries.add(ModItems.ZRAGVNY);
                        entries.add(ModItems.PUZZLE_ASPECT);
                        entries.add(ModItems.COMBAT_ASPECT);
                        entries.add(ModItems.AUTOMATION_ASPECT);
                        entries.add(ModItems.BUILDING_ASPECT);
                        entries.add(ModItems.TOTAL_ASPECT);
                        entries.add(ModItems.CORIOLIS);
                        entries.add(ModItems.CORIOLIS_NEXUS);
                    }).build());


    public static void registerItemGroups() {
        PuzzleConsolidation.LOGGER.info("Registering Item Groups for " + PuzzleConsolidation.MOD_ID);
    }
}

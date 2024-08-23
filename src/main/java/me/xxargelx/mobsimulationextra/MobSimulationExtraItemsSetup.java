package me.xxargelx.mobsimulationextra;

import io.github.mooy1.infinityexpansion.items.mobdata.MobData;
import io.github.mooy1.infinityexpansion.items.mobdata.MobDataCard;
import io.github.mooy1.infinityexpansion.items.mobdata.MobDataTier;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class MobSimulationExtraItemsSetup {

        private MobSimulationExtraItemsSetup() {
        }

        public static void setup(@Nonnull MobSimulationExtra plugin)
        {
            new MobDataCard("Phantom", MobDataTier.ADVANCED, new ItemStack[]{
                    new ItemStack(Material.PHANTOM_MEMBRANE, 32), new ItemStack(Material.PHANTOM_MEMBRANE, 32), new ItemStack(Material.PHANTOM_MEMBRANE, 32),
                    new ItemStack(Material.PHANTOM_MEMBRANE, 32), MobData.EMPTY_DATA_CARD, new ItemStack(Material.PHANTOM_MEMBRANE, 32),
                    new ItemStack(Material.PHANTOM_MEMBRANE, 32), new ItemStack(Material.PHANTOM_MEMBRANE, 32), new ItemStack(Material.PHANTOM_MEMBRANE, 32),
            })
                    .addDrop(Material.PHANTOM_MEMBRANE, 1)
                    .addDrop(Material.ELYTRA, 2500)
                    .register(plugin);
            new MobDataCard("Pig", MobDataTier.PASSIVE, new ItemStack[]{
                    new ItemStack(Material.POTATO, 64), new ItemStack(Material.PORKCHOP, 64), new ItemStack(Material.CARROT, 64),
                    new ItemStack(Material.COOKED_PORKCHOP, 64), MobData.EMPTY_DATA_CARD, new ItemStack(Material.COOKED_PORKCHOP, 64),
                    new ItemStack(Material.CARROT, 64), new ItemStack(Material.PORKCHOP, 64), new ItemStack(Material.POTATO, 64),
            })
                    .addDrop(Material.PORKCHOP, 1)
                    .register(plugin);
            new MobDataCard("Piglin", MobDataTier.ADVANCED, new ItemStack[]{
                    new ItemStack(Material.GOLD_BLOCK, 64), new ItemStack(Material.GOLDEN_CARROT, 64), new ItemStack(Material.GOLD_BLOCK, 64),
                    new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1), MobData.EMPTY_DATA_CARD, new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1),
                    new ItemStack(Material.GOLD_BLOCK, 64), new ItemStack(Material.GOLDEN_CARROT, 64), new ItemStack(Material.GOLD_BLOCK, 64),
            })
                    .addDrop(Material.GOLD_INGOT, 1)
                    .addDrop(Material.GOLDEN_SWORD, 25)
                    .addDrop(Material.CROSSBOW, 50)
                    .addDrop(SlimefunItems.STRANGE_NETHER_GOO, 10)

                    .register(plugin);
            new MobDataCard("Ghast", MobDataTier.ADVANCED, new ItemStack[]{
                    new ItemStack(Material.GUNPOWDER, 64), new ItemStack(Material.GHAST_TEAR, 64), new ItemStack(Material.GUNPOWDER, 64),
                    new ItemStack(Material.GHAST_TEAR, 64), MobData.EMPTY_DATA_CARD, new ItemStack(Material.GHAST_TEAR, 64),
                    new ItemStack(Material.GUNPOWDER, 64), new ItemStack(Material.GHAST_TEAR, 64), new ItemStack(Material.GUNPOWDER, 64),
            })
                    .addDrop(Material.GHAST_TEAR, 1)
                    .register(plugin);
        }
    }
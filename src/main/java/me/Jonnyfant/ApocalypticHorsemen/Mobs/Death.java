package me.Jonnyfant.ApocalypticHorsemen.Mobs;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Death {

    public Death (Location location)
    {
        Horse deathHorse = (Horse) location.getWorld().spawnEntity(location, EntityType.HORSE);
        WitherSkeleton death = (WitherSkeleton) location.getWorld().spawnEntity(location,EntityType.WITHER_SKELETON);

        death.setCustomName("Death");
        death.setRemoveWhenFarAway(false);
        death.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 2147483647, 100));
        deathHorse.setRemoveWhenFarAway(false);
        deathHorse.setColor(Horse.Color.CREAMY);
        deathHorse.setStyle(Horse.Style.NONE);
        deathHorse.setCustomName("Death's Horse");
        deathHorse.addPassenger(death);
        deathHorse.setAdult();
        deathHorse.setTamed(true);
        deathHorse.getInventory().setSaddle(new ItemStack(Material.SADDLE,1));
        //deathHorse.getInventory().setArmor(new ItemStack(Material.DIAMOND_HORSE_ARMOR,1));

        ItemStack deathWeapon = new ItemStack(Material.NETHERITE_HOE,1);
        //deathWeapon.addEnchantment(Enchantment.DAMAGE_UNDEAD,5);
        ItemMeta deathWeaponItemMeta = deathWeapon.getItemMeta();
        deathWeaponItemMeta.setDisplayName(ChatColor.BLACK + "Death's Scythe");
        List<String> lore = new ArrayList<String>();
        lore.add(ChatColor.BLACK + "Death's Scythe");
        lore.add(ChatColor.BLACK + "Useless in the wrong hands.");
        lore.add(ChatColor.BLACK + "Immensely powerful in the hands of it's righteous owner.");
        deathWeaponItemMeta.setLore(lore);
        deathWeapon.setItemMeta(deathWeaponItemMeta);
        death.setCanPickupItems(false);
        death.getEquipment().setItemInMainHand(deathWeapon);
        death.getEquipment().setItemInMainHandDropChance(1);

        ItemStack deathArmor = new ItemStack(Material.ELYTRA,1);
        ItemMeta deathArmorItemMeta = deathArmor.getItemMeta();
        deathArmorItemMeta.setDisplayName("Death's Cloak");
        deathArmorItemMeta.setLore(Collections.singletonList("Death's Cloak"));
        deathArmor.setItemMeta(deathArmorItemMeta);
        death.setCanPickupItems(false);
        death.getEquipment().setChestplate(deathArmor);
        death.getEquipment().setChestplateDropChance(1);
    }
}

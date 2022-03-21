package me.Jonnyfant.ApocalypticHorsemen.Mobs;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class War {
    public War (Location location)
    {
        Horse warHorse = (Horse) location.getWorld().spawnEntity(location, EntityType.HORSE);
        Zombie war = (Zombie) location.getWorld().spawnEntity(location,EntityType.ZOMBIE);

        war.setCustomName("War");
        war.setRemoveWhenFarAway(false);
        warHorse.setColor(Horse.Color.CHESTNUT);
        warHorse.setStyle(Horse.Style.NONE);
        warHorse.setRemoveWhenFarAway(false);
        warHorse.setCustomName("War's Horse");
        warHorse.addPassenger(war);
        warHorse.setAdult();
        warHorse.setTamed(true);
        warHorse.getInventory().setSaddle(new ItemStack(Material.SADDLE,1));

        ItemStack warWeapon = new ItemStack(Material.NETHERITE_SWORD,1);
        warWeapon.addEnchantment(Enchantment.DAMAGE_UNDEAD,5);
        warWeapon.addEnchantment(Enchantment.DAMAGE_ALL,5);
        warWeapon.addEnchantment(Enchantment.DAMAGE_ARTHROPODS, 5);
        ItemMeta warWeaponItemMeta = warWeapon.getItemMeta();
        warWeaponItemMeta.setDisplayName(ChatColor.RED +  "War's Sword");
        warWeaponItemMeta.setLore(Collections.singletonList("War's Sword\nAs you lay hands on this and feel the immense power, you realize that it's curse is it's strength."));
        warWeapon.setItemMeta(warWeaponItemMeta);
        war.getEquipment().setItemInMainHand(warWeapon);
        war.getEquipment().setItemInMainHandDropChance(1);

        ItemStack warHead = new ItemStack(Material.GOLDEN_HELMET,1);
        ItemStack warChest = new ItemStack(Material.GOLDEN_CHESTPLATE,1);
        ItemStack warLegs = new ItemStack(Material.GOLDEN_LEGGINGS,1);
        ItemStack warShoes = new ItemStack(Material.GOLDEN_BOOTS,1);
        warHead.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,4);
        warChest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,4);
        warLegs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,4);
        warShoes.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,4);

        EntityEquipment warequipment = war.getEquipment();
        warequipment.setBoots(warShoes);
        warequipment.setBootsDropChance(0);
        warequipment.setLeggings(warLegs);
        warequipment.setLeggingsDropChance(0);
        warequipment.setChestplate(warChest);
        warequipment.setChestplateDropChance(0);
        warequipment.setHelmet(warHead);
        warequipment.setHelmetDropChance(0);
    }
}

package me.Jonnyfant.ApocalypticHorsemen.Mobs;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Skeleton;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class Famine {
    public Famine (Location location)
    {
        Horse famineHorse = (Horse) location.getWorld().spawnEntity(location, EntityType.HORSE);
        Skeleton famine = (Skeleton) location.getWorld().spawnEntity(location,EntityType.SKELETON);

        famine.setCustomName("Famine");
        famine.setRemoveWhenFarAway(false);
        famineHorse.setColor(Horse.Color.BLACK);
        famineHorse.setStyle(Horse.Style.NONE);
        famineHorse.setRemoveWhenFarAway(false);
        famineHorse.setCustomName("Famine's Horse");
        famineHorse.addPassenger(famine);
        famineHorse.setAdult();
        famineHorse.setTamed(true);
        famineHorse.getInventory().setSaddle(new ItemStack(Material.SADDLE,1));

        ItemStack famineWeapon = new ItemStack(Material.BOW,1);
        //famineWeapon.addEnchantment(Enchantment.DAMAGE_UNDEAD,5);
        ItemMeta famineWeaponItemMeta = famineWeapon.getItemMeta();
        famineWeaponItemMeta.setDisplayName("Famine's Bow");
        famineWeapon.setItemMeta(famineWeaponItemMeta);
        famine.getEquipment().setItemInMainHand(famineWeapon);
        famine.getEquipment().setItemInMainHandDropChance(0);

        ItemStack famineHead = new ItemStack(Material.DIAMOND_HELMET,1);
        famineHead.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,4);
        famineHead.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS,4);
        famineHead.addEnchantment(Enchantment.PROTECTION_FIRE,4);
        famineHead.addEnchantment(Enchantment.PROTECTION_PROJECTILE,4);
        ItemMeta famineHeadItemMeta = famineHead.getItemMeta();
        famineHeadItemMeta.setDisplayName("Famines Helmet");
        famineHeadItemMeta.setLore(Collections.singletonList("Famines Helmet\nConsumes food."));
        famineHead.setItemMeta(famineHeadItemMeta);
        famine.getEquipment().setHelmet(famineHead);
        famine.getEquipment().setHelmetDropChance(1);


        ItemStack famineArmor = new ItemStack(Material.DIAMOND_CHESTPLATE,1);
        famineArmor.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,4);
        famineArmor.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS,4);
        famineArmor.addEnchantment(Enchantment.PROTECTION_FIRE,4);
        famineArmor.addEnchantment(Enchantment.PROTECTION_PROJECTILE,4);
        ItemMeta famineArmorItemMeta = famineArmor.getItemMeta();
        famineArmorItemMeta.setDisplayName("Famines Chestplate");
        famineArmorItemMeta.setLore(Collections.singletonList("Famines Chestplate\nConsumes food."));
        famineArmor.setItemMeta(famineArmorItemMeta);
        famine.getEquipment().setChestplate(famineArmor);
        famine.getEquipment().setChestplateDropChance(1);

        ItemStack famineLeggings = new ItemStack(Material.DIAMOND_LEGGINGS,1);
        famineLeggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,4);
        famineLeggings.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS,4);
        famineLeggings.addEnchantment(Enchantment.PROTECTION_FIRE,4);
        famineLeggings.addEnchantment(Enchantment.PROTECTION_PROJECTILE,4);
        ItemMeta famineLeggingsItemMeta = famineLeggings.getItemMeta();
        famineLeggingsItemMeta.setDisplayName("Famines Leggings");
        famineLeggingsItemMeta.setLore(Collections.singletonList("Famines Leggings\nConsumes food."));
        famineLeggings.setItemMeta(famineLeggingsItemMeta);
        famine.getEquipment().setLeggings(famineLeggings);
        famine.getEquipment().setLeggingsDropChance(1);

        ItemStack famineBoots = new ItemStack(Material.DIAMOND_BOOTS,1);
        famineBoots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,4);
        famineBoots.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS,4);
        famineBoots.addEnchantment(Enchantment.PROTECTION_FIRE,4);
        famineBoots.addEnchantment(Enchantment.PROTECTION_PROJECTILE,4);
        ItemMeta famineBootsItemMeta = famineBoots.getItemMeta();
        famineBootsItemMeta.setDisplayName("Famines Boots");
        famineBootsItemMeta.setLore(Collections.singletonList("Famines Boots\nConsumes food."));
        famineBoots.setItemMeta(famineBootsItemMeta);
        famine.getEquipment().setBoots(famineBoots);
        famine.getEquipment().setBootsDropChance(1);
    }
}

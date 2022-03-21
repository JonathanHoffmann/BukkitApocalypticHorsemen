package me.Jonnyfant.ApocalypticHorsemen.Mobs;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Stray;
import org.bukkit.entity.ZombieHorse;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;

public class Pestilence {
    public Pestilence (Location location)
    {
        ZombieHorse pestilenceHorse = (ZombieHorse) location.getWorld().spawnEntity(location, EntityType.ZOMBIE_HORSE);
        Stray pestilence = (Stray) location.getWorld().spawnEntity(location,EntityType.STRAY);

        pestilence.setCustomName("Pestilence");
        pestilence.setRemoveWhenFarAway(false);
        pestilenceHorse.setRemoveWhenFarAway(false);
        pestilenceHorse.setCustomName("Pestilence's Horse");
        pestilenceHorse.addPassenger(pestilence);
        pestilenceHorse.setAdult();
        pestilenceHorse.setTamed(true);
        //pestilenceHorse.getInventory().setSaddle(new ItemStack(Material.SADDLE,1));

        ItemStack pestilenceWeapon = new ItemStack(Material.BOW,1);
        pestilenceWeapon.addEnchantment(Enchantment.ARROW_DAMAGE,5);
        pestilenceWeapon.addEnchantment(Enchantment.ARROW_FIRE,1);
        pestilenceWeapon.addEnchantment(Enchantment.ARROW_KNOCKBACK,2);

        /*
        ItemMeta pestilenceWeaponItemMeta = pestilenceWeapon.getItemMeta();
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "QuickShot", 3, AttributeModifier.Operation.MULTIPLY_SCALAR_1);
        AttributeModifier modifier2 = new AttributeModifier(UUID.randomUUID(), "QuickShot", 3, AttributeModifier.Operation.MULTIPLY_SCALAR_1);
        pestilenceWeaponItemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, modifier);
        pestilenceWeaponItemMeta.addAttributeModifier(Attribute.Generic, modifier2);
                pestilenceWeapon.setItemMeta(pestilenceWeaponItemMeta);
         */

        pestilence.getEquipment().setItemInMainHand(pestilenceWeapon);
        pestilence.getEquipment().setItemInMainHandDropChance(0);

        ItemStack pestilenceHead = new ItemStack(Material.CHAINMAIL_HELMET,1);
        ItemStack pestilenceChest = new ItemStack(Material.CHAINMAIL_CHESTPLATE,1);
        ItemStack pestilenceLegs = new ItemStack(Material.CHAINMAIL_LEGGINGS,1);
        ItemStack pestilenceShoes = new ItemStack(Material.CHAINMAIL_BOOTS,1);
        pestilenceHead.addEnchantment(Enchantment.THORNS,3);
        pestilenceChest.addEnchantment(Enchantment.THORNS,3);
        pestilenceLegs.addEnchantment(Enchantment.THORNS,3);
        pestilenceShoes.addEnchantment(Enchantment.THORNS,3);
        pestilenceHead.addEnchantment(Enchantment.DURABILITY,3);
        pestilenceChest.addEnchantment(Enchantment.DURABILITY,3);
        pestilenceLegs.addEnchantment(Enchantment.DURABILITY,3);
        pestilenceShoes.addEnchantment(Enchantment.DURABILITY,3);

        EntityEquipment pestilenceequipment = pestilence.getEquipment();
        pestilenceequipment.setBoots(pestilenceShoes);
        pestilenceequipment.setBootsDropChance(0);
        pestilenceequipment.setLeggings(pestilenceLegs);
        pestilenceequipment.setLeggingsDropChance(0);
        pestilenceequipment.setChestplate(pestilenceChest);
        pestilenceequipment.setChestplateDropChance(0);
        pestilenceequipment.setHelmet(pestilenceHead);
        pestilenceequipment.setHelmetDropChance(0);
    }
}

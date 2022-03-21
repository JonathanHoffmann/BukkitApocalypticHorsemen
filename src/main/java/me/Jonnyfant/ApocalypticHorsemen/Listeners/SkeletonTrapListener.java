package me.Jonnyfant.ApocalypticHorsemen.Listeners;

import me.Jonnyfant.ApocalypticHorsemen.Mobs.Death;
import me.Jonnyfant.ApocalypticHorsemen.Mobs.Famine;
import me.Jonnyfant.ApocalypticHorsemen.Mobs.Pestilence;
import me.Jonnyfant.ApocalypticHorsemen.Mobs.War;
import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Collections;
import java.util.Random;


public class SkeletonTrapListener implements Listener {
    public int chance=100;

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerDeath(EntitySpawnEvent e) {
        if(e.getEntity() instanceof SkeletonHorse)
        {
            Random random = new Random();
            if(random.nextInt(100)<=chance)
            {
                //Spawn
                spawnHorsemen(e.getEntity().getLocation());
            }
        }
    }

    public void spawnHorsemen(Location location)
    {
        Death death = new Death(location);
        Pestilence pestilence = new Pestilence(location);
        War war = new War(location);
        Famine famine = new Famine(location);
        Bukkit.broadcastMessage(ChatColor.RED + "The 4 horsemen of the apocalypse have spawned!");
    }
}
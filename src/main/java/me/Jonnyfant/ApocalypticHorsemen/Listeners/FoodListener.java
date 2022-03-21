package me.Jonnyfant.ApocalypticHorsemen.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Collections;
import java.util.Random;

public class FoodListener implements Listener {
    @EventHandler(priority = EventPriority.LOW)
    public void onPlayerLooseHunger(FoodLevelChangeEvent e) {
        Player p = (Player) e.getEntity();
        ItemStack head = p.getInventory().getHelmet();
        ItemStack armor = p.getInventory().getChestplate();
        ItemStack leggins = p.getInventory().getLeggings();
        ItemStack shoes = p.getInventory().getBoots();

        try {
            if (head.getItemMeta().getLore().equals(Collections.singletonList("Famines Helmet\nConsumes food."))) {
                hunger(p);
            }
        } catch (Exception exception) {
        }
        try {
            if (armor.getItemMeta().getLore().contains("Famine's Chesplate")) {
                hunger(p);
            }
        } catch (Exception exception) {
        }
        try {
            if (leggins.getItemMeta().getLore().equals(Collections.singletonList("Famines Leggings\nConsumes food."))) {
                hunger(p);
            }
        } catch (Exception exception) {
        }
        try {
            if (shoes.getItemMeta().getLore().equals(Collections.singletonList("Famines Boots\nConsumes food."))) {
                hunger(p);
            }
        } catch (Exception exception) {
        }
    }

    public void hunger(Player p) {
        p.sendMessage("Chance to get hungry");
        Random random = new Random();
        if (random.nextInt(100) < 20) {

            p.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 60, 1));

        }
    }
}

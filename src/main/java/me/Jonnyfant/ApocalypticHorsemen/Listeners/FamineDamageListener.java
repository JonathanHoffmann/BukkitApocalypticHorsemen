package me.Jonnyfant.ApocalypticHorsemen.Listeners;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FamineDamageListener implements Listener {
    @EventHandler(priority = EventPriority.LOW)
    public void onPlayerDamageFamine(EntityDamageByEntityEvent e) {
        try {
            if (e.getDamager().getCustomName().equals("Famine")) {
                LivingEntity damaged = (LivingEntity) e.getEntity();
                damaged.sendMessage("You have been damaged by Famine");
                damaged.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 200, 5));
            }
        }
        catch (Exception ex)
        {

        }
    }
}

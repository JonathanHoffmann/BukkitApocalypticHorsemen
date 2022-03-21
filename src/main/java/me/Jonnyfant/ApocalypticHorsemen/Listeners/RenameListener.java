package me.Jonnyfant.ApocalypticHorsemen.Listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.PlayerInventory;

public class RenameListener implements Listener {
    String [] nonRenamable = {"Death", "War","Famine","Pestilence","Death's Horse","War's Horse","Famine's Horse","Pestilence's Horse"};
    @EventHandler(priority = EventPriority.LOW)
    public void PlayerRenameEntity(PlayerInteractEntityEvent e) {
        PlayerInventory inventory = e.getPlayer().getInventory();
        if(inventory.getItemInMainHand().getType().equals(Material.NAME_TAG) || inventory.getItemInOffHand().getType().equals(Material.NAME_TAG))
        {
            e.getPlayer().sendMessage("Player has a nametag");
            for(String nope : nonRenamable)
            {
                if(e.getRightClicked().getCustomName().equals(nope))
                {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage("You cannot rename the horsemen or their horses.");
                }
            }
        }
    }
}


//TODO not yet working
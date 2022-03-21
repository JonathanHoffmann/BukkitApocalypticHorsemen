package me.Jonnyfant.ApocalypticHorsemen;

import me.Jonnyfant.ApocalypticHorsemen.Listeners.FamineDamageListener;
import me.Jonnyfant.ApocalypticHorsemen.Listeners.FoodListener;
import me.Jonnyfant.ApocalypticHorsemen.Listeners.RenameListener;
import me.Jonnyfant.ApocalypticHorsemen.Listeners.SkeletonTrapListener;
import org.bukkit.plugin.java.JavaPlugin;

public class ApocalypticHorsemen extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SkeletonTrapListener(),this);
        getServer().getPluginManager().registerEvents(new FamineDamageListener(),this);
        getServer().getPluginManager().registerEvents(new FoodListener(),this);
        getServer().getPluginManager().registerEvents(new RenameListener(),this);
    }
}

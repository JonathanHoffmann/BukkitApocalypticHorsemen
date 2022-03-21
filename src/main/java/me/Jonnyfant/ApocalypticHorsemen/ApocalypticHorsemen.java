package me.Jonnyfant.ApocalypticHorsemen;

import me.Jonnyfant.ApocalypticHorsemen.Listeners.SkeletonTrapListener;
import org.bukkit.plugin.java.JavaPlugin;

public class ApocalypticHorsemen extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SkeletonTrapListener(),this);
    }
}

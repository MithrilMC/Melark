package me.melani.melark;

import org.bukkit.plugin.java.JavaPlugin;

public final class Melark extends JavaPlugin {

    @Override
    public void onEnable() {
        long startTime = System.currentTimeMillis();

        // Plugin startup logic
        long enableTime = System.currentTimeMillis() - startTime;
        getLogger().info("Melark plugin has been enabled! (Took " + enableTime + "ms)");
    }

    @Override
    public void onDisable() {
        long disableStartTime = System.currentTimeMillis();

        // Plugin shutdown logic
        long disableTime = System.currentTimeMillis() - disableStartTime;
        getLogger().info("Melark plugin has been disabled! (Took " + disableTime + "ms)");
    }
}
package me.melani.melark;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;

public final class Melark extends JavaPlugin {
    private final Logger log = getLogger();

    @Override
    public void onEnable() {
        logTimedMessage("enabled");
    }

    @Override
    public void onDisable() {
        logTimedMessage("disabled");
    }

    private void logTimedMessage(String state) {
        long startTime = System.currentTimeMillis();
        long duration = System.currentTimeMillis() - startTime;
        log.info(String.format("%s has been %s! (Took %dms)", getName(), state, duration));
    }
}
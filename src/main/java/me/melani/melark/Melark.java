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
        long startTime = System.nanoTime();
        long duration = (System.nanoTime() - startTime) / 1000;
        log.info(String.format("%s has been %s! (Took %.3fms)", getName(), state, duration / 1000.0));
    }
}
package me.mrlukey676.whereis;

import me.mrlukey676.whereis.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class WhereIs extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("WhereIs is enabled!");
        getCommand("whereis").setExecutor(new whereis());
        getCommand("wicoords").setExecutor(new wicoords());
        getCommand("wiworld").setExecutor(new wiworld());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("WhereIs is disabled!");
    }
}

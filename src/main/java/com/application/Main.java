package com.application;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin enabled.");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerJoinEvent(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin disabled.");
    }



}
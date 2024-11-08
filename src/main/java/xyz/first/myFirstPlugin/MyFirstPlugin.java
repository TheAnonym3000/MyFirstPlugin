package xyz.first.myFirstPlugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.first.myFirstPlugin.cmd.PingCmd;
import xyz.first.myFirstPlugin.listeners.onInteract;

public final class MyFirstPlugin extends JavaPlugin {

    public static void log(String text) {
        // Write into the log
        Bukkit.getConsoleSender().sendMessage(text);
    }

    public static void chat(String text) {
        //Write into the chat
        Bukkit.broadcastMessage(text);
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        register();

        log("Started MyFirstPlugin");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        log("Stopped MyFirstPlugin");
    }

    private void register() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        Bukkit.getPluginCommand("ping").setExecutor(new PingCmd());
        pluginManager.registerEvents(new onInteract(), this);
    }

}
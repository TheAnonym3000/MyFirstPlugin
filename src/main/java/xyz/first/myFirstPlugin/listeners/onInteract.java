package xyz.first.myFirstPlugin.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import static xyz.first.myFirstPlugin.MyFirstPlugin.chat;

public class onInteract implements Listener {
    @EventHandler
    private void onEvent(PlayerInteractEntityEvent event) {
        chat("You have interacted with something. Maybe you wanted to know what it is. Anyway, here is the data:");
        chat("This is the UUID of the right clicked entity:");
        chat(event.getRightClicked().getUniqueId().toString());
        chat("Here the data:");
        chat(event.getPlayer().getMetadata(event.getRightClicked().toString()).toString());
    }
}
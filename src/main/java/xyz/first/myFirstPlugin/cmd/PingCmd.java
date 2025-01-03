package xyz.first.myFirstPlugin.cmd;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PingCmd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player;
        try {
            if (strings.length > 0) {
                player = Bukkit.getPlayer(strings[0]);
            } else {
                if (commandSender instanceof Player) {
                    player = (Player) commandSender;
                } else {
                    commandSender.sendMessage("§4One argument required!");
                    return true;
                }
            }
            assert player != null;
            commandSender.sendMessage("The ping of player §e" + player.getName() + "§r is §a" + player.getPing());
            return true;
        }
        catch (Exception e) {
            commandSender.sendMessage("§4This player is not online!");
            return false;
        }
    }
}
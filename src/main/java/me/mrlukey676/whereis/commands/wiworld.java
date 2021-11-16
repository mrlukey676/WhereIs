package me.mrlukey676.whereis.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;

public class wiworld implements CommandExecutor {
    public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player) {
            if (player.hasPermission("whereis.world")) {
                if (args.length == 0) {
                    player.sendMessage("§aYou are in " + player.getWorld().getName());
                }else{
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if (target == null) {
                        player.sendMessage("§cPlayer not found");
                    }else{
                        player.sendMessage("§a" + target.getName() + " is in " + target.getWorld().getName());
                    }
                }
            }
        }
        return false;
    }
}

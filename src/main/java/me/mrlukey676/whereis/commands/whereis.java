package me.mrlukey676.whereis.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;

public class whereis implements CommandExecutor {
    public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player) {
            if (player.hasPermission("whereis.whereis")) {
                if (args.length == 0) {
                    player.sendMessage("§cUsage: /whereis <player>");
                }else{
                    Player target = Bukkit.getPlayerExact(args[0]);
                    if (target == null) {
                        player.sendMessage("§cPlayer not found.");
                    }else{
                        player.sendMessage("§a" + target.getDisplayName() + " is at " + target.getLocation().getX() + ", " + target.getLocation().getY() + ", " + target.getLocation().getZ() + " in the world " + target.getLocation().getWorld().getName());
                    }

                }
            }else{
                player.sendMessage("§cYou do not have permission to use this command.");
            }

        }
        return false;
    }
}

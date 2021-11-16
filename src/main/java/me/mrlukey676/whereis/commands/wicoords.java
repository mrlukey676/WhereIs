package me.mrlukey676.whereis.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class wicoords implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player) {
            if (args.length == 0) {
                if (player.hasPermission("whereis.coords.self")) {
                    player.sendMessage("§aYour coordinates are " + player.getLocation().getX() + "," + player.getLocation().getY() + "," + player.getLocation().getZ());
                }else{
                    player.sendMessage("§cYou do not have permission to use this command.");
                }
            }else{
                if (player.hasPermission("whereis.coords.others")) {
                    Player target = Bukkit.getPlayerExact(args[0]);
                    player.sendMessage("§a" + target.getDisplayName() + "'s coordinates are " + target.getLocation().getX() + "," + target.getLocation().getY() + "," + target.getLocation().getZ());
                }else{
                    player.sendMessage("§cYou do not have permission to use this command.");
                }
            }
        }
        return false;
    }
}

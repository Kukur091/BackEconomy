package fr.kukur.backEconomy;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;

public class BackCommand implements CommandExecutor {

    private Main plugin;

    public BackCommand(Main plugin){
        this.plugin = plugin;
    }

    @java.lang.Override
    public boolean onCommand(CommandSender sender, Command command, java.lang.String s, java.lang.String[] strings) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            double balance = Main.getEconomy().getBalance(player);
            if (balance > this.plugin.getConfig().getDouble("price") && EventListener.getDeathloc() != null){
                player.teleport(EventListener.getDeathloc());
                player.sendMessage(this.plugin.getConfig().getString("success-message"));
                Main.getEconomy().withdrawPlayer(player,this.plugin.getConfig().getDouble("price"));
            } else
            player.sendMessage(this.plugin.getConfig().getString("error-message"));
        }

        return true;
    }
}

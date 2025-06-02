package fr.kukur.backEconomy;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Economy economy;
    @Override
    public void onEnable() {
        getServer().getPluginCommand("back").setExecutor(new BackCommand(this));
        economy = getServer().getServicesManager().getRegistration(Economy.class).getProvider();
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {

    }

    public static Economy getEconomy() {
        return economy;
    }
}

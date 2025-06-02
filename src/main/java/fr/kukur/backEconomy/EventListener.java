package fr.kukur.backEconomy;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class EventListener implements Listener {

    private static Location deathloc;
    @EventHandler
    public void onDeath(PlayerDeathEvent event){
        deathloc = event.getEntity().getLocation();
    }

    public static Location getDeathloc() {
        return deathloc;
    }
}

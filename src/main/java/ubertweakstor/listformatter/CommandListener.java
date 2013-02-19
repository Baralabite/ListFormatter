/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ubertweakstor.listformatter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

/**
 *
 * @author John
 */
public class CommandListener implements Listener {
    
    ListFormatter parent;
    
    CommandListener(ListFormatter instance){
        parent = instance;
    }
    
    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent event){
        if (event.getMessage().startsWith("/who") || event.getMessage().startsWith("/list")){
            event.setCancelled(true);
            parent.executeListCommand(event.getPlayer());
        }        
    }    
}

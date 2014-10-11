package me.morccrafak.infoHRACA;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class majnka extends JavaPlugin {
public final Logger l = Logger.getLogger("Minecraft");
	
	public void onEnable() {
		l.info("[Zakladne Prikazy] Nacitavanie Zakladneho Pluginu!");

	
	}
	
	public void onDisable() {
		l.info("[Zakladne Prikazy] Vypinanie Zakladneho Pluginu!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player hrac = (Player) sender;
		if(commandLabel.equalsIgnoreCase("info")){

			   l.info("[Zakladne Prikazy] Hrac " + hrac.getName() + " vykonal prikaz /info  .");
			   hrac.sendMessage(ChatColor.AQUA + "==" + ChatColor.GOLD  + "Expy EXPERIMENTAL:" + hrac.getExp());
			   hrac.sendMessage(ChatColor.AQUA + "==" + ChatColor.GOLD  + "GameMode:" + hrac.getGameMode());
			   hrac.sendMessage(ChatColor.AQUA + "==" + ChatColor.GOLD  + "Meno:" + hrac.getName());
			   hrac.sendMessage(ChatColor.AQUA + "==" + ChatColor.GOLD  + "Vec v ruke:" + hrac.getItemInHand());

		}
		return false;
		
	}
		

}
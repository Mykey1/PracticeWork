package io.github.Mykey1.practicework;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class practicework extends JavaPlugin {
	@Override
	public void onEnable() {

	}

	@Override
	public void onDisable() {

	}

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (cmd.getName().equalsIgnoreCase("basic")) { // If the player typed
														// /basic then do the
														// following...
			// doSomething
			return true;
		} // If this happened function returns true.
			// If this hasn't happened the false value will return.
		return false;
	}
}
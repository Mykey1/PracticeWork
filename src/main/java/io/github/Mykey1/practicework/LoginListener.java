package io.github.Mykey1.practicework;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerLoginEvent;

public final class LoginListener implements Listener {
	public LoginListener(LoginPlugin plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void normalLogin(PlayerLoginEvent event) {
		// Your code here...
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void highLogin(PlayerLoginEvent event) {

	}
}

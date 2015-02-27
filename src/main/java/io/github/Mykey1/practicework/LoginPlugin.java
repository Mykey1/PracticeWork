package io.github.Mykey1.practicework;

import org.bukkit.plugin.java.JavaPlugin;

public final class LoginPlugin extends JavaPlugin {
	public void onEnable() {
		new LoginListener(this);
	}
}
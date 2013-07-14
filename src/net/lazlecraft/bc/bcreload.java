package net.lazlecraft.bc;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Command;

public class bcreload extends Command {
	
	BasicCommands plugin;

	public bcreload(BasicCommands plugin) {
		super("bcreload");
		this.plugin = plugin;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(CommandSender sender, String[] args) {
		if (ProxyServer.getInstance().getConfigurationAdapter().getBoolean("online_mode",true)) {
		if (sender.hasPermission("basiccommands.reload")) {
			plugin.reloadConfig();
			sender.sendMessage(ChatColor.GREEN + "BasicCommands Reloaded!");
		}
		// TODO Auto-generated method stub
		}
	}

}

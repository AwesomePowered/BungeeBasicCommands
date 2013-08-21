package net.lazlecraft.basiccommands.Commands;

import java.util.List;

import net.lazlecraft.basiccommands.BasicCommands;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Command;

public class WebsiteCommand extends Command {
	
	public WebsiteCommand(BasicCommands plugin) {
		super("website");
		this.plugin = plugin;
		// TODO Auto-generated constructor stub
	}

	BasicCommands plugin;

	@Override
	public void execute(CommandSender sender, String[] arg1) {
		if (ProxyServer.getInstance().getConfigurationAdapter().getBoolean("online_mode",true)) {
		List <String> website = plugin.getConfig().getStringList("website");
		for (String str : website)
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', str));
		}
	}
}

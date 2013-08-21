package net.lazlecraft.basiccommands.Commands;

import java.util.List;

import net.lazlecraft.basiccommands.BasicCommands;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Command;

public class DonateCommand extends Command {
	
	public DonateCommand(BasicCommands plugin) {
		super("donate");
		this.plugin = plugin;
		// TODO Auto-generated constructor stub
	}

	BasicCommands plugin;

	@Override
	public void execute(CommandSender sender, String[] arg1) {
		if (ProxyServer.getInstance().getConfigurationAdapter().getBoolean("online_mode",true)) {
		List <String> donate = plugin.getConfig().getStringList("donate");
		for (String str : donate)
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', str));
		}
	}
}

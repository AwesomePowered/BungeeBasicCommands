package net.lazlecraft.basiccommands.Commands;

import java.util.List;

import net.lazlecraft.basiccommands.BasicCommands;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Command;

public class VoteCommand extends Command {
	
	public VoteCommand(BasicCommands plugin) {
		super("vote");
		this.plugin = plugin;
		// TODO Auto-generated constructor stub
	}

	BasicCommands plugin;

	@Override
	public void execute(CommandSender sender, String[] arg1) {
		if (ProxyServer.getInstance().getConfigurationAdapter().getBoolean("online_mode",true)) {
		List <String> vote = plugin.getConfig().getStringList("vote");
		for (String str : vote)
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', str));
		}
	}
}

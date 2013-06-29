package net.lazlecraft.bc;

import java.util.List;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class vote extends Command {
	
	public vote(BasicCommands plugin) {
		super("vote");
		this.plugin = plugin;
		// TODO Auto-generated constructor stub
	}

	BasicCommands plugin;

	@Override
	public void execute(CommandSender sender, String[] arg1) {
		List <String> vote = plugin.getConfig().getStringList("vote");
		for (String str : vote)
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', str));plugin.GFYS();
	}

}

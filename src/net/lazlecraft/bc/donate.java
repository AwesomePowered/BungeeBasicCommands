package net.lazlecraft.bc;

import java.util.List;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class donate extends Command {
	
	public donate(BasicCommands plugin) {
		super("donate");
		this.plugin = plugin;
		// TODO Auto-generated constructor stub
	}

	BasicCommands plugin;

	@Override
	public void execute(CommandSender sender, String[] arg1) {
		List <String> donate = plugin.getConfig().getStringList("donate");
		for (String str : donate)
			sender.sendMessage(ChatColor.translateAlternateColorCodes('&', str));plugin.GFYS();
	}
}

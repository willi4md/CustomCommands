package firstCommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class CommandHello implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		//if the sender of the command is a Player, not a command block, not a plugin, etc..
		if (sender instanceof Player) {
			
			String username = sender.getName();
			Player person = (Player) sender;
			person.sendMessage("Hello " + username);
			//person.
		}
		
		return true;
	}

}

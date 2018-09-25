package firstCommands;

import java.util.Scanner;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.conversations.Conversation;
import org.bukkit.entity.Player;

public class CommandLordMatt implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (sender instanceof Player) {
			
			//typecasting a new user with the given sender player.
			Player user = (Player) sender;
			
			user.teleport(user.getWorld().getSpawnLocation());
			user.sendMessage("You've been teleported to spawn!");
		}
		return true;
	}

}

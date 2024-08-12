package psn.myplugin2;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class MainCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (strings.length == 1 && strings[0].equals("about")) {
            commandSender.sendMessage("MyPlugin v1.0 By Yunluoyuqiu");
            return true;
        }
        if (strings.length == 1 && strings[0].equals("help")) {
            commandSender.sendMessage("=== MyPlugin v1.0 ===");
            commandSender.sendMessage("     Plugin Help     ");
            commandSender.sendMessage("/gm - Change your gamemode");
            commandSender.sendMessage("/rubbish - open a rubbish bin");
            commandSender.sendMessage("/bin - open a rubbish bin");
            commandSender.sendMessage("/rubbishbin - open a rubbish bin");
            return true;
        }
        return false;
    }
}

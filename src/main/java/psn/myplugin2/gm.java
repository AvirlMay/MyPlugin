package psn.myplugin2;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class gm implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        String gm = strings[0];
        Player cmdsender = (Player) commandSender;
        if (gm.equals("help")){
            commandSender.sendMessage("=== MyPlugin v1.0 ===");
            commandSender.sendMessage("     /gm   help      ");
            commandSender.sendMessage("/gm [gamemode]");
            commandSender.sendMessage("supported gamemode list:");
            commandSender.sendMessage("0 - survival mode\nsurvival - survival mode\ns - survival mode");
            commandSender.sendMessage("1 - creative mode\ncreative - creative mode\nc - creative mode");
            commandSender.sendMessage("2 - adventure mode\nadventure - adventure mode\na - adventure mode");
            commandSender.sendMessage("3 - spectator mode\nspectator - spectator mode");
        }
        if (gm.equals("0") || gm.equals("survival") || gm.equals("s")){
            cmdsender.setGameMode(GameMode.SURVIVAL);
            return true;
        }
        if (gm.equals("1") || gm.equals("creative") || gm.equals("c")){
            cmdsender.setGameMode(GameMode.CREATIVE);
            return true;
        }
        if (gm.equals("2") || gm.equals("adventure") || gm.equals("a")){
            cmdsender.setGameMode(GameMode.ADVENTURE);
            return true;
        }
        if (gm.equals("3") || gm.equals("spectator")){
            cmdsender.setGameMode(GameMode.SPECTATOR);
            return true;
        }
        return false;
    }
}

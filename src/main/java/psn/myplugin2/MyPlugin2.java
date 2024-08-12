package psn.myplugin2;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyPlugin2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Starting up MyPlugin v1.0");
        Bukkit.getPluginCommand("myplugin").setExecutor(new MainCommand());
        Bukkit.getPluginCommand("gm").setExecutor(new gm());
        Bukkit.getPluginCommand("opinv").setExecutor(new opinv());
        Bukkit.getPluginCommand("openrubbishbin").setExecutor(new openrubbishbin());
        System.out.println("Started up Myplugin v1.0");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Shutting down MyPlugin v1.0");
    }
}

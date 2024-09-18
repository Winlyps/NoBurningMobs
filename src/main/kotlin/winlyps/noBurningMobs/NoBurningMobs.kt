package winlyps.noBurningMobs

import org.bukkit.plugin.java.JavaPlugin

class NoBurningMobs : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(NoBurningMobsListener(this), this)
        logger.info("NoBurningMobs plugin has been enabled.")
    }

    override fun onDisable() {
        logger.info("NoBurningMobs plugin has been disabled.")
    }
}
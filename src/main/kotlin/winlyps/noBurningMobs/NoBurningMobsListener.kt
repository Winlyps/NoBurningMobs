package winlyps.noBurningMobs

import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityCombustEvent

class NoBurningMobsListener(private val plugin: NoBurningMobs) : Listener {

    @EventHandler
    fun onEntityCombust(event: EntityCombustEvent) {
        // Check if the entity is a mob and if it's combusting due to sunlight
        if (event.entityType in EntityType.values().filter { it.isAlive && it.isSpawnable }) {
            event.isCancelled = true
        }
    }
}
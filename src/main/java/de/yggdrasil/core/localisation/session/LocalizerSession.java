package de.yggdrasil.core.localisation.session;

import java.util.UUID;
import net.minestom.server.entity.Player;

public class LocalizerSession {

    private final UUID targetUUID;

    public LocalizerSession(Player target){
        targetUUID = target.getUuid();
    }

}

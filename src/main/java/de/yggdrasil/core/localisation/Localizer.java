package de.yggdrasil.core.localisation;

import de.yggdrasil.core.localisation.session.LocalizerSession;
import net.minestom.server.entity.Player;

public class Localizer {

    public String localize (String identifier, Player target){
        return "";
    }

    public LocalizerSession createSession(Player player){
        return new LocalizerSession(player);
    }

}

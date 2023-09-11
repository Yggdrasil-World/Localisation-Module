package de.yggdrasil.core.localisation.session;

import net.minestom.server.entity.Player;

public class LocalizerSession {

    private final Player target;
    private final String locale;

    public LocalizerSession(Player target, String locale){
        this.target = target;
        this.locale = locale;
    }

    public Player getTarget() {
        return target;
    }

    public String getLocale() {
        return locale;
    }

}
